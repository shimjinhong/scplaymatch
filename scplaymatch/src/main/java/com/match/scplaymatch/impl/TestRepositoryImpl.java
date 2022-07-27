package com.match.scplaymatch.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.match.scplaymatch.dto.Test;
import com.match.scplaymatch.repository.TestRepository;

@Repository
public class TestRepositoryImpl implements TestRepository {

	private String namespace = "com.match.scplaymatch.test."; // mapper파일의 namespace + "."
	
	@Autowired
	SqlSession session;
	
	@Override
	public int insertCart(Test test) {
		return session.insert(namespace + "insertCart", test);		
	}

	@Override
	public List<Test> selectCart() {	
		return session.selectList(namespace + "selectCart");
	}

}
