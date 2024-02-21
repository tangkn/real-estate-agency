package org.pdev;

import org.pdev.Model.House;
import org.pdev.Model.SummerHouse;
import org.pdev.Model.Villa;
import org.pdev.common.StringConstant;
import org.pdev.service.RealEstateService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> normalHouses = new ArrayList<>();
        House house1 = new House(100000, 100, 3, 1, StringConstant.NORMAL);
        House house2 = new House(120000, 120, 4, 1, StringConstant.NORMAL);
        House house3 = new House(110000, 110, 3, 1, StringConstant.NORMAL);
        normalHouses.add(house1);
        normalHouses.add(house2);
        normalHouses.add(house3);

        List<Villa> villas = new ArrayList<>();
        Villa villa1 = new Villa(400000, 200, 5, 2);
        Villa villa2 = new Villa(220000, 220, 6, 2);
        Villa villa3 = new Villa(210000, 210, 5, 2);
        villas.add(villa1);
        villas.add(villa2);
        villas.add(villa3);

        List<SummerHouse> summerHouses = new ArrayList<>();
        SummerHouse summerHouse1 = new SummerHouse(150000, 150, 4, 1);
        SummerHouse summerHouse2 = new SummerHouse(160000, 160, 4, 1);
        SummerHouse summerHouse3 = new SummerHouse(155000, 155, 4, 1);
        summerHouses.add(summerHouse1);
        summerHouses.add(summerHouse2);
        summerHouses.add(summerHouse3);

        RealEstateService service = new RealEstateService(
                Arrays.asList(house1, house2, house3, villa1, villa2, villa3, summerHouse1, summerHouse2, summerHouse3)
        );

        System.out.println("Total Price: " + String.format("%,.2f", service.getTotalPrice()));
        System.out.println("Total Villa Price: " + String.format("%,.2f", service.getTotalVillaPrice()));
        System.out.println("Total SummerHouse Price: " + String.format("%,.2f", service.getTotalSummerHousePrice()));
        System.out.println("Total Price for House Type: " + String.format("%,.2f", service.getTotalPriceForType(House.class)));
        System.out.println("Average Square Meter: " + String.format("%,.2f", service.getAverageSquareMeter()));
        System.out.println("Average Villa Square Meter: " + String.format("%,.2f", service.getAverageVillaSquareMeter()));
        System.out.println("Average SummerHouse Square Meter: " + String.format("%,.2f", service.getAverageSummerHouseSquareMeter()));
        System.out.println("Average Square Meter for House Type: " + String.format("%,.2f", service.getAverageSquareMeterForType(House.class)));
        System.out.println("Number of houses with 3 Rooms and 1 Living Room: " + service.filterHouses(3, 1).size());
    }
}
