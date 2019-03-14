package com.deepexi.b.service.impl;
import com.deepexi.b.depend.client.ProductClient;
import com.deepexi.b.domain.eo.Product;
import com.deepexi.b.mapper.ProductMapper;
import com.deepexi.b.service.ProductService;
import com.deepexi.util.config.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by donh on 2018/11/6.
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductClient productClient;

    public Payload getProductList(Integer page, Integer size, Integer age) throws InvocationTargetException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IOException {
        Payload payload = productClient.getProductList(page, size, age);
        return payload;
    }

    @Override
    public Payload getProductById(String id) {
        return productClient.getProductById(id);
    }

    @Override
    public Integer createProduct(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public Payload deleteProductById(String id) {
        return productClient.deleteProductById(id);
    }

}