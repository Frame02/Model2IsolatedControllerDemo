package com.srikar.springmvc.controller.impl;

import com.srikar.springmvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by vedantas on 1/31/2018.
 */
public class InputProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        return "productForm.jsp";
    }
}
