public class Cactus extends Plant {
    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public String calculateWaterNeed() {
        return formatWaterNeed(0.02);
    }

    @Override
    public String getWaterType() {
        return WaterType.MINERAL_WATER.displayName;
    }


}
