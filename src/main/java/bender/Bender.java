package bender;

import bender.enums.Direction;

public class Bender implements IBenderStatment {

    private boolean movePossible;

    public Bender () {
        this.movePossible = true;
    }

    public void setMovePossible() {
        this.movePossible = true;
    }

    private void setMoveImpossible() {
        this.movePossible = false;
    }

    public boolean isMovePossible() {
        return this.movePossible;
    }

    @Override
    public void haveReachedTheEnd() {

    }

    @Override
    public Direction haveFoundSouthSymbol() {
        return Direction.SOUTH;
    }

    @Override
    public Direction haveFoundNorthSymbol() {
        return Direction.NORTH;
    }

    @Override
    public Direction haveFoundEastSymbol() {
        return Direction.EAST;
    }

    @Override
    public Direction haveFoundWestSymbol() {
        return Direction.WEST;
    }

    @Override
    public void haveFoundInverserSymbol() {

    }

    @Override
    public void haveFoundTeleporterSymbol() {

    }

    @Override
    public void haveFoundWallSymbol() {
        setMoveImpossible();
    }

    @Override
    public void haveFoundMapBorderSymbol() {
        setMoveImpossible();
    }

    @Override
    public void haveFoundBeerSymbol() {

    }
}
