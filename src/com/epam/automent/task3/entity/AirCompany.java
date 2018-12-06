package com.epam.automent.task3.entity;

import java.util.ArrayList;
import java.util.List;


public class AirCompany {
    private List<Plane> airCompLst = new ArrayList<>();

    public AirCompany() {

    }

    public List<Plane> getAirCompLst() {
        return airCompLst;
    }

    public void add(Plane unit) {
        airCompLst.add(unit);
    }

    public void add(List<? extends Plane> planes) {
        airCompLst.addAll(planes);
    }

    public boolean delete(Plane unit) {
        return airCompLst.remove(unit);
    }

    public void setAirCompLst(ArrayList<Plane> airCompLst) {
        this.airCompLst = airCompLst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirCompany)) return false;

        AirCompany airport = (AirCompany) o;

        return getAirCompLst().equals(airport.getAirCompLst());
    }

    @Override
    public int hashCode() {
        return getAirCompLst().hashCode();
    }
}
