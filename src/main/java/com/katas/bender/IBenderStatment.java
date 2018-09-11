package com.katas.bender;

import com.katas.bender.enums.Direction;

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
