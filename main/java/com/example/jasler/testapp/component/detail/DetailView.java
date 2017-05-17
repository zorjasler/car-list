package com.example.jasler.testapp.component.detail;

/**
 * Created by jasler on 5/17/17.
 */

public interface DetailView {

    void showProgress();

    void hideProgress();

    void showErrorMessage(int error_msg);

    void setThumbnail(String thumbnail);

    void setBrand(String brand);

    void setModel(String model);

    void setYear(String year);

    void setWeight(double brand);

    void setPower(int power);

    void setTorque(int torque);

    void setPrice(int price);
}
