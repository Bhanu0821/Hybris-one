package com.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

public class DailyOrderReportDaoImpl implements DailyOrderReportDao {
private FlexibleSearchService flexibleSearchService;

    @Override
    public Integer getTotalCompletedOrders(ProductModel productModel) {
        String query = "select {p.code}, sum({oe.quantity})\n" +
                "from {orderEntry as oe join product as p on {oe.product}={p.pk}\n" +
                "     join order as o on {oe.order}={o.pk}\n" +
                "     join orderStatus as st on {o.status}={st.pk}}\n" +
                "where {st.code} = 'COMPLETED'\n" +
                "GROUP BY {p.code}\n";
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        final SearchResult<ProductModel> searchResult = flexibleSearchService.search(searchQuery);
        return searchResult.getTotalCount();

    }
}
