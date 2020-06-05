package com.test.yp.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.yp.dao.bbs_Dao;

@Service
public class bbs_Service {
	@Autowired
	bbs_Dao dao;
	public List<postVO> getList() {
		return dao.getList();
	}

}
