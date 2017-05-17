package com.example.jasler.testapp.component.main;

import com.example.jasler.testapp.connection.ConnectionInterface;
import com.example.jasler.testapp.connection.ConnectionService;
import com.example.jasler.testapp.model.CarListModel;
import com.example.jasler.testapp.repository.mapper.CarListModelDataMapper;
import com.example.jasler.testapp.repository.response.CarListResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jasler on 5/17/17.
 */

public class MainInteractorImpl implements MainInteractor {

    public MainInteractorImpl() {}

    @Override
    public void getCarList(final MainPresenterImpl.ResultCallback mResultCallback) {

        ConnectionInterface mService = ConnectionService.createService(ConnectionInterface.class);
        Call<CarListResponse> call = mService.getCarList();

        call.enqueue(new Callback<CarListResponse>() {
            @Override
            public void onResponse(Call<CarListResponse> call, Response<CarListResponse> response) {
                if (response.isSuccessful()) {
                    CarListResponse mData = response.body();
                    if (mData.getCars() == null) {
                        mResultCallback.onParseError();
                    } else {
                        CarListModel mCarListData = CarListModelDataMapper.mapToCarListModel(mData);
                        mResultCallback.onSuccess(mCarListData);
                    }
                } else {
                    mResultCallback.onError();
                }
            }

            @Override
            public void onFailure(Call<CarListResponse> call, Throwable t) {
                mResultCallback.onError();
            }
        });
    }
}
