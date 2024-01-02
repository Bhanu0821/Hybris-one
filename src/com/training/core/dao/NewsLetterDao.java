package com.training.core.dao;

import com.training.core.model.NewsLetterModel;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public interface NewsLetterDao {

 List<NewsLetterModel> getNewsLettersById(final String newsLetterId);
 SearchResult<NewsLetterModel> findLetterByFirstLetter();

 List<NewsLetterModel> getNotPublishedRecord();



}
