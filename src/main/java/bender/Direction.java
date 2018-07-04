package bender;

public enum Direction
{

    SOUTH(0, "SOUTH"),
    EAST(1, "EAST"),
    NORTH(2, "NORTH"),
    WEST(3, "WEST");
    /** Ordering index for N-S-W-E */
    private final int index;
    private final String name;

    /** All facings in N-S-W-E order */
    public static final Direction[] VALUES = new Direction[4];


    private Direction(int indexIn, String nameIn)
    {
        this.index = indexIn;
        this.name = nameIn;
    }

    public int getIndex()
    {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public Direction getDirectionByName(String name) {

        for (int i = 0; i < VALUES.length; i++) {
            if (VALUES[i].getName() == name)
                return VALUES[i];
        }

        return null;
    }

    static
    {
        Direction[] var0 = values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2)
        {
            Direction var3 = var0[var2];
            VALUES[var3.index] = var3;
        }
    }
}