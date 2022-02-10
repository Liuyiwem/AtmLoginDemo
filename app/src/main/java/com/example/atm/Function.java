package com.example.atm;

public class Function {
    String name;
    int icon;

    public Function() {
    }

    public Function(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public Function(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
