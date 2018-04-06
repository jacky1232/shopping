package love.you.service;

import love.you.AbstractSpringbootTest;
import love.you.po.ProductInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: yirui_dai<yirui_dai@aliyun.com>
 * @Description:
 * @Date: Created in 23:27 2018/4/5 0005
 */
public class ProductInfoServiceTest extends AbstractSpringbootTest {
    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void saveTest() {
        ProductInfo productInfo = ProductInfo.builder()
                .productEntrance("京东")
                .productName("鞋子")
                .productId(1232L)
                .productPrice(230.00).productTitle("贵人鸟").producSaleQuantity(12).build();
        productInfoService.save(productInfo);
    }

}
