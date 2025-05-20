package parrot;

public abstract class Parrot {

    public abstract double getSpeed();
    public abstract String getCry();

    protected double getBaseSpeed() {
        return 12.0;
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double calculateSpeedWithVoltage(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
