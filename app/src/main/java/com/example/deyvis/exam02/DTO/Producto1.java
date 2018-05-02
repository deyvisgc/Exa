package com.example.deyvis.exam02.DTO;

/**
 * Created by DEYVIS on 02/05/2018.
 */

public class Producto1 {
    public String name_product;
   public String precio;
   public String  stock;

    public Producto1() {
    }

    public Producto1(String name_product, String precio, String stock) {
        this.name_product = name_product;
        this.precio = precio;
        this.stock = stock;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
