package com.asiatec.fruitshop.dto;

public class ReceiptProduct extends Product{

    private int quantity;
    private double discount;
    private double amount;

    public ReceiptProduct(Product product){
        super(product.getName(), product.getPrice());
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

   public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ReceiptProduct [amount=" + amount + ", discount=" + discount + ", quantity=" + quantity + "]";
    }
    
}
