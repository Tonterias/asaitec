package com.asiatec.fruitshop.dto;

import java.util.List;

public class Receipt {

    private double totalAmount;
    private double subTotalAmount;
    private double specialDiscount;
    private List<ReceiptProduct> products;
    private List<String> offersApplied;

    public Receipt() {
    }
    
    public Receipt(double totalAmount, double subTotalAmount, double specialDiscount, List<ReceiptProduct> products,
            List<String> offersApplied) {
        this.totalAmount = totalAmount;
        this.subTotalAmount = subTotalAmount;
        this.specialDiscount = specialDiscount;
        this.products = products;
        this.offersApplied = offersApplied;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getSubTotalAmount() {
        return subTotalAmount;
    }

    public void setSubTotalAmount(double subTotalAmount) {
        this.subTotalAmount = subTotalAmount;
    }

    public double getSpecialDiscount() {
        return specialDiscount;
    }

    public void setSpecialDiscount(double specialDiscount) {
        this.specialDiscount = specialDiscount;
    }

    public List<ReceiptProduct> getProducts() {
        return products;
    }

    public void setProducts(List<ReceiptProduct> products) {
        this.products = products;
    }

    public List<String> getOffersApplied() {
        return offersApplied;
    }

    public void setOffersApplied(List<String> offersApplied) {
        this.offersApplied = offersApplied;
    }

    @Override
    public String toString() {
        return "Receipt [offersApplied=" + offersApplied + ", products=" + products + ", specialDiscount="
                + specialDiscount + ", subTotalAmount=" + subTotalAmount + ", totalAmount=" + totalAmount + "]";
    }
   
}
