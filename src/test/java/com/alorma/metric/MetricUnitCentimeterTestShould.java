package com.alorma.metric;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetricUnitCentimeterTestShould {

    public static final int METER_IN_CM = 100;
    public static final int METERS_IN_KM = 1000;
    public static final int KILOMETER_IN_CM = METERS_IN_KM * METER_IN_CM;
    private MetricUnit centimeter;

    @Before
    public void setUp() {
        centimeter = MetricUnit.CENTIMETER;
    }

    @Test
    public void return100Centimeters_whenConvert100Centimeters() {
        long centimeters = centimeter.toCentimeters(METER_IN_CM);
        assertEquals(centimeters, METER_IN_CM);
    }

    @Test
    public void return1Meter_whenConvert100Centimeters() {
        long meters = centimeter.toMeters(METER_IN_CM);
        assertEquals(meters, 1);
    }

    @Test
    public void return1KiloMeter_whenConvert100Centimeters() {
        long kilometers = centimeter.toKilometers(KILOMETER_IN_CM);
        assertEquals(kilometers, 1);
    }

}