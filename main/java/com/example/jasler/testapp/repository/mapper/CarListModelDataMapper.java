package com.example.jasler.testapp.repository.mapper;

import com.example.jasler.testapp.model.CarListModel;
import com.example.jasler.testapp.repository.response.CarListResponse;
import com.example.jasler.testapp.utils.Utils;

/**
 * Created by jasler on 5/17/17.
 */

public class CarListModelDataMapper {

    public static CarListModel mapToCarListModel(CarListResponse response){
        CarListModel carList = new CarListModel();

        carList.setCars(Utils.convertToCarListModel(response.getCars()));

        return carList;
    }
}
