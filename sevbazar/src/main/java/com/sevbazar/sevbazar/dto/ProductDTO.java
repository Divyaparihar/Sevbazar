package com.sevbazar.sevbazar.dto;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sevbazar.sevbazar.model.Category;

import lombok.Data;


//it works as a holder or object

@Data
public class ProductDTO {

	private Long id;
	private String name;
	private int categoryId; 
	private double price;
	private double weight;
	private String description;
	private String imageName;
}
