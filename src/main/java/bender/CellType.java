package bender;

public enum CellType {

    WALL(0, '#', true, false, false, false, false, false, false, false, false, Direction.SOUTH),
    ENTRY(1,'@', false, true, false, false, false, false, false, false, false, Direction.SOUTH),
    EXIT(2, '$', false, false, true, false, false, false, false, false, false, Direction.SOUTH),
    BLOCK(3, 'X', false, false, false, true, false, false, false, false, false, Direction.SOUTH),
    BEER(4, 'B', false, false, false, false, true, false, false, false, false, Direction.SOUTH),
    TELEPORTER(5, 'T', false, false, false, false, false, true, false, false, false, Direction.SOUTH),
    INVERSER(6, 'I', false, false, false, false, false, false, true, false, false, Direction.SOUTH),

    DIR_SOUTH(7, 'S', false, false, false, false, false, false, false, true, false, Direction.SOUTH),
    DIR_NORTH(8, 'N', false, false, false, false, false, false, false, true, false, Direction.NORTH),
    DIR_WEST(9, 'W', false, false, false, false, false, false, false, true, false, Direction.WEST),
    DIR_EAST(10 ,'E', false, false, false, false, false, false, false, true, false, Direction.EAST),

    EMPTY(11, ' ', false, false, false, false, false, false, false, false, false, Direction.SOUTH);

    private final int index;
    private final char symbol;
    private final boolean isWall;
    private final boolean isEntry;
    private final boolean isExit;
    private final boolean isBlock;
    private final boolean isBeer;
    private final boolean isTeleporter;
    private final boolean isInverser;
    private final boolean isDirectional;
    private final boolean isBender;
    private final Direction direction;

    private static final CellType[] VALUES = new CellType[13];

    private CellType(int index, char symbol, boolean isWall, boolean isEntry, boolean isExit, boolean isBlock, boolean isBeer, boolean isTeleporter, boolean isInverser, boolean isDirectional, boolean isBender, Direction direction) {
        this.index = index;
        this.symbol = symbol;
        this.isWall = isWall;
        this.isEntry = isEntry;
        this.isExit = isExit;
        this.isBlock = isBlock;
        this.isBeer = isBeer;
        this.isTeleporter = isTeleporter;
        this.isInverser = isInverser;
        this.isDirectional = isDirectional;
        this.isBender = isBender;
        this.direction = direction;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public Direction getDirectionBySymbol(char symbol) {
        for (int i = 0; i < VALUES.length; i++) {
            if (VALUES[i].getSymbol() == symbol)
                return VALUES[i].direction;
        }

        return null;
    }

    public Direction getDirection() {
    	return this.direction;
    }
    
    static
    {
        CellType[] var0 = values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2)
        {
            CellType var3 = var0[var2];
            VALUES[var3.index] = var3;
        }
    }
}