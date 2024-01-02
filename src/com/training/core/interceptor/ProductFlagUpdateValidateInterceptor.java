package com.training.core.interceptor;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class ProductFlagUpdateValidateInterceptor implements ValidateInterceptor<ProductModel>{
    @Override
    public void onValidate(ProductModel productModel, InterceptorContext interceptorContext) throws InterceptorException {
        if (productModel.getSummary() == null && productModel.isSealed()) {
            throw new InterceptorException("Summary is mandatory for this product");
        }

    }
}
