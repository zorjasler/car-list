package com.example.jasler.testapp.model;

import java.util.List;

/**
 * Created by jasler on 5/17/17.
 */

public class CarListModel {

    private List<CarDetailModel> cars = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public CarListModel() {
    }

    /**
     *
     * @param cars The list of cars
     */
    public CarListModel(List<CarDetailModel> cars) {
        super();
        this.cars = cars;
    }

    public List<CarDetailModel> getCars() {
        return cars;
    }

    public void setCars(List<CarDetailModel> cars) {
        this.cars = cars;
    }

    public CarListModel withCars(List<CarDetailModel> cars) {
        this.cars = cars;
        return this;
    }
}
