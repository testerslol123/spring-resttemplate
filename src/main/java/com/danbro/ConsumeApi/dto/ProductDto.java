package com.danbro.ConsumeApi.dto;

import java.io.Serializable;
import java.util.List;

public class ProductDto implements Serializable {

    private List<ProductsContentDto> products;

    private Integer total;
    private Integer skip;
    private Integer limit;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<ProductsContentDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsContentDto> products) {
        this.products = products;
    }
}
