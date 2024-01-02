package com.training.core.service;

import com.training.core.model.TrainingMaterialModel;

import de.hybris.platform.commercefacades.product.data.TrainingMaterialData;
import de.hybris.platform.commercewebservicescommons.dto.material.MaterialWsDTO;

public interface TrainingMaterialService {

    TrainingMaterialModel getMaterialById(String bookId);

    public void createMaterial(MaterialWsDTO materialData);

    public void updateMaterialEntry(String bookId, TrainingMaterialData materialData);

    public void  deleteMaterialEntry(String bookId);


}
