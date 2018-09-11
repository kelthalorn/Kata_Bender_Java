package com.katas.bender.enums;

public enum Direction
{

    SOUTH(0, "SOUTH"),
    EAST(1, "EAST"),
    NORTH(2, "NORTH"),
    WEST(3, "WEST");
    /** Ordering index for S-E-N-W */
    private final int index;
    private final String name;

    /** All facings in S-E-N-W order */
    public static final Direction[] normalOrderIndexOrder = {SOUTH, EAST, NORTH, WEST};
    public static final Direction[] inversedOrderIndexOrder = {WEST, NORTH, EAST, SOUTH};


    Direction(int indexIn, String nameIn)
    {
        this.index = indexIn;
        this.name = nameIn;

    }

    public String getName() {
        return this.name;
    }
}
