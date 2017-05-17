package com.example.jasler.testapp.component.detail;

import com.example.jasler.testapp.R;
import com.example.jasler.testapp.model.CarDetailModel;

/**
 * Created by jasler on 5/17/17.
 */

public class DetailPresenterImpl implements DetailPresenter {

    private DetailView mView;
    public DetailPresenterImpl(DetailView view) {
        mView = view;
    }

    @Override
    public void onCreate(CarDetailModel car) {
        mView.showProgress();
        setData(car);
        mView.hideProgress();
    }

    private void setData(CarDetailModel car) {
        if (car != null) {
            mView.setThumbnail(car.getThumbnail());
            mView.setBrand(car.getBrand());
            mView.setModel(car.getModel());
            mView.setYear(car.getYear());
            mView.setWeight(car.getWeight());
            mView.setPower(car.getPower());
            mView.setTorque(car.getTorque());
            mView.setPrice(car.getPrice());
        } else {
            mView.showErrorMessage(R.string.error_null_object);
        }
    }
}
