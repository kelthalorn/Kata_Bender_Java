package com.katas.bender.utils;

public class Constants {

    public static final String MAP_BORDER_SYMBOL  = "#";
    public static final String EMPTY_SYMBOL       = " ";
    public static final String START_SYMBOL       = "@";
    public static final String FINISH_SYMBOL      = "$";
    public static final String WALL_SYMBOL        = "X";
    public static final String NORTH_SYMBOL       = "N";
    public static final String SOUTH_SYMBOL       = "S";
    public static final String WEST_SYMBOL        = "W";
    public static final String EAST_SYMBOL        = "E";
    public static final String INVERSER_SYMBOL    = "I";
    public static final String TELEPORTER_SYMBOL  = "T";
    public static final String BEER_SYMBOL        = "B";

    public static final String LOOP = "LOOP";

    public static final String[] MOVE_POSSIBLE_CELLS = {
            EMPTY_SYMBOL,
            START_SYMBOL,
            FINISH_SYMBOL,
            NORTH_SYMBOL,
            SOUTH_SYMBOL,
            WEST_SYMBOL,
            EAST_SYMBOL,
            INVERSER_SYMBOL,
            TELEPORTER_SYMBOL,
            BEER_SYMBOL,
            WALL_SYMBOL
    };

}
