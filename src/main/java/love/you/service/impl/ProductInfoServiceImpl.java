package love.you.service.impl;

import love.you.dao.ProductInfoDao;
import love.you.po.ProductInfo;
import love.you.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yirui_dai<yirui_dai   @   aliyun.com>
 * @Description:
 * @Date: Created in 22:06 2018/4/5 0005
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public boolean save(ProductInfo productInfo) {
        return productInfoDao.insertSelective(productInfo) == 1;
    }
}
