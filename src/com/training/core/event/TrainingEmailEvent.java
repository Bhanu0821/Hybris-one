package com.training.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.store.BaseStoreModel;


public class TrainingEmailEvent extends AbstractCommerceUserEvent {



    private AbstractOrderModel cart;


    public TrainingEmailEvent( final AbstractOrderModel cart, final BaseSiteModel site,
                              final BaseStoreModel baseStore, final CurrencyModel currency) {
        this.cart = cart;
        setSite(site);
        setBaseStore(baseStore);
        setCurrency(currency);
        setLanguage(cart.getUser().getSessionLanguage());
    }
    public AbstractOrderModel getCart() {
        return cart;
    }

    public void setCart(AbstractOrderModel cart) {
        this.cart = cart;
    }
}
