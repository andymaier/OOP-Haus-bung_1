package test.java.com.judy.myapp;

import com.judy.myapp.Aufgabe1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Aufgabe1Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testGetUserInput() throws IOException {
        // Prepare
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Execute
        int result = Aufgabe1.getUserInput();

        // Verify
        assertEquals(53, result);
    }

    @Test
    public void testPrintBasedOnUserInput() {
        // Prepare
        int numberOfOutputs = 3;

        // Execute
        Aufgabe1.printBasedOnUserInput(numberOfOutputs);

        // Verify
        assertEquals("Output number 1: Hello World!Output number 2: Hello World!Output number 3: Hello World!", getConsoleOutput());
    }

    private String getConsoleOutput() {
        return outContent.toString();
    }
}