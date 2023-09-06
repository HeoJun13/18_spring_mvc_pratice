package com.mvc.spring1.DTO;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class ProductDTO {

	private int productCd;
	private String productNm;
	private int price;
	private int deliveryPrice;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date enrollDt;
	private String brandCd;
	
	private List<ProductDTO> productList; // 설명

	public int getProductCd() {
		return productCd;
	}

	public void setProductCd(int productCd) {
		this.productCd = productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDeliveryPrice() {
		return deliveryPrice;
	}

	public void setDeliveryPrice(int deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public Date getEnrollDt() {
		return enrollDt;
	}

	public void setEnrollDt(Date enrollDt) {
		this.enrollDt = enrollDt;
	}

	public String getBrandCd() {
		return brandCd;
	}

	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}

	public List<ProductDTO> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductDTO> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "ProductDTO [productCd=" + productCd + ", productNm=" + productNm + ", price=" + price
				+ ", deliveryPrice=" + deliveryPrice + ", enrollDt=" + enrollDt + ", brandCd=" + brandCd
				+ ", productList=" + productList + "]";
	}
	
}
