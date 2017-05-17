package com.example.jasler.testapp.repository.mapper;

import com.example.jasler.testapp.model.CarDetailModel;
import com.example.jasler.testapp.repository.response.CarDetailResponse;

/**
 * Created by jasler on 5/17/17.
 */

public class CarDetailModelDataMapper {

    public static CarDetailModel mapToCarDetailModel(CarDetailResponse response) {
        CarDetailModel car = new CarDetailModel();

        car.setBrand(response.getBrand());
        car.setModel(response.getModel());
        car.setThumbnail(response.getThumbnail());
        car.setWeight(response.getWeight());
        car.setPower(response.getPower());
        car.setTorque(response.getTorque());
        car.setPrice(response.getPrice());

        return car;
    }
}
