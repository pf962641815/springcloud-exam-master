package com.deepexi.b.depend.client;
import com.deepexi.a.api.ProductApi;
import com.deepexi.b.depend.fallback.ProductFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by pf on 2019/3/14.
 */
@FeignClient(value = "deepexi-service-a-provider", path = "/api/v1/products", fallback = ProductFallback.class)
public interface ProductClient extends ProductApi {


}
