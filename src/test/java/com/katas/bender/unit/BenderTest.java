package com.katas.bender.unit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.katas.bender.BenderJavaKata;
import java.io.*;


public class BenderTest {
    ByteArrayOutputStream buffer;
    String content = "";

    @Before
    public void setUp() {
        buffer = new ByteArrayOutputStream();

        System.setOut(new PrintStream(buffer));
    }

    @After
    public void tearDown() {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }

    @Test
    public void main_works() {
        // Given
        String[] args = new String[0];
        String myString = "quit\n";
        InputStream is = new ByteArrayInputStream(myString.getBytes());

        System.setIn(is);

        // When
        BenderJavaKata.main(args);

        content = buffer.toString();

        // Then
        assertThat(content).isEqualToNormalizingNewlines(
                        "Choose which maze you want to resolve ?\n" +
                        "\n" +
                        "1  -> Simple move\n" +
                        "2  -> Obstacle\n" +
                        "3  -> Orientation Priority\n" +
                        "4  -> Straight Lines\n" +
                        "5  -> Direction Modifiers\n" +
                        "6  -> Beer effect\n" +
                        "7  -> Inverser\n" +
                        "8  -> Teleporter\n" +
                        "9  -> Broken Wall ?\n" +
                        "10 -> Complete\n" +
                        "11 -> Loop\n" +
                        "12 -> Master Maze\n" +
                        "\n" +
                        "Or press 0 to exit\n" +
                        "\n" +
                        "Enter your choice:\n" +
                        "Cheers !\n"
        );
    }
}