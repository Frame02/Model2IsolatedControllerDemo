package com.srikar.springmvc.servlet;

import com.srikar.springmvc.controller.impl.SaveProductController;
import com.srikar.springmvc.controller.impl.InputProductController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vedantas on 1/31/2018.
 */
public class DispatcherServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPrefix = "/WEB-INF/jsp/";
        String viewName;
        String uri = request.getRequestURI();
        int index = uri.lastIndexOf('/');
        String action = uri.substring(index + 1);

        if (action.equals("product_input.do")) {
            InputProductController inputProductController = new InputProductController();
            viewName = inputProductController.handleRequest(request, response);
        } else if(action.equals("product_save.do")){
            SaveProductController saveProductController = new SaveProductController();
            viewName = saveProductController.handleRequest(request, response);
        }
        else{
            viewName = "error.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPrefix + viewName);
        dispatcher.forward(request, response);
    }
}
