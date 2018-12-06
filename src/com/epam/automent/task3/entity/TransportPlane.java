package com.epam.automent.task3.entity;


public class TransportPlane extends Plane{
    private int capacity;

    public TransportPlane (String inModel, int inRange,int inCapacity){
        super(inModel,inRange);
        this.capacity = inCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportPlane)) return false;
        if (!super.equals(o)) return false;

        TransportPlane that = (TransportPlane) o;

        return getCapacity() == that.getCapacity();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCapacity();
        return result;
    }

    @Override
    public String toString(){

        return "Transport Plane: Model is " + getModel() + ", range = " + getRange() + ", capacity = " + capacity;
    }
    @Override
    public void printInfo(){
        System.out.println(this.toString());
    }
}
