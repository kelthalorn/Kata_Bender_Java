package bender;

import java.util.ArrayList;

import bender.BenderMap;

public class BenderManager {
    private static Cell[][] grid;
	private static Bender bender;
	private static boolean directionInversed;
	private static Direction currentDirection;
	private static boolean benderDead;
    private static ArrayList<String> moves;
    private BenderMap map;
    
    public BenderManager(BenderMap map) {
        moves = new ArrayList<String>();
        benderDead = false;
        directionInversed = false;
        currentDirection = Direction.SOUTH;
        this.map = map;
        grid = new Cell[map.getWidth()][map.getHeight()];

        for (int i = 0; i < map.getHeight(); i++) {
            initGridRow(i, map.getRow(i));
        }
    }

    private void initGridRow(int index, String row) {
    	char[] currentRowDatas = row.toCharArray();
        for (int i = 0; i < this.map.getWidth(); i++) {

        	Cell currentCell = new Cell(i, i);
            switch (currentRowDatas[i]) {
                case '#':	currentCell.setWall();
                    		break;
                case '@':	currentCell.setEntry();
                    		currentCell.setVisited();
                    		initBender(i,index);
                			break;
                case '$':	currentCell.setExit();
                			break;
                case 'X':	currentCell.setBlock();
                    		break;
                case 'B':	currentCell.setBeer();
                    		break;
                case 'T':	currentCell.setTeleporter();
                    		break;
                case 'I':	currentCell.setInverser();
		                    break;
                case 'S':	currentCell.setDirctional('S');
		                    break;
                case 'N':	currentCell.setDirctional('N');
		                    break;
                case 'W':	currentCell.setDirctional('W');
		                    break;
                case 'E':	currentCell.setDirctional('E');
		                    break;

                default:	currentCell.setEmpty();
		                    break;
            }
            
            setCellInGrid(i, index, currentCell);
        }
    }

    public void initBender(int posX, int posY) {
        bender = new Bender(posX, posY);
    }

    public int getBenderPosX() {
        return bender.getPosX();
    }

    public int getBenderPosY() {
        return bender.getPosY();
    }

    public void updateBenderPosition(int newPosX, int newPosY) {
        bender.setPosX(newPosX);
        bender.setPosY(newPosY);
    }

    public void setCellInGrid(int posX, int posY, Cell cell) {
        grid[posX][posY] = cell;
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public Cell getCellInGrid(int posX, int posY) {
        return grid[posX][posY];
    }

	public void updateCycle() {

        Cell currentCell = grid[getBenderPosX()][getBenderPosY()];
        try {
            if (checkForNextAccessibleCellAndUpdateDirectionIfNecessary(currentCell)) {
                switch (currentDirection) {
                    case NORTH: bender.setPosY(getBenderPosY()-1);
                                moves.add(Direction.NORTH.getName());
                                break;
                    case SOUTH: bender.setPosY(getBenderPosY()+1);
                                moves.add(Direction.SOUTH.getName());    
                                break;
                    case WEST : bender.setPosX(getBenderPosX()-1);
                                moves.add(Direction.WEST.getName());
                                break;
                    case EAST : bender.setPosX(getBenderPosX()+1);
                                moves.add(Direction.EAST.getName());
                                break;
                }
            }
        } catch (Exception e) {
            throw e;
        }
	}

    private boolean checkForNextAccessibleCellAndUpdateDirectionIfNecessary(Cell currentCell) {

        int numberOfDirectionChecked = 0;
        boolean foundNextCell = false;
        Cell nextCell = currentCell;

        while (!foundNextCell && numberOfDirectionChecked != 4) {
            switch(currentDirection) {
                case NORTH: nextCell = grid[currentCell.getPosX()][currentCell.getPosY()-1];
                            break;
                case SOUTH: nextCell = grid[currentCell.getPosX()][currentCell.getPosY()+1];
                            break;
                case WEST : nextCell = grid[currentCell.getPosX()-1][currentCell.getPosY()];
                            break;
                case EAST : nextCell = grid[currentCell.getPosX()+1][currentCell.getPosY()];
                            break;
            }
    
            if (nextCell.isVisitable(bender)) {
                return true;
            }
    
            if (!directionInversed) {
                if (currentDirection.getIndex() == Direction.values().length-1) {
                    currentDirection = Direction.VALUES[0];
                } else {
                    currentDirection = Direction.VALUES[currentDirection.getIndex()+1];
                }            
            } else {
                if (currentDirection.getIndex() == 0) {
                    currentDirection = Direction.VALUES[Direction.values().length-1];
                } else {
                    currentDirection = Direction.VALUES[currentDirection.getIndex()-1];
                }            
            }
            
            numberOfDirectionChecked++;
        }

        return false;
    }

    public void debugBenderMap() {
    	//DEBUG BenderMap
        for (int j = 0; j < map.getHeight(); j++) {
            String line = "";
            for (int i = 0; i < map.getWidth(); i++) {
                Cell currentCell = getCellInGrid(i, j);
                if (getBenderPosX() == i && getBenderPosY() == j)
                    line += "P";
                else {
                    switch(currentCell.getCellType()) {
                        case WALL :		line += "#";
                                        break;
                        case ENTRY :	line += "@";
                                        break;
                        case EXIT :		line += "$";
                                        break;
                        case BLOCK :	line += "X";
                                        break;
                        case BEER :		line += "B";
                                        break;
                        case TELEPORTER:line += "T";
                                        break;
                        case INVERSER :	line += "I";
                                        break;
                        case DIR_NORTH :line += "N";
                                        break;
                        case DIR_SOUTH :line += "S";
                                        break;
                        case DIR_WEST :	line += "W";
                                        break;
                        case DIR_EAST :	line += "E";
                                        break;
                        default :		line += " ";
                                        break;
                    }
                }
            }
            System.err.println(line);
        }
    }
}