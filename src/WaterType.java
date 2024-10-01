public enum WaterType {
    TAPWATER("kranvatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");

    public final String displayName;

    WaterType(String displayName) {
        this.displayName = displayName;
    }
}
