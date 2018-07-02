package unit;

import org.junit.Before;
import org.junit.Test;

import main.java.bender.Bender;

public class BenderTest {

    private int width = 6;
    private int height = 5;
    private Bender bender;

    @Before
    private void init() {
        bender = new Bender(width,height);
        initMatrix();
    }

	private void initMatrix() {
        for (int x = 0; x < width; x++) {
            bender.matrix[0][x] = 'X';
        }

        for (int x = 0; x < width; x++) {
            bender.matrix[height-1][x] = 'X';
        }

        bender.matrix[1][0] = 'X';
        bender.matrix[1][1] = '';
        bender.matrix[1][2] = '';
        bender.matrix[1][3] = '';
        bender.matrix[1][4] = '';
        bender.matrix[1][width-1] = 'X';

        bender.matrix[2][0] = 'X';
        bender.matrix[2][1] = '';
        bender.matrix[2][2] = '';
        bender.matrix[2][3] = '';
        bender.matrix[2][4] = '';
        bender.matrix[2][width-1] = 'X';

        bender.matrix[3][0] = 'X';
        bender.matrix[3][1] = '';
        bender.matrix[3][2] = '';
        bender.matrix[3][3] = '';
        bender.matrix[3][4] = '';
        bender.matrix[3][width-1] = 'X';
	}
}