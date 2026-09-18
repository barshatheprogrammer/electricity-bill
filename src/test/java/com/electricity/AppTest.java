package com.electricity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testZeroUnits() {
        assertEquals(0.0, App.calculateBill(0));
    }

    @Test
    void test100Units() {
        assertEquals(250.0, App.calculateBill(100));
    }

    @Test
    void test150Units() {
        assertEquals(450.0, App.calculateBill(150));
    }

    @Test
    void test200Units() {
        assertEquals(650.0, App.calculateBill(200));
    }

    @Test
    void test300Units() {
        assertEquals(1200.0, App.calculateBill(300));
    }

    @Test
    void test500Units() {
        assertEquals(2300.0, App.calculateBill(500));
    }

    @Test
    void test600Units() {
        assertEquals(3000.0, App.calculateBill(600));
    }

    @Test
    void testNegativeUnits() {
        assertThrows(
                IllegalArgumentException.class,
                () -> App.calculateBill(-10)
        );
    }
}