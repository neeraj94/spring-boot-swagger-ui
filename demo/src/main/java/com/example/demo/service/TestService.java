package com.example.demo.service;

import com.example.demo.dao.TestDao;
import com.example.demo.domain.TestTransactionDomain;
import com.example.demo.web.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public TestTransactionDomain getTransactionDetails(){
        Logger logger = LoggerFactory.getLogger(TestController.class);
        return testDao.getTransactionDetails();
    }

}
