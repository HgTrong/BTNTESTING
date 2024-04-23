package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDateTest {
    @Test
    public void testNextDateWithinMonth() {
        assertEquals("2/5/2009", NextDate.getNextDate(1, 5, 2009));
    }

    @Test
    public void testNextDateEndOfMonth() {
        assertEquals("1/6/2000", NextDate.getNextDate(31, 5, 2000));
    }

    @Test
    public void testNextDateEndOfYear() {
        assertEquals("1/1/2004", NextDate.getNextDate(31, 12, 2003));
    }

    @Test
    public void testNextDateLeapYear() {
        assertEquals("29/2/2012", NextDate.getNextDate(28, 2, 2012));
        assertEquals("1/3/2012", NextDate.getNextDate(29, 2, 2012));

    }
    -*
    @Test
    public void testNextDateNotATriangle() {
        assertEquals("Không hợp lệ", NextDate.getNextDate(0, 5, 2024));
    }
}