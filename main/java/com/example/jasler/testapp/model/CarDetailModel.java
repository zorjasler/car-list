package com.example.jasler.testapp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jasler on 5/17/17.
 */

public class CarDetailModel implements Parcelable {

    private int id;
    private String brand;
    private String model;
    private String thumbnail;
    private String year;
    private double weight;
    private int power;
    private int torque;
    private int price;

    /**
     * No args constructor for use in serialization
     *
     */
    public CarDetailModel() {
    }

    /**
     *
     * @param id The id
     * @param model The model name
     * @param price The car price ($)
     * @param weight The car kurb weight (kg)
     * @param thumbnail A car thumbnail
     * @param power The car power output (bhp)
     * @param brand The car brand
     * @param torque The car torque (Nm)
     * @param year The car production year
     */
    public CarDetailModel(int id, String brand, String model, String thumbnail, String year,
                          double weight, int power, int torque, int price) {
        super();
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.thumbnail = thumbnail;
        this.year = year;
        this.weight = weight;
        this.power = power;
        this.torque = torque;
        this.price = price;
    }

    public CarDetailModel (Parcel in) {

        id = in.readInt();
        brand = in.readString();
        model = in.readString();
        thumbnail = in.readString();
        year = in.readString();
        weight = in.readDouble();
        power = in.readInt();
        torque = in.readInt();
        price = in.readInt();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarDetailModel withId(int id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarDetailModel withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarDetailModel withModel(String model) {
        this.model = model;
        return this;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public CarDetailModel withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public CarDetailModel withYear(String year) {
        this.year = year;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public CarDetailModel withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public CarDetailModel withPower(int power) {
        this.power = power;
        return this;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public CarDetailModel withTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarDetailModel withPrice(int price) {
        this.price = price;
        return this;
    }

    public static final Parcelable.Creator<Object> CREATOR = new Parcelable.Creator<Object>() {
        @Override
        public CarDetailModel createFromParcel(Parcel in) {
            return new CarDetailModel(in);
        }

        @Override
        public CarDetailModel[] newArray(int size) {
            return new CarDetailModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(brand);
        dest.writeString(model);
        dest.writeString(thumbnail);
        dest.writeString(year);
        dest.writeDouble(weight);
        dest.writeInt(power);
        dest.writeInt(torque);
        dest.writeInt(price);
    }
}