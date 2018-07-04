package bender;

public class Cell {
    private int posX;
    private int posY;
    private CellType type;
    private boolean visited;
	private boolean teleporterExit;

    public Cell (int x, int y) {
        this.posX = x;
        this.posY = y;

        this.type = CellType.EMPTY;

        this.visited = false;
    }
    
    public Cell() {
    	
    }

	public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public void setWall() {
        this.type = CellType.WALL;
    }

    public void setEntry() {
        this.type = CellType.ENTRY;
    }

    public void setExit() {
        this.type = CellType.EXIT;
    }

    public void setBlock() {
        this.type = CellType.BLOCK;
    }

    public void setBeer() {
        this.type = CellType.BEER;
    }

    public void setTeleporter() {
        this.type = CellType.TELEPORTER;
    }

    public void setInverser() {
        this.type = CellType.INVERSER;
    }

    public void setEmpty() {
        this.type = CellType.EMPTY;
    }

    public void setVisited() {
        this.visited = true;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setTeleporterExitUsed() {
    	this.teleporterExit = true;
    }
    
    public boolean isTeleporterExitUsed() {
    	return this.teleporterExit;
    }
    
    public void setDirctional(char symbol) {

        switch(symbol) {
            case 'N' : 	this.type = CellType.DIR_NORTH;
                break;
            case 'S' : 	this.type = CellType.DIR_SOUTH;
                break;
            case 'W' : 	this.type = CellType.DIR_WEST;
                break;
            case 'E' : 	this.type = CellType.DIR_EAST;
                break;
        }

    }

    public CellType getCellType() {
        return this.type;
    }
}