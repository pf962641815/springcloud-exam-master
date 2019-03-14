package com.deepexi.b.controller;
import com.deepexi.b.domain.eo.Product;
import com.deepexi.b.service.ProductService;
import com.deepexi.util.config.Payload;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by donh on 2018/11/5.
 */
@Api(value = "productcontroller",description = "商品管理")
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @ApiOperation(value ="过滤价格查询所有商品",notes ="",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "第几页",required = false,dataType = "Integer"),
            @ApiImplicitParam(name = "size",value = "每页查询数",required = false,dataType = "Integer"),
            @ApiImplicitParam(name = "price",value = "价格",required = false,dataType = "Integer")
    })
    @GetMapping
    public Payload getProductList(@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
                                  @RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
                                  @RequestParam(name = "price", required = false, defaultValue = "0") Integer price) throws NoSuchMethodException, NoSuchFieldException, IOException, IllegalAccessException, InvocationTargetException {
        return productService.getProductList(page, size, price);
    }

    @GetMapping("/{id:[a-zA-Z0-9]+}")
    public Payload getProductById(@PathVariable("id") String id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id:[a-zA-Z0-9]+}")
    public Payload deleteProductById(@PathVariable("id") String id) {
        return productService.deleteProductById(id);
    }


    @PostMapping
    public Payload createProduct(@RequestBody Product product) {
        return new Payload(productService.createProduct(product));
    }

    @PutMapping("/{id:[a-zA-Z0-9]+}")
    public Payload updateProductById(@PathVariable("id") String id, Product product) {
        return new Payload(null);
    }

}
