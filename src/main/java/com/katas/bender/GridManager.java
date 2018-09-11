package com.katas.bender;

import com.katas.bender.enums.Direction;
import com.katas.bender.utils.BenderMap;
import com.katas.bender.utils.Constants;

import java.util.Arrays;

public class GridManager {

    private int nextPosX;
    private int nextPosY;
    private boolean isInLoop;
    private boolean movesFinished;
    private Direction nextMove;
    private boolean isDirectionStandard = true;
    private Bender bender;

    GridManager() {
        this.isInLoop = false;
        this.movesFinished = false;
        this.nextPosX = 0;
        this.nextPosY = 0;
        this.nextMove = Direction.SOUTH;

        this.bender = new Bender();
    }

    public boolean isMovesFinished() {
        return this.movesFinished;
    }

    public void setMovesFinished() {
        this.movesFinished = true;
    }

    public boolean isInLoop() {
        return this.isInLoop;
    }

    public int getNextPosX() {
        return this.nextPosX;
    }

    public int getNextPosY() {
        return this.nextPosY;
    }

    public Bender getBender() {
        return this.bender;
    }

    public String manageNextMove(int currentPositionX, int currentPositionY, BenderMap map) {

        String nextCellSymbol = getNextCellSymbol(currentPositionX, currentPositionY, map, this.nextMove);
        checkForBenderChanges(nextCellSymbol);

        if (Arrays.asList(Constants.MOVE_POSSIBLE_CELLS).contains(nextCellSymbol)) {
            this.getBender().setMovePossible();
        }

        if (this.getBender().isMovePossible()) {
            return this.nextMove.getName();
        }

        if (this.isDirectionStandard) {
            for (int index = 0; index < Direction.normalOrderIndexOrder.length; index++) {
                if (Direction.normalOrderIndexOrder[index] == this.nextMove) {
                    continue;
                }
                nextCellSymbol = getNextCellSymbol(currentPositionX, currentPositionY, map, Direction.normalOrderIndexOrder[index]);
                checkForBenderChanges(nextCellSymbol);

                if (Arrays.asList(Constants.MOVE_POSSIBLE_CELLS).contains(nextCellSymbol)) {
                    this.getBender().setMovePossible();
                }

                if (this.getBender().isMovePossible()) {
                    this.nextMove = Direction.normalOrderIndexOrder[index];
                    return this.nextMove.getName();
                }
            }
        } else {
            for (int index = 0; index < Direction.inversedOrderIndexOrder.length; index++) {
                if (Direction.inversedOrderIndexOrder[index] == this.nextMove) {
                    continue;
                }
                nextCellSymbol = getNextCellSymbol(currentPositionX, currentPositionY, map, Direction.inversedOrderIndexOrder[index]);
                checkForBenderChanges(nextCellSymbol);

                if (Arrays.asList(Constants.MOVE_POSSIBLE_CELLS).contains(nextCellSymbol)) {
                    this.getBender().setMovePossible();
                }

                if (this.getBender().isMovePossible()) {
                    this.nextMove = Direction.inversedOrderIndexOrder[index];
                    return this.nextMove.getName();
                }
            }
        }

        return "FAILED";
    }

    private void checkForBenderChanges(String nextCellSymbol) {

        switch (nextCellSymbol) {
            case Constants.EMPTY_SYMBOL     :   break;
            case Constants.FINISH_SYMBOL    :   bender.haveReachedTheEnd();
                                                this.setMovesFinished();
                                                break;
            case Constants.SOUTH_SYMBOL     :   this.nextMove = bender.haveFoundSouthSymbol();
                                                break;
            case Constants.NORTH_SYMBOL     :   this.nextMove = bender.haveFoundNorthSymbol();
                                                break;
            case Constants.EAST_SYMBOL      :   this.nextMove = bender.haveFoundEastSymbol();
                                                break;
            case Constants.WEST_SYMBOL      :   this.nextMove = bender.haveFoundWestSymbol();
                                                break;
            case Constants.INVERSER_SYMBOL  :   this.isDirectionStandard = !this.isDirectionStandard;
                                                break;
            case Constants.TELEPORTER_SYMBOL:   bender.haveFoundTeleporterSymbol();
                                                break;
            case Constants.WALL_SYMBOL      :   bender.haveFoundWallSymbol();
                                                break;
            case Constants.MAP_BORDER_SYMBOL:   bender.haveFoundMapBorderSymbol();
                                                break;
            case Constants.BEER_SYMBOL      :   bender.haveFoundBeerSymbol();
                                                break;
        }
    }

    private String getNextCellSymbol(int currentPositionX, int currentPositionY, BenderMap map, Direction direction) {

        switch (direction) {
            case SOUTH: this.nextPosX = currentPositionX;
                        this.nextPosY = currentPositionY+1;
                        break;
            case EAST : this.nextPosX = currentPositionX+1;
                        this.nextPosY = currentPositionY;
                        break;
            case WEST : this.nextPosX = currentPositionX-1;
                        this.nextPosY = currentPositionY;
                        break;
            case NORTH: this.nextPosX = currentPositionX;
                        this.nextPosY = currentPositionY-1;
                        break;
        }

        return map.getGrid()[this.nextPosY][this.nextPosX];
    }
}
