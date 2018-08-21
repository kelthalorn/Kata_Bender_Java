package bender.utils;

public class BenderMap {

    private int width;
    private int height;
    private String[] grid;

    public BenderMap (int width, int height, String[] grid) {
        this.width = width;
        this.height = height;
        this.grid = grid;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String[] getGrid() {
        return grid;
    }

    public String getRow(int index) {
        return grid[index];
    }
}
