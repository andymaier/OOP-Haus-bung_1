package com.judy.model;

public class Angebot {
    private int numberOfPeople;
    private int numberOfNights;
    private int numberOfMealsPerDay;
    private double pricePerPersonPerNight;
    private double pricePerMeal;

    public Angebot(int numberOfPeople, int numberOfNights, int numberOfMealsPerDay, double pricePerPersonPerNight, double pricePerMeal) {
        this.numberOfPeople = numberOfPeople;
        this.numberOfNights = numberOfNights;
        this.numberOfMealsPerDay = numberOfMealsPerDay;
        this.pricePerPersonPerNight = pricePerPersonPerNight;
        this.pricePerMeal = pricePerMeal;
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

    public double getPricePerPersonPerNight() {
        return pricePerPersonPerNight;
    }

    public double getPricePerMeal() {
        return pricePerMeal;
    }

    public double getTotalPrice() {
        return (numberOfPeople * numberOfNights * pricePerPersonPerNight) + (numberOfPeople * numberOfMealsPerDay * pricePerMeal);
    }
}
