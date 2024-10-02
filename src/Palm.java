public class Palm extends Plant {
    public Palm(String name, double height) {
        super(name, height);
    }
    
    @Override
    public String calculateWaterNeed() {
        return formatWaterNeed(0.5 * getHeight());
    }

    @Override
    public String getWaterType() {
        return WaterType.TAPWATER.displayName;
    }
    
}
