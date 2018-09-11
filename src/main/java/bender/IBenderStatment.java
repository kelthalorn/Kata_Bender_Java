package bender;

import bender.enums.Direction;
import bender.utils.BenderMap;

public interface IBenderStatment {

    void haveReachedTheEnd();
    Direction haveFoundSouthSymbol();
    Direction haveFoundNorthSymbol();
    Direction haveFoundEastSymbol();
    Direction haveFoundWestSymbol();
    void haveFoundInverserSymbol();
    void haveFoundTeleporterSymbol();
    void haveFoundWallSymbol();
    void haveFoundMapBorderSymbol();
    void haveFoundBeerSymbol();
}
