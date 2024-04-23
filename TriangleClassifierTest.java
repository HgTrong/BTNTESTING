package org.example;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Tam giác đều (Equilateral)", TriangleClassifier.classifyTriangle(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Tam giác cân (Isosceles)", TriangleClassifier.classifyTriangle(3, 3, 2));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Tam giác thường (Scalene)", TriangleClassifier.classifyTriangle(3, 7, 5));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("Tam giác vuông (Right Triangle)", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Không là tam giác", TriangleClassifier.classifyTriangle(0, 4, 5));
    }
}