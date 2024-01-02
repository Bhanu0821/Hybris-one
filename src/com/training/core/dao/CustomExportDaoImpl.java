package com.training.core.dao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public class CustomExportDaoImpl implements CustomExportDao{

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomerModel> findCustomersToExport() {

    String query = "SELECT {pk} FROM {CustomerModel} WHERE {isExport} = false";
       SearchResult<CustomerModel> searchResult = getFlexibleSearchService().search(query);
       return searchResult.getResult();

    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
