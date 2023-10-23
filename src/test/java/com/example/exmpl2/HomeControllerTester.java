package com.example.exmpl2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.thymeleaf.spring6.expression.Mvc;

@WebMvcTest(HomeControllerTester.class)
public class HomeControllerTester {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomePage(){

    }
}
