package com.training.core.dao;


import com.training.core.model.NewsLetterModel;
import com.training.core.model.TrainingMaterialModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.*;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;


public class DefaultNewsLetterDao implements NewsLetterDao {

    private FlexibleSearchService flexibleSearchService;
    private SearchRestrictionService searchRestrictionService;
    private static final Logger LOGGER = Logger.getLogger(DefaultNewsLetterDao.class);
    private static final String NEWSLETTER_QUERY = "SELECT {" + NewsLetterModel.PK + "} FROM {"
            + NewsLetterModel._TYPECODE + "} WHERE {" + NewsLetterModel.NEWSLETTERID + "}=?newsLetterId";
   private static final String NEWS_LETTER_QUERY = "select {n.pk} from {newsLetter as n} where {n.newsLetterId} LIKE '9%'";
   private static final String NOT_PUBLISHED_RECORD="select {n.pk} from {newsLetter as n} where {n.published}='0'";

    @Override
    public List<NewsLetterModel> getNewsLettersById(String newsLetterId) {

        ServicesUtil.validateParameterNotNull(newsLetterId, "newsLetter ID must not be null");

        final Map<String, Object> params = new HashMap<>();
        params.put("newsLetterId", newsLetterId);

        final SearchResult<NewsLetterModel> newsRecord = getFlexibleSearchService().search(NEWSLETTER_QUERY, params);
        return newsRecord.getResult() == null ? Collections.emptyList() : newsRecord.getResult();

    }

    @Override
    public SearchResult<NewsLetterModel> findLetterByFirstLetter() {

        final StringBuilder builder = new StringBuilder(NEWS_LETTER_QUERY);
        final FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
        return flexibleSearchService.search(query);

    }

    @Override
    public List<NewsLetterModel> getNotPublishedRecord() {
        final Map queryParams = new HashMap();
        final FlexibleSearchQuery query = new FlexibleSearchQuery(NOT_PUBLISHED_RECORD, queryParams);
        return getFlexibleSearchService().<NewsLetterModel> search(query).getResult();
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public SearchRestrictionService getSearchRestrictionService() {
        return searchRestrictionService;
    }

    public void setSearchRestrictionService(SearchRestrictionService searchRestrictionService) {
        this.searchRestrictionService = searchRestrictionService;
    }


}
