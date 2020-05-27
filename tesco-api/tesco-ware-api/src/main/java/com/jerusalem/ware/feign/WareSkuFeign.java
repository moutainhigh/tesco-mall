package com.jerusalem.ware.feign;

import com.jerusalem.common.to.SkuStockVo;
import com.jerusalem.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/****
 * @Author: jerusalem
 * @Description: WareSkuFeign业务层接口
 * @Date 2020/5/19 14:26
 *****/
@FeignClient("ware-service")
@RequestMapping("ware/ware/sku")
public interface WareSkuFeign {

    /***
     * 查询Sku是否有库存
     * @param skuIds
     * @return
     */
    @PostMapping("/stock")
    R getSkuStock(@RequestBody List<Long> skuIds);
}
