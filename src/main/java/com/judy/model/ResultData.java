package com.judy.model;

public class ResultData {
    private int sumnightsFullPrice;
    private int sumnightsDiscounted;
    private int summeals25Euro;
    private int summeals10_50Euro;
    private int totalCost;

    public ResultData(int sumnightsFullPrice, int sumnightsDiscounted, int summeals25Euro, int summeals10_50Euro, int totalCost) {
        this.sumnightsFullPrice = sumnightsFullPrice;
        this.sumnightsDiscounted = sumnightsDiscounted;
        this.summeals25Euro = summeals25Euro;
        this.summeals10_50Euro = summeals10_50Euro;
        this.totalCost = totalCost;
    }

    public int getSumnightsFullPrice() {
        return sumnightsFullPrice;
    }

    public int getSumnightsDiscounted() {
        return sumnightsDiscounted;
    }

    public int getSummeals25Euro() {
        return summeals25Euro;
    }

    public int getSummeals10_50Euro() {
        return summeals10_50Euro;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
