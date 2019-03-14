package com.deepexi.b.depend.fallback;
import com.deepexi.a.domain.eo.Product;
import com.deepexi.b.depend.client.ProductClient;
import com.deepexi.b.service.impl.ProductServiceImpl;
import com.deepexi.util.config.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by pf on 2019/3/14.
 */
@Component
public class ProductFallback implements ProductClient{
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public Payload getProductList(Integer page, Integer size, Integer price) {
        logger.info("-------------熔断降级处理逻辑---------\n");
        return new Payload(null, "100", "熔断降级处理");
    }

    @Override
    public Payload getProductById(String id) {
        logger.info("-------------熔断降级处理逻辑---------\n");
        return new Payload(null, "100", "熔断降级处理");
    }

    @Override
    public Payload deleteProductById(String id) {
        logger.info("-------------熔断降级处理逻辑---------\n");
        return new Payload(null, "100", "熔断降级处理");
    }

}
