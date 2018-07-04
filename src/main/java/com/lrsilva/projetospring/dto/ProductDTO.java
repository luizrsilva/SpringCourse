package com.lrsilva.projetospring.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.lrsilva.projetospring.domain.Category;
import com.lrsilva.projetospring.domain.Product;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;
	private Double price;
	
	public ProductDTO() {
	}


	public ProductDTO(Product obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.price = obj.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
