package com.training.core.event;

import com.training.core.model.TrainingEmailProcessModel;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;


public class TrainingEmailEventListener extends AbstractAcceleratorSiteEventListener<TrainingEmailEvent> {

    private BusinessProcessService businessProcessService;

    private ModelService modelService;

    @Override
    protected void onSiteEvent(TrainingEmailEvent event) {
        TrainingEmailProcessModel trainingEmailProcessModel= getBusinessProcessService().createProcess
        ("emailProcess:"+event.getCart().getCode() +"-" + System.currentTimeMillis(),
    "Eligible for premium member ship Email Process");
        trainingEmailProcessModel.setCart(event.getCart());
        trainingEmailProcessModel.setSite(event.getSite());
        trainingEmailProcessModel.setStore(event.getBaseStore());
        trainingEmailProcessModel.setCurrency(event.getCurrency());
        trainingEmailProcessModel.setLanguage(event.getLanguage());
        getBusinessProcessService().startProcess(trainingEmailProcessModel);


// these methods are from "StoreFrontCustomerProcess" itemtype which we define parent in "DiscountEmailProcess" itemtype



    }
    @Override
    protected SiteChannel getSiteChannelForEvent(TrainingEmailEvent event) {

        return null;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
