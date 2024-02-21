package org.pdev.Model;

import org.pdev.common.StringConstant;

public class Villa extends House {
    public Villa(double price, double squareMeter, int numberOfRooms, int numberOfLivingRooms) {
        super(price, squareMeter, numberOfRooms, numberOfLivingRooms, StringConstant.VILLA);
    }
}
