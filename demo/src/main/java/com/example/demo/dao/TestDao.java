package com.example.demo.dao;

import com.example.demo.domain.TestTransactionDomain;
import com.example.demo.web.TestController;
import lombok.Builder;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestDao implements TestDaoImpl {

    @Override
    public TestTransactionDomain getTransactionDetails(String Id) {

        Logger logger = LoggerFactory.getLogger(TestTransactionDomain.class);

        //Builder design pattern can we used instead of assigning the values individually. Facing some
        //maven dependency issues.

        TestTransactionDomain testTransactionDomain = new TestTransactionDomain();
        testTransactionDomain.setValue1("1");
        testTransactionDomain.setValue2("2");
        testTransactionDomain.setValue3("3");
        testTransactionDomain.setValue4("4");

        return testTransactionDomain;
    }
}
