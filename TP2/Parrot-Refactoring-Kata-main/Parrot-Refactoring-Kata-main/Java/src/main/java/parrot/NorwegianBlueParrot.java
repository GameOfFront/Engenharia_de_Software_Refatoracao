package parrot;

public class NorwegianBlueParrot extends Parrot {

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        boolean isAbleToFly = !isNailed;
        double speedWhenFlying = calculateSpeedWithVoltage(voltage);

        return isAbleToFly ? speedWhenFlying : 0.0;
    }

    @Override
    public String getCry() {
        boolean hasVoltage = voltage > 0;
        String cryWithPower = "Bzzzzzz";
        String silentCry = "...";

        return hasVoltage ? cryWithPower : silentCry;
    }
}
