package com.judy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.judy.model.InputData;
import com.judy.model.ResultData;

public class Aufgabe2Test {

    @Test
    public void testReadDataIn() {
        InputData inputData = Aufgabe2.readDataIn();
        assertEquals(2, inputData.getNumberOfPeople());
        assertEquals(7, inputData.getNumberOfNights());
        assertEquals(3, inputData.getNumberOfMealsPerDay());
    }

    @Test
    public void testCalculate() {
        InputData inputData = new InputData(2, 7, 3);
        ResultData resultData = Aufgabe2.calculate(inputData);        
        assertEquals(2 * 7 % 7 * 120, resultData.getSumnightsFullPrice());
        assertEquals(2 * 120 * 6, resultData.getSumnightsDiscounted());
        assertEquals(2 * 25, resultData.getSummeals25Euro());
        assertEquals(1 * 10 + 1 * 0.5, resultData.getSummeals10_50Euro(), 0.001);
        assertEquals(2 * 7 * 120 + 2 * 25 + 1 * 10 + 1 * 0.5, resultData.getTotalCost(), 0.001);
    }

    @Test
    public void testPrintBookingData() {
        InputData inputData = new InputData(2, 7, 3);
        ResultData resultData = Aufgabe2.calculate(inputData);
        Aufgabe2.printBookingData(resultData, inputData);
        // TODO: Check console output
    }

    @Test
    public void testCalculateWithZeroMeals() {
        InputData inputData = new InputData(2, 7, 0);
        ResultData resultData = Aufgabe2.calculate(inputData);        
        assertEquals(2 * 7 % 7 * 120, resultData.getSumnightsFullPrice());
        assertEquals(2 * 120 * 6, resultData.getSumnightsDiscounted());
        assertEquals(0, resultData.getSummeals25Euro());
        assertEquals(0, resultData.getSummeals10_50Euro(), 0.001);
        assertEquals(2 * 7 * 120, resultData.getTotalCost(), 0.001);
    }

    @Test
    public void testCalculateWithOnePerson() {
        InputData inputData = new InputData(1, 7, 1);
        ResultData resultData = Aufgabe2.calculate(inputData);        
        assertEquals(7 * 120, resultData.getSumnightsFullPrice());
        assertEquals(0, resultData.getSumnightsDiscounted());
        assertEquals(1 * 25, resultData.getSummeals25Euro());
        assertEquals(0, resultData.getSummeals10_50Euro(), 0.001);
        assertEquals(7 * 120 + 1 * 25, resultData.getTotalCost(), 0.001);
    }

    @Test
    public void testCalculateWithMultipleWeeks() {
        InputData inputData = new InputData(2, 14, 2);
        ResultData resultData = Aufgabe2.calculate(inputData);        
        assertEquals(2 * 7 * 120, resultData.getSumnightsFullPrice());
        assertEquals(2 * 120 * 12, resultData.getSumnightsDiscounted());
        assertEquals(2 * 2 * 25, resultData.getSummeals25Euro());
        assertEquals(0, resultData.getSummeals10_50Euro(), 0.001);
        assertEquals(2 * 14 * 120 + 2 * 2 * 25, resultData.getTotalCost(), 0.001);
    }

    @Test
    public void testCalculateWithThreeMeals() {
        InputData inputData = new InputData(2, 7, 3);
        ResultData resultData = Aufgabe2.calculate(inputData);        
        assertEquals(2 * 7 % 7 * 120, resultData.getSumnightsFullPrice());
        assertEquals(2 * 120 * 6, resultData.getSumnightsDiscounted());
        assertEquals(2 * 2 * 25, resultData.getSummeals25Euro());
        assertEquals(1 * 10 + 1 * 0.5, resultData.getSummeals10_50Euro(), 0.001);
        assertEquals(2 * 7 * 120 + 2 * 25 + 1 * 10 + 1 * 0.5, resultData.getTotalCost(), 0.001);
    }
}