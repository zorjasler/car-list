package com.example.jasler.testapp.repository.response;

import java.util.List;

/**
 * Created by jasler on 5/17/17.
 */

public class CarListResponse {

    private List<CarDetailResponse> cars = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public CarListResponse() {
    }

    /**
     *
     * @param cars The list of cars
     */
    public CarListResponse(List<CarDetailResponse> cars) {
        super();
        this.cars = cars;
    }

    public List<CarDetailResponse> getCars() {
        return cars;
    }

    public void setCars(List<CarDetailResponse> cars) {
        this.cars = cars;
    }

    public CarListResponse withCars(List<CarDetailResponse> cars) {
        this.cars = cars;
        return this;
    }
}
