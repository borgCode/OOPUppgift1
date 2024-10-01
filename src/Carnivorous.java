public class Carnivorous extends Plant {
    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateWaterNeed() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public String getWaterType() {
        return WaterType.PROTEIN_DRINK.displayName;
    }


}
