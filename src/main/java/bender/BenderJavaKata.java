package bender;

import bender.BenderManager;
import bender.Cell;

public class BenderJavaKata {
    
    private static int WIDTH_MAP_1 = 6;
	private static int HEIGHT_MAP_1 = 5;
	private static String[] ROWS_1 = {
        "######",
        "#@E $#",
        "# N  #",
        "#X   #",
        "######"
    };
    
    private static int WIDTH_MAP_2 = 15;
	private static int HEIGHT_MAP_2 = 15;
    private static String[] ROWS_2 = {
        "###############",
        "#      IXXXXX #",
        "#  @          #",
        "#             #",
        "#             #",
        "#  I          #",
        "#  B          #",
        "#  B   S     W#",
        "#  B   T      #",
        "#             #",
        "#         T   #",
        "#         B   #",
        "#            $#",
        "#        XXXX #",
        "###############"
    };

    private static int WIDTH_MAP_3 = 10;
	private static int HEIGHT_MAP_3 = 10;
    private static String[] ROWS_3 = {
        "##########",
        "#        #",
        "#  @     #",
        "#  B     #",
        "#  S   W #",
        "# XXX    #",
        "#  B   N #",
        "# XXXXXXX#",
        "#       $#",
        "##########"
    };


    private static BenderManager benderManager;
    private static int width;
    private static int height;
    
    public static void main (String[] args) {

        width = WIDTH_MAP_1;
        height = HEIGHT_MAP_1;
        benderManager = new BenderManager(width, height);
        for (int i = 0; i < height; i++) {
            initGridRow(i, ROWS_1[i]);
        }

        debugMap();
    }
    
    private static void debugMap() {
    	//DEBUG MAP
        for (int j = 0; j < height; j++) {
            String line = "";
            for (int i = 0; i < width; i++) {
                Cell currentCell = benderManager.getCellInGrid(i, j);
                if (benderManager.getBenderPosX() == i && benderManager.getBenderPosY() == j)
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


    private static void initGridRow(int index, String row) {
    	char[] currentRowDatas = row.toCharArray();
        for (int i = 0; i < width; i++) {

        	Cell currentCell = new Cell(i, i);
            switch (currentRowDatas[i]) {
                case '#':	currentCell.setWall();
                    		break;
                case '@':	currentCell.setEntry();
                    		currentCell.setVisited();
                    		benderManager.initBender(i,index);
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
            
            benderManager.setCellInGrid(i, index, currentCell);
        }
    }
}
