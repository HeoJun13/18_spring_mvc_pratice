package com.mvc.spring1.DTO;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component

public class BrandDTO {

	private String brandCd;
	private String brandNm;
	private Date enteredDt;
	private String activeYn;
	
	public String getBrandCd() {
		return brandCd;
	}
	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}
	public String getBrandNm() {
		return brandNm;
	}
	public void setBrandNm(String brandNm) {
		this.brandNm = brandNm;
	}
	public Date getEnteredDt() {
		return enteredDt;
	}
	public void setEnteredDt(Date enteredDt) {
		this.enteredDt = enteredDt;
	}
	public String getActiveYn() {
		return activeYn;
	}
	public void setActiveYn(String activeYn) {
		this.activeYn = activeYn;
	}
	
	@Override
	public String toString() {
		return "BrandDTO [brandCd=" + brandCd + ", brandNm=" + brandNm + ", enteredDt=" + enteredDt + ", activeYn="
				+ activeYn + "]";
	}
	
}
