package bender;

import bender.utils.BenderMap;
import bender.utils.Constants;
import bender.utils.MapExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BenderJavaKata {

    private static Bender bender;
    private static String[] output;
    private static BenderMap benderMap;

    public static void main (String[] args) {
        displayMainMenu();
        String input = readUserInput();
        if (input.equals("0")) {
            System.out.println("Cheers !");
            return;
        }
        String[] currentMap = getChosenMapAndDisplay(input);

        bender = new Bender();
        output = new String[] {"SOUTH"};
        benderMap = initCellGrid(currentMap);
    }

    private static BenderMap initCellGrid(String[] currentMap) {
        int width = currentMap[0].length();
        int height = currentMap.length;
        String[][] cellMap = new String[height][width];

        for (int indexRow = 0; indexRow < height; indexRow++) {
            for (int indexColumn = 0; indexColumn < width; indexColumn++) {
                String symbol = currentMap[indexRow].split("")[indexColumn];
                cellMap[indexRow][indexColumn] = symbol;

                if(symbol.equals(Constants.START_SYMBOL)) {
                    bender.setPosX(indexColumn);
                    bender.setPosY(indexRow);
                }
            }
        }
        return new BenderMap(width,height, cellMap);
    }

    private static String[] getChosenMapAndDisplay(String input) {

        String[] map = {};
        MapExample mapExample = new MapExample();
        try {
            Method method = mapExample.getClass().getMethod("getGrid" + input);
            map = (String[]) method.invoke(mapExample);
        }
        catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        for (String line : map) {
            System.out.println(line);
        }

        return map;
    }

    private static String readUserInput() {
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice: ");
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

    private static void displayMainMenu() {
        System.out.println("Choose which maze you want to resolve ?");
        System.out.println("");
        System.out.println("1  -> Simple move");
        System.out.println("2  -> Obstacle");
        System.out.println("3  -> Orientation Priority");
        System.out.println("4  -> Straight Lines");
        System.out.println("5  -> Direction Modifiers");
        System.out.println("6  -> Beer effect");
        System.out.println("7  -> Inverser");
        System.out.println("8  -> Teleporter");
        System.out.println("9  -> Broken Wall ?");
        System.out.println("10 -> Complete");
        System.out.println("11 -> Loop");
        System.out.println("12 -> Master Maze");
        System.out.println("");
        System.out.println("Or press 0 to exit");
        System.out.println("");
    }
}
