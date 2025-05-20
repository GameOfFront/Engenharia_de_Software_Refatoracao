package parrot;

public class EuropeanParrot extends Parrot {

    @Override
    public double getSpeed() {
        double defaultSpeed = getBaseSpeed();
        return defaultSpeed;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
