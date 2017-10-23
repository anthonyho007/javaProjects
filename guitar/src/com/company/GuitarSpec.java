package com.company;

public class GuitarSpec {
    private Type type;
    private Builder builder;
    private String model;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.type = type;
        this.model = model;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec targetGuitar) {
        if (( this.getModel() != null) && (!this.getModel().equals("")) && (!this.getModel().equals(targetGuitar.getModel())))
            return false;
        if (this.getType() != targetGuitar.getType())
            return false;
        if (this.getBackWood() != targetGuitar.getBackWood())
            return false;
        if (this.getTopWood() != targetGuitar.getTopWood())
            return false;
        return true;
    }
}
