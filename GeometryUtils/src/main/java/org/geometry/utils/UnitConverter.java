package org.geometry.utils;

import org.geometry.shapes.*;

public class UnitConverter {
    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    public static double centimetersToMeters(double cm) {
        return cm / 100;
    }
}