package com.test.yp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.yp.bbs.bbs_Service;
import com.test.yp.bbs.postVO;

@Repository
public class bbs_Dao {
	private static final Logger logger = LoggerFactory.getLogger(bbs_Dao.class);
	@Autowired
	private SqlSession SqlSession;

	public List<postVO> getList() {
		logger.info("bbs_Dao");
		return SqlSession.selectList("test.mappers.testMapper" + ".listall");
	}

}
