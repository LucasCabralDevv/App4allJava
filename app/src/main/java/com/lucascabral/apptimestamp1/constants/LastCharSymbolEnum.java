package com.lucascabral.apptimestamp1.constants;

public enum LastCharSymbolEnum {

    WHITE_SYMBOL("0"),
    BLACK_SYMBOL("1"),
    BLUE_SYMBOL("2"),
    GREEN_SYMBOL("3"),
    PINK_SYMBOL("4"),
    RED_SYMBOL("5"),
    PURPLE_SYMBOL("6"),
    YELLOW_SYMBOL("7"),
    GREY_SYMBOL("8"),
    LILAC_SYMBOL("9");

    private final String color;

    LastCharSymbolEnum(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
