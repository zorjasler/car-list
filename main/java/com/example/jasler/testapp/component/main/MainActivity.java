package com.example.jasler.testapp.component.main;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.jasler.testapp.R;
import com.example.jasler.testapp.component.detail.DetailActivity;
import com.example.jasler.testapp.component.main.adapter.MainAdapter;
import com.example.jasler.testapp.model.CarDetailModel;
import com.example.jasler.testapp.model.CarListModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String INTENT_OBJECT_KEY = "car";

    /* Bindings */
    @BindView(R.id.rl_carList) RelativeLayout rlCarList;
    @BindView(R.id.rv_carList) RecyclerView rvCarList;
    @BindView(R.id.progressBar) ProgressBar progressBar;

    public MainPresenter mPresenter = new MainPresenterImpl(this);
    public RecyclerView.Adapter mAdapter;
    public RecyclerView.LayoutManager mLayoutManager;

    /* ADAPTER LISTENER */
    public interface AdapterEventListener {
        void onListItemClick(int position);
    }

    private AdapterEventListener mAdapterEventListener = new AdapterEventListener() {
        @Override
        public void onListItemClick(int position) {
            mPresenter.onItemClick(position);
        }
    };
    /* ADAPTER LISTENER */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPresenter.onCreate();
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
    public void setData(CarListModel cars) {
        mLayoutManager = new LinearLayoutManager(this);
        rvCarList.setLayoutManager(mLayoutManager);
        mAdapter = new MainAdapter(this, cars, mAdapterEventListener);
        rvCarList.setHasFixedSize(true);
        rvCarList.setAdapter(mAdapter);
    }

    @Override
    public void showErrorMessage(int err_msg) {
        Snackbar.make(rlCarList, getString(err_msg), Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void navigateToDetail(CarDetailModel car) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(INTENT_OBJECT_KEY, car);
        startActivity(intent);
    }
}
