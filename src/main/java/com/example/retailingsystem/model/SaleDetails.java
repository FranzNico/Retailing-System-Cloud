package com.example.retailingsystem.model;

import com.example.retailingsystem.model.Product.Product;
import lombok.Data;

@Data
public class SaleDetails {
    private int quantitySold;
    private Product product;
    private String summary;

}
