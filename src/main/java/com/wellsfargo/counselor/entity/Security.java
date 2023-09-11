package com.wellsfargo.counselor.entity;

//Import libraries
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable=false)
    private String Category;

    @Column(nullable=false)
    private String Purchase_Date;

    @Column(nullable = false)
    private String Purchase_Price;

    @Column(nullable = false)
    private String Quantity;

    protected Security(){

    }

    public Security(String Name, String Category, String Purchase_Date, String Purchase_Price, String Quantity){
        this.Name = Name;
        this.Category = Category;
        this.Purchase_Date = Purchase_Date;
        this.Purchase_Price = Purchase_Price;
        this.Quantity = Quantity;

    }

    public long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return Name;
    }

    public String getCategory() {
        return Category;
    }

    public String getPurchase_Date() {
        return Purchase_Date;
    }

    public String getPurchase_Price() {
        return Purchase_Price;
    }

    public String getQuantity() {
        return Quantity;
    }

    // Setters
    public void setName(String name) {
        Name = name;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setPurchase_Date(String purchase_Date) {
        Purchase_Date = purchase_Date;
    }

    public void setPurchase_Price(String purchase_Price) {
        Purchase_Price = purchase_Price;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }
}
