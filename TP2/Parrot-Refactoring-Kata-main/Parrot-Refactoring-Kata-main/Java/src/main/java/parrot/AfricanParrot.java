package parrot;

public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        double loadPenalty = getLoadFactor() * numberOfCoconuts;
        double loadAdjustedSpeed = getBaseSpeed() - loadPenalty;
        double minimumSpeed = 0.0;

        return Math.max(minimumSpeed, loadAdjustedSpeed);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
