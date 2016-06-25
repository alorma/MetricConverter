package com.alorma.metric;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetricUnitMeterTestShould {

    public static final int METER_IN_CM = 100;
    public static final int METERS_IN_KM = 1000;
    public static final int KILOMETER_IN_CM = METERS_IN_KM * METER_IN_CM;
    private MetricUnit meter;

    @Before
    public void setUp() {
        meter = MetricUnit.METER;
    }

    @Test
    public void return100Meters_whenConvert100Meters() {
        long meters = meter.toMeters(METER_IN_CM);
        assertEquals(meters, METER_IN_CM);
    }

    @Test
    public void return100Centimeters_whenConvert1Meter() {
        long centimeters = meter.toCentimeters(1);
        assertEquals(centimeters, 100);
    }

    @Test
    public void return1KiloMeter_whenConvert1000Meter() {
        long kilometers = meter.toKilometers(METERS_IN_KM);
        assertEquals(kilometers, 1);
    }

    @Test
    public void return2Kilometers_whenConvert2000Meters() {
        long kilometers = meter.toKilometers(2 * METERS_IN_KM);
        assertEquals(kilometers, 2);
    }

}