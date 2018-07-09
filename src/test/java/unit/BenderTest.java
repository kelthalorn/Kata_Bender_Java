package unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bender.BenderManager;
import bender.Constants;

public class BenderTest {

    private BenderManager benderManager;

    @Before
    public void initTest() {
        benderManager = new BenderManager(Constants.BenderMap_1);    
    }

    @Test
    public void BenderPositionShouldBeTheStartPointOne() {

        int startPointMap1XPosition = 1;
        int startPointMap1YPosition = 1;
        Assert.assertEquals(startPointMap1XPosition, benderManager.getBenderPosX());
        Assert.assertEquals(startPointMap1YPosition, benderManager.getBenderPosY());
    }

    @Test
    public void benderShouldBeOneCellSouthOfStartPointAfterOneCycle() {

        int startPointMap1XPosition = 1;
        int startPointMap1YPosition = 1;
        benderManager.updateCycle();

        Assert.assertEquals(startPointMap1XPosition, benderManager.getBenderPosX());
        Assert.assertEquals(startPointMap1YPosition+1, benderManager.getBenderPosY());

    }
}