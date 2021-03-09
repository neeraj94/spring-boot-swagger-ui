package com.example.demo.web;


import com.example.demo.domain.TestTransactionDomain;
import com.example.demo.service.TestService;
import lombok.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/api/v1/test/{getID}",
                    method = RequestMethod.GET,
                    produces = "application/json")
    public ResponseEntity<?> Test (@PathVariable String getID){
        logger.info("");
        TestTransactionDomain testTransactionDomain = testService.getTransactionDetails(getID);
        return ResponseEntity.ok(testTransactionDomain);
    }
}

