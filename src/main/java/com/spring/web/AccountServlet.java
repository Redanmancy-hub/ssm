package com.spring.web;

import com.spring.config.SpringTransConfig;
import com.spring.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/accountContext.do")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTransConfig.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        accountService.transformMoney("张娅","胡虞强",500);
    }

}
