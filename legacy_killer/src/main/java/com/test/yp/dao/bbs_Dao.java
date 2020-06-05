package com.test.yp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.yp.bbs.postVO;
@Repository
public class bbs_Dao {
    @Autowired
    private SqlSession SqlSession;
    
    public List<postVO> getList(int firstIndex,int count){
          return SqlSession.selectList("test.mappers.testMapper"+".listall");
    }

}
