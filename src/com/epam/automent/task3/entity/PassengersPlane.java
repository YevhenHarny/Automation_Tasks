package com.epam.automent.task3.entity;


public class PassengersPlane extends Plane {
    private int seatsAmount;

    public PassengersPlane(String inModel, int inRange, int inSeatsAmount){
        super(inModel,inRange);
        this.seatsAmount = inSeatsAmount;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengersPlane)) return false;
        if (!super.equals(o)) return false;

        PassengersPlane that = (PassengersPlane) o;

        return getSeatsAmount() == that.getSeatsAmount();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSeatsAmount();
        return result;
    }

    @Override
    public String toString(){

        return "Passengers Plane: Model is " + getModel() + ", range = " + getRange() + ", seats Amount = " + seatsAmount;
    }

    @Override
    public void printInfo() {
        System.out.println(this.toString());
    }
}
