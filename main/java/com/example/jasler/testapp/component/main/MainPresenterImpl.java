package com.example.jasler.testapp.component.main;

import com.example.jasler.testapp.R;
import com.example.jasler.testapp.model.CarDetailModel;
import com.example.jasler.testapp.model.CarListModel;

/**
 * Created by jasler on 5/17/17.
 */

public class MainPresenterImpl implements MainPresenter {

    public interface ResultCallback {
        void onSuccess(CarListModel carList);
        void onError();
        void onParseError();
    }

    private CarListModel cars;
    private MainView mView;
    private MainInteractor mInteractor = new MainInteractorImpl();

    private ResultCallback mResultCallback = new ResultCallback() {
        @Override
        public void onSuccess(CarListModel carList) {
            cars = carList;
            mView.setData(carList);
            mView.hideProgress();
        }

        @Override
        public void onError() {
            mView.hideProgress();
            mView.showErrorMessage(R.string.error_fetching_data);
        }

        @Override
        public void onParseError() {
            mView.hideProgress();
            mView.showErrorMessage(R.string.error_parsing_data);
        }
    };

    public MainPresenterImpl(MainView view) {
        mView = view;
    }

    @Override
    public void onCreate() {
        mView.showProgress();
        mInteractor.getCarList(mResultCallback);
    }

    @Override
    public void onItemClick(int position) {
        CarDetailModel car = cars.getCars().get(position);
        mView.navigateToDetail(car);
    }
}
