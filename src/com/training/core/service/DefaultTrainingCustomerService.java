package com.training.core.service;


import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

public class DefaultTrainingCustomerService implements TrainingCustomerService {

    private ModelService modelService;

    private FlexibleSearchQuery flexibleSearchQuery;
    private FlexibleSearchService flexibleSearchService;


    @Override
    public void createCustomer(String email, String phoneNumber, String postalAddress) {

        final CustomerModel newCustomerModel = getModelService().create(CustomerModel.class);

        String id = "zero@hybris.com";
        String name = "tested";
        newCustomerModel.setUid(id);
        newCustomerModel.setName(name);
        newCustomerModel.setEmailAddress(email);
        newCustomerModel.setPhoneNumber(phoneNumber);
        newCustomerModel.setPostalAddress(postalAddress);
        modelService.save(newCustomerModel);

    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public FlexibleSearchQuery getFlexibleSearchQuery() {
        return flexibleSearchQuery;
    }

    public void setFlexibleSearchQuery(FlexibleSearchQuery flexibleSearchQuery) {
        this.flexibleSearchQuery = flexibleSearchQuery;
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
