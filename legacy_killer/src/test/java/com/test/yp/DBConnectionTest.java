package com.test.yp;
import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DBConnectionTest {
    @Inject
    private DataSource ds;
//    @Test(timeout=5000)
//    @Test(expected=RuntimeException.class)
//    @Ignore(value=”여기는 테스트 안할거야”)
    @Test
    public void testConnection(){
    	
        try (Connection con = ds.getConnection()) {
 
            System.out.println("\nDB연결 성공 !!\n");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
