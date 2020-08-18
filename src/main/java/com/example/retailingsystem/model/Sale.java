package com.example.retailingsystem.model;

import com.example.retailingsystem.model.Customer.Customer;
import com.example.retailingsystem.model.Product.Product;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Sale {
    private final String id;
    private final double amount;
    private final String details;
//    private final Product product;
//    private final Date date;
//    private final Customer customer;
}
