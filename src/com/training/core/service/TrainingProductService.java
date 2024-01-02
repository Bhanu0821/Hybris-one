package com.training.core.service;

import de.hybris.platform.core.model.product.ProductModel;

public interface TrainingProductService {
    ProductModel getProductAttributeByCode(String productCode);
}
