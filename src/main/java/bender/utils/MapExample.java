package bender.utils;

import java.lang.reflect.Method;

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

    private static BenderMap BenderMap1  = new BenderMap(5, 5, gridSimpleMove);
    private static BenderMap BenderMap2  = new BenderMap(8, 8, gridObstacle);
    private static BenderMap BenderMap3  = new BenderMap(8, 8, gridOrientationPriority);
    private static BenderMap BenderMap4  = new BenderMap(8, 8, gridStraightLine);
    private static BenderMap BenderMap5  = new BenderMap(10, 10, gridDirectionModifiers);
    private static BenderMap BenderMap6  = new BenderMap(10, 10, gridBeerEffect);
    private static BenderMap BenderMap7  = new BenderMap(10, 10, gridInverser);
    private static BenderMap BenderMap8  = new BenderMap(10, 10, gridTeleporter);
    private static BenderMap BenderMap9  = new BenderMap(10, 10, gridBrokenWallOrNot);
    private static BenderMap BenderMap10 = new BenderMap(15, 15, gridComplete);
    private static BenderMap BenderMap11 = new BenderMap(15, 15, gridLoop);
    private static BenderMap BenderMap12 = new BenderMap(15, 30, gridMaster);

    public static BenderMap getBenderMap1() {
        return BenderMap1;
    }

    public static BenderMap getBenderMap2() {
        return BenderMap2;
    }

    public static BenderMap getBenderMap3() {
        return BenderMap3;
    }

    public static BenderMap getBenderMap4() {
        return BenderMap4;
    }

    public static BenderMap getBenderMap5() {
        return BenderMap5;
    }

    public static BenderMap getBenderMap6() {
        return BenderMap6;
    }

    public static BenderMap getBenderMap7() {
        return BenderMap7;
    }

    public static BenderMap getBenderMap8() {
        return BenderMap8;
    }

    public static BenderMap getBenderMap9() {
        return BenderMap9;
    }

    public static BenderMap getBenderMap10() {
        return BenderMap10;
    }

    public static BenderMap getBenderMap11() {
        return BenderMap11;
    }

    public static BenderMap getBenderMap12() {
        return BenderMap12;
    }
}