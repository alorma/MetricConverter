package com.alorma.metric;

public enum MetricUnit implements MetricConvert {

    CENTIMETER {
        @Override
        public long toCentimeters(long d) {
            return d;
        }

        @Override
        public long toMeters(long d) {
            return d / CM_IN_METER;
        }

        @Override
        public long toKilometers(long d) {
            return d / (METERS_IN_KM * CM_IN_METER);
        }
    },


    METER {
        @Override
        public long toCentimeters(long d) {
            return d * CM_IN_METER;
        }

        @Override
        public long toMeters(long d) {
            return d;
        }

        @Override
        public long toKilometers(long d) {
            return d / METERS_IN_KM;
        }
    };

    public static final int CM_IN_METER = 100;
    public static final int METERS_IN_KM = 1000;
}
