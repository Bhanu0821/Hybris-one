package com.training.core.service;

import com.training.core.dao.NewsLetterDao;
import com.training.core.model.NewsLetterModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DefaultNewsLetterService implements NewsLetterService {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultNewsLetterService.class);
    private NewsLetterDao newsLetterDao;

    public NewsLetterModel getNewsRecord(final String newsletterID) {
        List<NewsLetterModel> newsLetterModels = getNewsLetterDao().getNewsLettersById(newsletterID);
        return newsLetterModels.get(0);
    }

    @Override
    public List<NewsLetterModel> getNotPublishedRecord() {
        List<NewsLetterModel> listOfModels = getNewsLetterDao().getNotPublishedRecord();
        return listOfModels;
    }

    public NewsLetterDao getNewsLetterDao() {
        return newsLetterDao;
    }

    public void setNewsLetterDao(NewsLetterDao newsLetterDao) {
        this.newsLetterDao = newsLetterDao;
    }

}
