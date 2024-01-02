package com.training.core.job;


import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.io.*;

public class DailyOrderReportJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = LoggerFactory.getLogger(DailyOrderReportJobPerformable.class);
//    private static final String SAMPLE_CSV_FILE_PATH = "hybris.input.csv.file.path";
    public static final String delimiter = ",";

//    @Resource(name = "configurationService")
//    private ConfigurationService configurationService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {

        LOG.info("Inside Perform Method");
        try {
//            final String dataFilePath = configurationService.getConfiguration().getString(SAMPLE_CSV_FILE_PATH);
//            LOG.info("Resource path: " + dataFilePath);
            File file = new File("F:/trainingSuit/dcxtraining2005/hybris/bin/custom/training/trainingcore/resources/trainingcore/reference/sample.csv");
//          File file = new File(getClass().getResource(dataFilePath).getFile());
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while ((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                for (String tempStr : tempArr) {
                    System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            br.close();
        } catch (IOException e) {
            LOG.error("Error reading the CSV file", e);
            return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
