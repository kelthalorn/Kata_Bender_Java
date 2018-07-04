package bender;

public class Bender {

    private int posX;
    private int posY;
    private boolean isOnBeer;

    public Bender(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        isOnBeer = false;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isOnBeer() {
        return isOnBeer;
    }

    public void setOnBeer() {
        this.isOnBeer = !this.isOnBeer;
    }
}
