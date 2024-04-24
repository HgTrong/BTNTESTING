package org.example;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Tam giác đều (Equilateral)", TriangleClassifier.classifyTriangle(3, 3, 3));
    }
    @Test
    public void testNotATriangle(){
        //trường hợp cạnh =0
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(0,0,0));
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(1,0,0));
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(0,1,0));
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(0,0,1));
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(1,1,0));
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(1,0,1));
        //trường hợp tổng cạnh < hơn cạnh còn lại
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(1,1,2));
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(1,2,1));
        assertEquals("Không là tam giác",TriangleClassifier.classifyTriangle(2,1,1));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Tam giác cân (Isosceles)", TriangleClassifier.classifyTriangle(3, 3, 2));
        assertEquals("Tam giác cân (Isosceles)", TriangleClassifier.classifyTriangle(2, 3, 3));
        assertEquals("Tam giác cân (Isosceles)", TriangleClassifier.classifyTriangle(3, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Tam giác thường (Scalene)", TriangleClassifier.classifyTriangle(3, 7, 5));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("Tam giác vuông (Right Triangle)", TriangleClassifier.classifyTriangle(3, 4, 5));
        assertEquals("Tam giác vuông (Right Triangle)", TriangleClassifier.classifyTriangle(5, 4, 3));
        assertEquals("Tam giác vuông (Right Triangle)", TriangleClassifier.classifyTriangle(3, 5, 4));
        assertEquals("Tam giác vuông (Right Triangle)", TriangleClassifier.classifyTriangle(4, 5, 3));
    }

}