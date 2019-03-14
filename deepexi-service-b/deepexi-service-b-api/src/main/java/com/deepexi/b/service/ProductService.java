package com.deepexi.b.service;
import com.deepexi.util.config.Payload;
import com.deepexi.b.domain.eo.Product;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface ProductService {

    Payload getProductList(Integer page, Integer size, Integer price) throws InvocationTargetException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, IOException;

    Payload getProductById(String id);

    Integer createProduct(Product product);

    Payload deleteProductById(String id);

}
