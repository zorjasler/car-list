package com.example.jasler.testapp.component.main;

import com.example.jasler.testapp.model.CarDetailModel;
import com.example.jasler.testapp.model.CarListModel;

/**
 * Created by jasler on 5/17/17.
 */

public interface MainView {

    void showProgress();

    void hideProgress();

    void setData(CarListModel cars);

    void showErrorMessage(int err_msg);

    void navigateToDetail(CarDetailModel car);
}
