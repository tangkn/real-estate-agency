package org.pdev.realty;

import java.util.List;

public interface IRealEstateService {
    double getTotalPrice();

    double getTotalVillaPrice();

    double getTotalSummerHousePrice();

    double getTotalPriceForType(Class<? extends IRealEstate> type);

    double getAverageSquareMeter();

    double getAverageVillaSquareMeter();

    double getAverageSummerHouseSquareMeter();

    double getAverageSquareMeterForType(Class<? extends IRealEstate> type);

    List<IRealEstate> filterHouses(int numberOfRooms, int numberOfLivingRooms);
}
