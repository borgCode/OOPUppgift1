public class Palm extends Plant {
    public Palm(String name, double height) {
        super(name, height);
    }
    
    @Override
    public double calculateWaterNeed() {
        return 0.5 * getHeight();
    }

    @Override
    public String getWaterType() {
        return WaterType.TAPWATER.displayName;
    }
    
}
