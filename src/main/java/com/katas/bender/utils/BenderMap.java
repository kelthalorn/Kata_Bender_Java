package com.katas.bender.utils;


public class BenderMap {

    private int width;
    private int height;
    private String[][] grid;

    public BenderMap (int width, int height, String[][] grid) {
        this.width = width;
        this.height = height;
        if (grid.length == this.height && grid[0].length == this.width) {
            this.grid = grid;
        } else {
            throw new IllegalArgumentException(
                    "grid should have been initialized with "+
                    this.height+" row(s) and "+
                    this.width+" column(s) "+
                    "but has been created with "+
                    grid[0].length+" row(s) and "+
                    grid.length+" column(s)"
            );
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String[][] getGrid() {
        return grid;
    }
}
