package com.company;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINS, ANY;
    public String toString() {
        switch (this) {
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case MARTIN: return "Martin";
            case COLLINS:return "Collins";
            case ANY    : return "Any";
            default:     return "";
        }
    }
}
