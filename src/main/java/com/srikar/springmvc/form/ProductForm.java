package com.srikar.springmvc.form;

/**
 * Created by vedantas on 1/31/2018.
 */
public class ProductForm {

    private String name;
    private String description;
    private String price;

    public ProductForm(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public ProductForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
