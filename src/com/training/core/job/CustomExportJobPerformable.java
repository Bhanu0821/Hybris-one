package com.training.core.job;

import com.training.core.dao.CustomExportDao;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

public class CustomExportJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private static final Logger logger = LogManager.getLogger(CustomExportJobPerformable.class);

    private CustomExportDao customExportDao;
    private ModelService modelService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel)  {
        logger.info("Inside method is working ");
        try {
            List<CustomerModel> customerModelList = customExportDao.findCustomersToExport();
            for (CustomerModel customer : customerModelList) {
                if (customer != null && customer.getIsExport()) {
                    customer.setIsExport(true);
                    modelService.save(customer);
                }
            }
        } catch (Exception e) {
            logger.error("An error occurred during the cron job execution: ", e);

        }
               return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
    }

    public CustomExportDao getCustomExportDao() {
        return customExportDao;
    }

    public void setCustomExportDao(CustomExportDao customExportDao) {
        this.customExportDao = customExportDao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
