package com.training.core.service;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.ProductDao;

import java.util.List;

public class DefaultTrainingProductService implements TrainingProductService {

    private ProductDao productDao;

    @Override
    public ProductModel getProductAttributeByCode(String productCode) {

        List<ProductModel> productsList = getProductDao().findProductsByCode(productCode);

        if (productsList.isEmpty()) {
            throw new RuntimeException(String.format("Product with Code not Found", productCode));
        } else if (productsList.size() == 1) {
            return productsList.get(0);
        } else {
            throw new RuntimeException(String.format("Found more than one product with code '%s' (%d products found)", productCode, productsList.size()));
        }
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }


}
