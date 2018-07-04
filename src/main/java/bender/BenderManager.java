package bender;

import java.util.ArrayList;

public class BenderManager {
    private static Cell[][] grid;
	private static Bender bender;
	private static boolean directionInversed;
	private static Direction currentDirection;
	private static boolean benderDead;
	private static ArrayList<String> moves;
    
    public BenderManager(int width, int height) {
        moves = new ArrayList<String>();
        benderDead = false;
        directionInversed = false;
        currentDirection = Direction.SOUTH;
        
        grid = new Cell[width][height];
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
}