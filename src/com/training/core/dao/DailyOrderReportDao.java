package com.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;

public interface DailyOrderReportDao {

    Integer getTotalCompletedOrders(ProductModel productModel);
}
