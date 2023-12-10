package com.vam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;


import com.vam.model.AuthorVO;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AuthorServiceTests {
    
    /*AuthoreService 의존성 주입*/
	@Autowired
    private AuthorService service;
    /*
    @Test
    public void authorEnrollTest() throws Exception {
 
        AuthorVO author = new AuthorVO();
        
        author.setNationId("01");
        author.setAuthorName("테스트");
        author.setAuthorIntro("테스트 소개");
        
        service.authorEnroll(author);
        
    }
    */
    
	@Test
	public void authorGetDetailTest() throws Exception {
	    int authorId = 20;
	    
	    Logger logger = LoggerFactory.getLogger(AuthorServiceTests.class);
	    logger.info("author......" + service.authorGetDetail(authorId));
	}
 
}
