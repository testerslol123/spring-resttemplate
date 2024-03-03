package com.danbro.ConsumeApi.controller;

import com.danbro.ConsumeApi.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Controller
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api-data")
    public String getApiData(Model model) {
        model.addAttribute("apiData", "api data danke");
        return "api-data-view";
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        String url = "https://dummyjson.com/products";

        ProductDto barangAPI = restTemplate.getForObject(url, ProductDto.class);

        model.addAttribute("products", barangAPI);
        System.out.print(barangAPI);
        return "products";

    }


}
