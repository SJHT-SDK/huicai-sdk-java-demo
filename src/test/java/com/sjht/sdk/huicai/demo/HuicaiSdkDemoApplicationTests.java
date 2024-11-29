package com.sjht.sdk.huicai.demo;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.sjht.sdk.huicai.core.client.DefaultApiClient;
import com.sjht.sdk.huicai.core.client.HuicaiApiClient;
import com.sjht.sdk.huicai.core.model.Result;
import com.sjht.sdk.huicai.demo.config.HuicaiProperties;
import com.sjht.sdk.huicai.virtual.model.VirtualGoodsDetailsResponse;
import com.sjht.sdk.huicai.virtual.model.VirtualGoodsPageRequest;
import com.sjht.sdk.huicai.virtual.model.VirtualGoodsPageResponse;
import com.sjht.sdk.huicai.virtual.service.VirtualGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class HuicaiSdkDemoApplicationTests {

    @Autowired
    private HuicaiProperties properties;

    @Test
    void testVirtual() {
        HuicaiApiClient client = new DefaultApiClient(properties);

        Result<List<VirtualGoodsPageResponse>> result = new VirtualGoodsService(client).pageList(new VirtualGoodsPageRequest());

//        Result<VirtualGoodsDetailsResponse> detailsResponseResult = new VirtualGoodsService(client).details("");

//        Result<VirtualGoodsSkuStockPriceResponse> priceResponseResult = new VirtualGoodsService(client).skuStockPrice("");

//        VirtualCouponShopRequest request = new VirtualCouponShopRequest();
//        request.setSkuId("");
//        Result<List<VirtualCouponShopResponse>> couponShopResult = new VirtualGoodsService(client).getCouponShopList(request);


//        Result<VirtualOrderDetailsResponse> orderDetailsResponseResult=new VirtualOrderService(client).getDetails("","");

    }

    @Test
    void testH5Api() {
        HuicaiApiClient client = new DefaultApiClient(properties);
//        H5AuthLoginRequest request = new H5AuthLoginRequest();
//        request.setPhone("");
//        request.setWxOpenId("");
//        Result<H5AuthLoginResponse> h5LoginResult = new H5AuthService(client).login(request);
//        log.info("免登录API返回数据-->{}", JSON.toJSONString(h5LoginResult));

//        H5QueryOrderRequest orderRequest = new H5QueryOrderRequest();
//        orderRequest.setModule("VIRTUAL");
//        orderRequest.setOrderNo("");
//        Result<H5QueryOrderResponse> h5OrderResult = new H5OrderService(client).queryOrderDetails(orderRequest);
//        log.info("H5订单查询返回数据-->{}", JSON.toJSONString(h5OrderResult));
    }

    @Test
    void testExecuteCustomApi() {
        HuicaiApiClient client = new DefaultApiClient(properties);
        JSONObject params = new JSONObject();
        params.put("phone", "");
        Result<VirtualGoodsDetailsResponse> result = client.execute("/open/auth/login", params, VirtualGoodsDetailsResponse.class);
        log.info("自定义接口URL请求返回数据-->{}", JSON.toJSONString(result));
    }

}
