package com.epam.automent.task3.entity;


public abstract class Plane {
    private String model;
    private int range;

    public Plane(){
    }

    public Plane(String inModel,int inRange){
        this.model = inModel;
        this.range = inRange;
    }

    public abstract void printInfo();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;

        Plane plane = (Plane) o;

        return getRange() == plane.getRange() && getModel().equals(plane.getModel());

    }

    @Override
    public int hashCode() {
        int result = getModel().hashCode();
        result = 31 * result + getRange();
        return result;
    }
}
