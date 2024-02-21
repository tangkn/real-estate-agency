package org.pdev.Model;

import org.pdev.common.StringConstant;

public class SummerHouse extends House{
    public SummerHouse(double price, double squareMeter, int numberOfRooms, int numberOfLivingRooms) {
        super(price, squareMeter, numberOfRooms, numberOfLivingRooms, StringConstant.SUMMER_HOUSE );
    }

}
