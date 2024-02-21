package org.pdev.service;

import org.pdev.common.StringConstant;
import org.pdev.realty.IRealEstate;
import org.pdev.Model.House;
import org.pdev.realty.IRealEstateService;

import java.util.List;
import java.util.stream.Collectors;

public class RealEstateService implements IRealEstateService {
    private List<IRealEstate> realEstates;

    public RealEstateService(List<IRealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    @Override
    public double getTotalPrice() {
        return realEstates.stream().mapToDouble(IRealEstate::getPrice).sum();
    }

    @Override
    public double getTotalVillaPrice() {
        return realEstates.stream()
                .filter(e -> e instanceof House && ((House) e).getType().equals(StringConstant.VILLA))
                .mapToDouble(IRealEstate::getPrice)
                .sum();
    }

    @Override
    public double getTotalSummerHousePrice() {
        return realEstates.stream()
                .filter(e -> e instanceof House && ((House) e).getType().equals(StringConstant.SUMMER_HOUSE))
                .mapToDouble(IRealEstate::getPrice)
                .sum();
    }

    @Override
    public double getTotalPriceForType(Class<? extends IRealEstate> type) {
        return realEstates.stream()
                .filter(type::isInstance)
                .mapToDouble(IRealEstate::getPrice)
                .sum();
    }

    @Override
    public double getAverageSquareMeter() {
        return realEstates.stream().mapToDouble(IRealEstate::getSquareMeter).average().orElse(0);
    }

    @Override
    public double getAverageVillaSquareMeter() {
        return realEstates.stream()
                .filter(e -> e instanceof House && ((House) e).getType().equals(StringConstant.VILLA))
                .mapToDouble(IRealEstate::getSquareMeter)
                .average()
                .orElse(0);
    }

    @Override
    public double getAverageSummerHouseSquareMeter() {
        return realEstates.stream()
                .filter(e -> e instanceof House && ((House) e).getType().equals(StringConstant.SUMMER_HOUSE))
                .mapToDouble(IRealEstate::getSquareMeter)
                .average()
                .orElse(0);
    }

    @Override
    public double getAverageSquareMeterForType(Class<? extends IRealEstate> type) {
        return realEstates.stream()
                .filter(type::isInstance)
                .mapToDouble(IRealEstate::getSquareMeter)
                .average()
                .orElse(0);
    }

    @Override
    public List<IRealEstate> filterHouses(int numberOfRooms, int numberOfLivingRooms) {
        return realEstates.stream()
                .filter(e -> e.getNumberOfRooms() == numberOfRooms && e.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }
}