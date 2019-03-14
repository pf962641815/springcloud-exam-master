package com.deepexi.a.api;
import com.deepexi.a.domain.eo.Product;
import com.deepexi.util.config.Payload;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pf on 2019/3/14.
 * 服务提供api
 */
public interface ProductApi {

    @GetMapping
    Payload getProductList(@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
                           @RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
                           @RequestParam(name = "price", required = false, defaultValue = "0") Integer price);

    @GetMapping("/{id:[a-zA-Z0-9]+}")
    Payload getProductById(@PathVariable("id") String id);

    @DeleteMapping("/{id:[a-zA-Z0-9]+}")
    Payload deleteProductById(@PathVariable("id") String id);

}
