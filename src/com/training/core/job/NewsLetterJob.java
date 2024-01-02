package com.training.core.job;

import com.training.core.dao.NewsLetterDao;
import com.training.core.model.NewsLetterModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;

import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class NewsLetterJob extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = LoggerFactory.getLogger(NewsLetterJob.class);
    @Autowired
    private NewsLetterDao newsLetterDao;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {

        SearchResult<NewsLetterModel> newsLetterResult = newsLetterDao.findLetterByFirstLetter();

        LOG.info("printing products start with 9");
        newsLetterResult.getResult().stream().forEach(this::letterById);
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    protected void letterById(NewsLetterModel newsLetterModel) {
        LOG.info(newsLetterModel.getNewsletterID() + " " + newsLetterModel.getTitle());

    }
}
