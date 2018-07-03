package unit;

import org.junit.Before;
import org.junit.Test;

import main.java.bender.Bender;

public class BenderTest {

    private int width = 6;
    private int height = 5;
    private Bender bender;

    @Before
    public void init() {
        bender = new Bender(width,height);
        initGrid();
    }

    @Test
    public void benderPositionShouldBeStartPointWhenBegin() {

    }

	private void initGrid() {
        for (int x = 0; x < width; x++) {
            bender.grid[x][0] = 'X';
        }

        bender.grid[0][1] = 'X';
        bender.grid[1][1] = '@';
        bender.grid[2][1] = 'E';
        bender.grid[3][1] = ' ';
        bender.grid[4][1] = '$';
        bender.grid[5][1] = 'X';

        bender.grid[0][2] = 'X';
        bender.grid[1][2] = ' ';
        bender.grid[2][2] = 'N';
        bender.grid[3][2] = ' ';
        bender.grid[4][2] = ' ';
        bender.grid[5][2] = 'X';

        bender.grid[0][3] = 'X';
        bender.grid[1][3] = 'X';
        bender.grid[2][3] = ' ';
        bender.grid[3][3] = ' ';
        bender.grid[4][3] = ' ';
        bender.grid[5][3] = 'X';

        for (int x = 0; x < width; x++) {
            bender.grid[x][height -1] = 'X';
        }
    }
    
    public void displayGrid() {
        for (int y = 0; y < height; y++) {
            String display = "";
            for (int x = 0; x < width; x++) {
                display += bender.grid[x][y];
            }
            System.out.println(display);
        }
    }
}