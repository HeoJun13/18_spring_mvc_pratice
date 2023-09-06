package com.mvc.spring1._02_Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.spring1.DTO.BrandDTO;
import com.mvc.spring1.DTO.ProductDTO;


@Repository
public class D2MPT {

	@Autowired
	private SqlSession sqlSession;
	
	/*
	 * 
	 * # DAO To Mapper
	 * 
	 *  - 2개 이상의 파라미터를 Mapper로 전달할 수 없고 오직 1개의 파라미터만 전송이 가능하다.
	 *  - 2개 이상의 데이터는 DTO , Map형식으로 전송한다.
	 *  - 전송되는 복수의 데이터가 DTO의 멤버로 포함되어 있으면 일반적으로 DTO 전송 방식을 사용하고
	 *    전송되는 복수의 데이터가 DTO의 멤버에 포함되어 있지 않은 경우 Map 전송 방식을 사용한다.
	 * 
	 * */
	
	public void sample01() {
		
		System.out.println("\n - sample01 - \n");
		
		int productCd = 1;
		sqlSession.update("d2m.sample01" , productCd);
	}
	
	
	public void sample02() {
		
		System.out.println("\n - sample02 - \n");
		
		String brandCd = "b6";
		sqlSession.update("d2m.sample02" , brandCd);
		
	}
	
	
	public void sample03() {
		
		System.out.println("\n - sample03 - \n");
		
		String brandNm = "apple";
		sqlSession.selectOne("d2m.sample03" , brandNm);
	}
	
	
	public void sample04() {
		
		System.out.println("\n - sample04 - \n"); 
		
		BrandDTO brandDTO = new BrandDTO();
		
		brandDTO.setBrandCd("add2");
		brandDTO.setBrandNm("추가된브랜드");
		brandDTO.setActiveYn("N");
		sqlSession.insert("d2m.sample04" , brandDTO);
		
	}
	
	
	public void sample05() {
		
		System.out.println("\n - sample05 - \n");
		
		ProductDTO  productDTO = new ProductDTO();
		productDTO.setProductNm("추가된 상품1");
		productDTO.setPrice(1);
		productDTO.setDeliveryPrice(1);
		productDTO.setBrandCd("add");
		
		sqlSession.insert("d2m.sample05" , productDTO);
	}
	
	
	// DTO 전송 예시3
	public void sample06() {
		
		System.out.println("\n - sample06 - \n");
		
		com.mvc.spring1.DTO.ProductDTO productDTO = new com.mvc.spring1.DTO.ProductDTO();
		productDTO.setPrice(1000000);
		productDTO.setDeliveryPrice(3000);
		
		List<com.mvc.spring1.DTO.ProductDTO> productList = sqlSession.selectList("d2m.sample06" , productDTO);
		for (ProductDTO temp : productList) {
			System.out.println(temp);
		}
	}
	
}
	