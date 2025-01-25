package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testNaivePower() {
        assertEquals(8, App.naivePower(2, 3));
        assertEquals(1, App.naivePower(5, 0));
        assertEquals(0, App.naivePower(0, 5));
    }

    @Test
    void testUnoptimizedDCPower() {
        assertEquals(8, App.unoptimizedDCPower(2, 3));
        assertEquals(1, App.unoptimizedDCPower(5, 0));
        assertEquals(0, App.unoptimizedDCPower(0, 5));
    }

    @Test
    void testOptimizedDCPower() {
        assertEquals(8, App.optimizedDCPower(2, 3));
        assertEquals(1, App.optimizedDCPower(5, 0));
        assertEquals(0, App.optimizedDCPower(0, 5));
    }
}