package org.geometry.threed;

public class Pyramid {
    private final double baseSideLength; // Длина стороны основания
    private final int baseSidesCount;    // Количество сторон (3 для треугольной и т.д.)
    private final double height;         // Высота пирамиды

    public Pyramid(double baseSideLength, int baseSidesCount, double height) {
        this.baseSideLength = baseSideLength;
        this.baseSidesCount = baseSidesCount;
        this.height = height;
    }

    public double getVolume() {
        double baseArea = getBaseArea();
        return (1.0 / 3) * baseArea * height;
    }

    public double getSurfaceArea() {
        double baseArea = getBaseArea();
        double lateralArea = 0.5 * getBasePerimeter() * getSlantHeight();
        return baseArea + lateralArea;
    }

    private double getBaseArea() {
        return (baseSidesCount * baseSideLength * baseSideLength) /
                (4 * Math.tan(Math.PI / baseSidesCount));
    }

    private double getBasePerimeter() {
        return baseSidesCount * baseSideLength;
    }

    private double getSlantHeight() {
        double apothem = baseSideLength / (2 * Math.tan(Math.PI / baseSidesCount));
        return Math.sqrt(height * height + apothem * apothem);
    }
}