package com.example.jasler.testapp.component.detail;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jasler.testapp.R;
import com.example.jasler.testapp.model.CarDetailModel;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jasler on 5/17/17.
 */

public class DetailActivity extends AppCompatActivity implements DetailView {

    private static final String INTENT_OBJECT_KEY = "car";

    /* Bindings */
    @BindView(R.id.rl_detail) public RelativeLayout rlDetail;
    @BindView(R.id.car_thumb_big) public ImageView detailThumbnail;
    @BindView(R.id.detail_brand) public TextView detailBrand;
    @BindView(R.id.detail_model) public TextView detailModel;
    @BindView(R.id.detail_year) public TextView detailYear;
    @BindView(R.id.detail_weight) public TextView detailWeight;
    @BindView(R.id.detail_power) public TextView detailPower;
    @BindView(R.id.detail_torque) public TextView detailTorque;
    @BindView(R.id.detail_price) public TextView detailPrice;
    @BindView(R.id.progressBar) public ProgressBar progressBar;

    public DetailPresenter mPresenter = new DetailPresenterImpl(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        CarDetailModel car = getIntent().getParcelableExtra(INTENT_OBJECT_KEY);
        mPresenter.onCreate(car);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showErrorMessage(int error_msg) {
        Snackbar.make(rlDetail, getString(error_msg), Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void setThumbnail(String thumbnail) {
        Picasso.with(this).load(thumbnail).into(detailThumbnail);
    }

    @Override
    public void setBrand(String brand) {
        detailBrand.setText(brand);
    }

    @Override
    public void setModel(String model) {
        detailModel.setText(model);
    }

    @Override
    public void setYear(String year) {
        detailYear.setText(year);
    }

    @Override
    public void setWeight(double weight) {
        detailWeight.setText(String.valueOf(weight));
    }

    @Override
    public void setPower(int power) {
        detailPower.setText(String.valueOf(power));
    }

    @Override
    public void setTorque(int torque) {
        detailTorque.setText(String.valueOf(torque));
    }

    @Override
    public void setPrice(int price) {
        detailPrice.setText(String.valueOf(price));
    }
}
