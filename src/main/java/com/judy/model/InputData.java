package com.judy.model;

public class InputData {
    private int numberOfPeople;
    private int numberOfNights;
    private int numberOfMealsPerDay;

    public InputData(int numberOfPeople, int numberOfNights, int numberOfMealsPerDay) {
        this.numberOfPeople = numberOfPeople;
        this.numberOfNights = numberOfNights;
        this.numberOfMealsPerDay = numberOfMealsPerDay;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public int getNumberOfMealsPerDay() {
        return numberOfMealsPerDay;
    }
}
