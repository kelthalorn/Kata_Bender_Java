package bender.utils;

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

    public static BenderMap BenderMap1  = new BenderMap(5, 5, gridSimpleMove);
    public static BenderMap BenderMap2  = new BenderMap(8, 8, gridObstacle);
    public static BenderMap BenderMap3  = new BenderMap(8, 8, gridOrientationPriority);
    public static BenderMap BenderMap4  = new BenderMap(8, 8, gridStraightLine);
    public static BenderMap BenderMap5  = new BenderMap(10, 10, gridDirectionModifiers);
    public static BenderMap BenderMap6  = new BenderMap(10, 10, gridBeerEffect);
    public static BenderMap BenderMap7  = new BenderMap(10, 10, gridInverser);
    public static BenderMap BenderMap8  = new BenderMap(10, 10, gridTeleporter);
    public static BenderMap BenderMap9  = new BenderMap(10, 10, gridBrokenWallOrNot);
    public static BenderMap BenderMap10 = new BenderMap(15, 15, gridComplete);
    public static BenderMap BenderMap11 = new BenderMap(15, 15, gridLoop);
    public static BenderMap BenderMap12 = new BenderMap(15, 30, gridMaster);

}