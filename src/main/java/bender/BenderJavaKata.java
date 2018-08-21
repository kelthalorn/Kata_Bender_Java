package bender;

public class BenderJavaKata {
    
    private static BenderManager benderManager;

    public static void main (String[] args) {

        benderManager = new BenderManager(Constants.BenderMap_1);        
        benderManager.debugBenderMap();
    }    
}
