package main.java.bender;

public class Bender {

    public char[][] matrix;
    private int width;
    private int height;

    public Bender(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[width][height];
    }


}
