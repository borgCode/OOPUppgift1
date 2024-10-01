public class Cactus extends Plant {
    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateWaterNeed() {
        return 0.02;
    }

    @Override
    public String getWaterType() {
        return WaterType.MINERAL_WATER.displayName;
    }


}
