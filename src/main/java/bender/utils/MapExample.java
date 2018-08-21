package bender.utils;

public class MapExample {

    private static String[] grid1 = {
            "######",
            "#@E $#",
            "# N  #",
            "#X   #",
            "######"
    };
    private static String[] grid2 = {
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
    private static String[] grid3 = {
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

    public static BenderMap BenderMap_1 = new BenderMap(6, 5, grid1);
    public static BenderMap BenderMap_2 = new BenderMap(10, 10, grid2);
    public static BenderMap BenderMap_3 = new BenderMap(15, 15, grid3);

}