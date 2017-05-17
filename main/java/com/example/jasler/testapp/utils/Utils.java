package com.example.jasler.testapp.utils;

import com.example.jasler.testapp.model.CarDetailModel;
import com.example.jasler.testapp.repository.mapper.CarDetailModelDataMapper;
import com.example.jasler.testapp.repository.response.CarDetailResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasler on 5/17/17.
 */

public class Utils {

    public static List<CarDetailModel> convertToCarListModel(List<CarDetailResponse> list){
        List<CarDetailModel> carList = new ArrayList<>();
        if (list != null){
            for (CarDetailResponse car : list) {
                carList.add(car != null ? CarDetailModelDataMapper.mapToCarDetailModel(car) : null);
            }
        }
        return carList;
    }
}
