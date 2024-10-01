public abstract class Plant implements IWaterNeed {
    private String name;
    private double height; //Höjd i meter

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    //Inkapsling
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
    
}
