package com.training.core.job;


import com.training.core.model.NewsLetterModel;
import com.training.core.service.NewsLetterService;
import de.hybris.platform.commercefacades.product.data.NewsLetterData;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.util.CSVWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;

public class NewsLetterJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = LoggerFactory.getLogger(NewsLetterJobPerformable.class);

    public static final String CSV_OUTPUT_FILE = "csv.output.file.path";
//    String outputPath = "F:/trainingSuit/dcxtraining2005/hybris/bin/custom/training/trainingcore/resources/trainingcore/reference/newsLetter.csv";

    @Autowired
    private NewsLetterService newsLetterService;

    @Resource
    private ConfigurationService configurationService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info("Inside of the Perform Method");
        List<NewsLetterModel> newsLetters = newsLetterService.getNotPublishedRecord();
        try {
            final String dataFilePath = configurationService.getConfiguration().getString(CSV_OUTPUT_FILE);
            File file = new File(dataFilePath);
            try (PrintWriter pw = new PrintWriter("file"))
            {
                pw.write("newsletterID,title,content,published \n");
                final StringBuilder builder = new StringBuilder();
                for (NewsLetterModel object : newsLetters) {
                    builder.append(object.getNewsletterID() + ",");
                    builder.append(object.getTitle() + ",");
                    builder.append(object.getContent() + ",");
                    builder.append(object.getPublished() + "\n");
                }
                pw.write(builder.toString());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}



