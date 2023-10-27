package com.match.scplaymatch.service;

import java.util.List;

import com.match.scplaymatch.dto.Test;

public interface TestService {

	public int insertCart(Test test); // cart데이터 저장 용도
	
	public List<Test> selectCart(); // cart데이터 조회 용도	
	
	public List<Test> selectDb();
	
	public List<Test> selectComm();
	
}
