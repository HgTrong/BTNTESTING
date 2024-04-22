package org.example;

public class TriangleClassifier {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String result = classifyTriangle(side1, side2, side3);
        System.out.println("Loại tam giác: " + result);
    }

    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Không là tam giác";
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            return "Không là tam giác";
        } else if (a == b && b == c) {
            return "Tam giác đều (Equilateral)";
        } else if (a == b || b == c || a == c) {
            return "Tam giác cân (Isosceles)";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Tam giác vuông (Right Triangle)";
        } else {
            return "Tam giác thường (Scalene)";
        }
    }
}
