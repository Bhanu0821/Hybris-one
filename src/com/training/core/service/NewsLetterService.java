package com.training.core.service;

import com.training.core.model.NewsLetterModel;

import java.util.List;


public interface NewsLetterService {
    NewsLetterModel getNewsRecord(final String newsletterID);

    List<NewsLetterModel> getNotPublishedRecord();



}
