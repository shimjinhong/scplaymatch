package com.match.scplaymatch.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.match.scplaymatch.dto.Test;
import com.match.scplaymatch.repository.TestRepository;
import com.match.scplaymatch.service.TestService;

@Service // 해당 클래스를 빈으로 등록
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testImpl;
	
	@Override
	public int insertCart(Test test) {
		//Test myCart = new Test(); // 임의로 만든 카트 데이터
		//myCart.setName("쌀");
		//myCart.setNum(1200);
		//myCart.setCount(6);
		
		int res = testImpl.insertCart(test);
		//res = res + testImpl.insertCart(myCart);
		
		return res;
	}

	@Override
	public List<Test> selectCart() {		
		return testImpl.selectCart();
	}

	@Override
	public List<Test> selectDb() {		
		return testImpl.selectDb();
	}	
	
	@Override
	public List<Test> selectComm() {		
		return testImpl.selectComm();
	}	
	
}
