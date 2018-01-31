package com.srikar.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by vedantas on 1/31/2018.
 */
public interface Controller {
    String handleRequest(HttpServletRequest request,HttpServletResponse response);
}
