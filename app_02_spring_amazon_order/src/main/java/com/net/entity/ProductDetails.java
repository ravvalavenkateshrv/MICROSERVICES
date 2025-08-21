package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductDetails {

	
	@Id
    private int id;

    private String productName;
    private int quantity;
    private double price;
}
