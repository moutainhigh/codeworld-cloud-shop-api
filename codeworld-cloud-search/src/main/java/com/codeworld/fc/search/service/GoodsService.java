package com.codeworld.fc.search.service;

import com.codeworld.fc.common.response.FCResponse;
import com.codeworld.fc.search.domain.ProductResponse;
import com.codeworld.fc.search.request.ProductIndexSearchRequest;

import java.util.List;

public interface GoodsService {

    /**
     * 导入数据到ElasticSearch中
     * @return
     */
    FCResponse<Void> importGoodsToElasticSearch();

    /**
     * 删除索引库所有商品
     * @return
     */
    FCResponse<Void> deleteAllGoodsToElasticSearch();

    /**
     * 首页获取最新商品
     * @return
     * @param productIndexSearchRequest
     */
    FCResponse<List<ProductResponse>> getNewProductIndex(ProductIndexSearchRequest productIndexSearchRequest);

    /**
     * 根据商品id查询商品
     * @param productId
     * @return
     */
    FCResponse<ProductResponse> getProductById(Long productId);

    /**
     * 将商品定时导入到索引库
     * @return
     */
    FCResponse<Void> importGoodsToElasticSearchTime();
}
