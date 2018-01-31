package com.srikar.springmvc.controller.impl;

import com.srikar.springmvc.controller.Controller;
import com.srikar.springmvc.domain.Product;
import com.srikar.springmvc.form.ProductForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by vedantas on 1/31/2018.
 */

public class SaveProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        ProductForm productForm = new ProductForm();
        productForm.setName(request.getParameter("name"));
        productForm.setDescription(request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try{
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        }
        catch(NumberFormatException ex){
            return "productForm.jsp";
        }
        request.setAttribute("product", product);
        return "productDetails.jsp";
    }
}
