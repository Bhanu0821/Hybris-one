package com.training.core.event;

import com.training.core.model.CartTotalExceedsEmailModel;
import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;

public class CartTotalExceedsEventListener extends AbstractAcceleratorSiteEventListener<CartTotalExceedsEvent> {
    private ModelService modelService;
    private BusinessProcessService businessProcessService;

    @Override
    protected void onSiteEvent(CartTotalExceedsEvent event) {
        final CartTotalExceedsEmailModel cartTotalExceedsEmailModel = (CartTotalExceedsEmailModel)
                getBusinessProcessService().createProcess("CartTotalExceedsEmail" + event.getCart().getCode()
                        + "-" + System.currentTimeMillis(), "CartTotalExceedsEmail");
        cartTotalExceedsEmailModel.setCart(event.getCart());
        cartTotalExceedsEmailModel.setCurrency(event.getCurrency());
        cartTotalExceedsEmailModel.setStore(event.getBaseStore());
        cartTotalExceedsEmailModel.setSite(event.getSite());
        getModelService().save(cartTotalExceedsEmailModel);
        getBusinessProcessService().startProcess(cartTotalExceedsEmailModel);


    }

    @Override
    protected SiteChannel getSiteChannelForEvent(CartTotalExceedsEvent event) {
        return null;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}
