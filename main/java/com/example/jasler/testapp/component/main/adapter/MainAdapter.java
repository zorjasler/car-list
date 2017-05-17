package com.example.jasler.testapp.component.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jasler.testapp.R;
import com.example.jasler.testapp.component.main.MainActivity;
import com.example.jasler.testapp.model.CarDetailModel;
import com.example.jasler.testapp.model.CarListModel;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jasler on 5/17/17.
 */

public class MainAdapter  extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context context;
    private CarListModel mDataset;
    private MainActivity.AdapterEventListener mAdapterEventListener;

    public MainAdapter(Context ctx, CarListModel myDataset,
                       MainActivity.AdapterEventListener adapterEventListener) {
        context = ctx;
        mDataset = myDataset;
        mAdapterEventListener = adapterEventListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_main_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(context, position, mAdapterEventListener);
    }

    @Override
    public int getItemCount() {
        return mDataset.getCars().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.char_thumb) ImageView carThumbnail;
        @BindView(R.id.char_brand) TextView carBrand;
        @BindView(R.id.char_model) TextView carModel;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(Context ctx, final int position,
                         final MainActivity.AdapterEventListener mAdapterEventListener) {

            CarDetailModel carDetail = mDataset.getCars().get(position);
            String thumb = carDetail.getThumbnail();

            if (thumb != null) {
                Picasso.with(context).load(thumb).into(carThumbnail);
            }

            carBrand.setText(carDetail.getBrand());
            carModel.setText(carDetail.getModel());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mAdapterEventListener.onListItemClick(position);
                }
            });
        }
    }
}
