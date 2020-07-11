package com.test.yp.bbs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.yp.dao.bbs_Dao;

@Service
public class bbs_Service {
	private static final Logger logger = LoggerFactory.getLogger(bbs_Service.class);
	@Autowired
	bbs_Dao dao;
	public List<postVO> getList() {
		logger.info("bbs_Service");
		return dao.getList();
	}
//	public List<postVO> getPost(String id) {
//		logger.info("bbs_Service");
//		return dao.getPost_by_id(id);
//	}

}
