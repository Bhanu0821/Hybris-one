package com.training.core.dao;

import com.training.core.model.TrainingMaterialModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;



import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class DefaultTrainingMaterialDao implements TrainingMaterialDao {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultTrainingMaterialDao.class);
    private static final String MATERIAL_QUERY = "SELECT {" + TrainingMaterialModel.PK + "} FROM {"
            + TrainingMaterialModel._TYPECODE + "} WHERE {" + TrainingMaterialModel.BOOKID + "}=?bookId";
    private FlexibleSearchService flexibleSearchService;
    private FlexibleSearchQuery flexibleSearchQuery;

    @Override
    public List<TrainingMaterialModel> getMaterialById(final String bookId) {

        validateParameterNotNull(bookId, "Material id must not be null!");
        FlexibleSearchQuery query = new FlexibleSearchQuery(MATERIAL_QUERY);
        query.addQueryParameter("bookId", bookId);
        SearchResult<TrainingMaterialModel> searchResult = getFlexibleSearchService().search(query);
        LOG.info("Search operation successful. Found " + searchResult.getResult().size() + " records.");
        return searchResult.getResult();

    }

    @Override
    public TrainingMaterialModel getMaterialId(final String bookId) {
        validateParameterNotNull(bookId, "Material id must not be null!");

        FlexibleSearchQuery query = new FlexibleSearchQuery(MATERIAL_QUERY);
        query.addQueryParameter("bookId", bookId);

        SearchResult<TrainingMaterialModel> searchResult = getFlexibleSearchService().search(query);
        LOG.info("Search operation successful. Found " + searchResult.getResult().size() + " records.");

        return searchResult.getResult().get(0);
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public FlexibleSearchQuery getFlexibleSearchQuery() {
        return flexibleSearchQuery;
    }

    public void setFlexibleSearchQuery(FlexibleSearchQuery flexibleSearchQuery) {
        this.flexibleSearchQuery = flexibleSearchQuery;
    }
}
