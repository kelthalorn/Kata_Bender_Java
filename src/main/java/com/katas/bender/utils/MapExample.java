package com.katas.bender.utils;

public class MapExample {

    private static String[] gridSimpleMove = {
            "#####",
            "#@  #",
            "#   #",
            "#  $#",
            "#####"
    };
    private static String[] gridObstacle = {
            "########",
            "# @    #",
            "#     X#",
            "# XXX  #",
            "#   XX #",
            "#   XX #",
            "#     $#",
            "########"
    };
    private static String[] gridOrientationPriority = {
            "########",
            "#     $#",
            "#      #",
            "#      #",
            "#  @   #",
            "#      #",
            "#      #",
            "########"
    };
    private static String[] gridStraightLine = {
            "########",
            "#      #",
            "# @    #",
            "# XX   #",
            "#  XX  #",
            "#   XX #",
            "#     $#",
            "########"
    };
    private static String[] gridDirectionModifiers = {
            "##########",
            "#        #",
            "#  S   W #",
            "#        #",
            "#  $     #",
            "#        #",
            "#@       #",
            "#        #",
            "#E     N #",
            "##########"
    };
    private static String[] gridBeerEffect = {
            "##########",
            "# @      #",
            "# B      #",
            "#XXX     #",
            "# B      #",
            "#    BXX$#",
            "#XXXXXXXX#",
            "#        #",
            "#        #",
            "##########"
    };
    private static String[] gridInverser = {
            "##########",
            "#    I   #",
            "#        #",
            "#       $#",
            "#       @#",
            "#        #",
            "#       I#",
            "#        #",
            "#        #",
            "##########"
    };
    private static String[] gridTeleporter = {
            "##########",
            "#    T   #",
            "#        #",
            "#        #",
            "#        #",
            "#@       #",
            "#        #",
            "#        #",
            "#    T  $#",
            "##########"
    };
    private static String[] gridBrokenWallOrNot = {
            "##########",
            "#        #",
            "#  @     #",
            "#  B     #",
            "#  S   W #",
            "# XXX    #",
            "#  B   N #",
            "# XXXXXXX#",
            "#       $#",
            "##########"
    };
    private static String[] gridComplete = {
            "###############",
            "#      IXXXXX #",
            "#  @          #",
            "#             #",
            "#             #",
            "#  I          #",
            "#  B          #",
            "#  B   S     W#",
            "#  B   T      #",
            "#             #",
            "#         T   #",
            "#         B   #",
            "#            $#",
            "#        XXXX #",
            "###############"
    };
    private static String[] gridLoop = {
            "###############",
            "#      IXXXXX #",
            "#  @          #",
            "#E S          #",
            "#             #",
            "#  I          #",
            "#  B          #",
            "#  B   S     W#",
            "#  B   T      #",
            "#             #",
            "#         T   #",
            "#         B   #",
            "#            $#",
            "#        XXXX #",
            "###############"
    };
    private static String[] gridMaster = {
            "###############",
            "#  #@#I  T$#  #",
            "#  #    IB #  #",
            "#  #     W #  #",
            "#  #      ##  #",
            "#  #B XBN# #  #",
            "#  ##      #  #",
            "#  #       #  #",
            "#  #     W #  #",
            "#  #      ##  #",
            "#  #B XBN# #  #",
            "#  ##      #  #",
            "#  #       #  #",
            "#  #     W #  #",
            "#  #      ##  #",
            "#  #B XBN# #  #",
            "#  ##      #  #",
            "#  #       #  #",
            "#  #       #  #",
            "#  #      ##  #",
            "#  #  XBIT #  #",
            "#  #########  #",
            "#             #",
            "# ##### ##### #",
            "#   #   #     #",
            "#   #   #     #",
            "#   #   #     #",
            "#   #   ##### #",
            "#             #",
            "###############"
    };

    public static String[] getGrid1() {
        return gridSimpleMove;
    }

    public static String[] getGrid2() {
        return gridObstacle;
    }

    public static String[] getGrid3() {
        return gridOrientationPriority;
    }

    public static String[] getGrid4() {
        return gridStraightLine;
    }

    public static String[] getGrid5() {
        return gridDirectionModifiers;
    }

    public static String[] getGrid6() {
        return gridBeerEffect;
    }

    public static String[] getGrid7() {
        return gridInverser;
    }

    public static String[] getGrid8() {
        return gridTeleporter;
    }

    public static String[] getGrid9() {
        return gridBrokenWallOrNot;
    }

    public static String[] getGrid10() {
        return gridComplete;
    }

    public static String[] getGrid11() {
        return gridLoop;
    }

    public static String[] getGrid12() {
        return gridMaster;
    }
}