package com.company;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILLIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO;
    public String toString () {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case MAPLE:
                return "Maple";
            case COCOBOLO:
                return "Cocobolo";
            case BRAZILLIAN_ROSEWOOD:
                return "Brazillian Rosewood";
            case MAHOGANY:
                return "Mahogany";
            default:
                return "";
        }
    }
}
