package com.training.core.dao;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface CustomExportDao {

List<CustomerModel> findCustomersToExport();
}
