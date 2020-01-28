package com.company.tests;

import com.company.mathematics.Rectangle;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class RectangleTests {

    Rectangle rectangle;

    @BeforeAll
    static void initAll(){
        System.out.println("Before all!");
    }

    @BeforeEach
    void init(){rectangle = new Rectangle(3,6);}

    @Test
    public void areaTest(){
        int expected = 9;
        int actual = rectangle.area();
        assertEquals(expected, actual);
    }

    @Test
    void increaseSide11(){
        List<Integer> expected = Arrays.asList(4,13,23,33,43,53,63,73,83,93);
        List<Integer> actual = rectangle.increaseSide1();
        assertIterableEquals(expected, actual, "The list is not the one expected");
    }


}
