package com.example.jasler.testapp.repository.response;

/**
 * Created by jasler on 5/17/17.
 */

public class CarDetailResponse {

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
    public CarDetailResponse() {
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
    public CarDetailResponse(int id, String brand, String model, String thumbnail, String year,
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarDetailResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarDetailResponse withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarDetailResponse withModel(String model) {
        this.model = model;
        return this;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public CarDetailResponse withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public CarDetailResponse withYear(String year) {
        this.year = year;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public CarDetailResponse withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public CarDetailResponse withPower(int power) {
        this.power = power;
        return this;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public CarDetailResponse withTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CarDetailResponse withPrice(int price) {
        this.price = price;
        return this;
    }
}
