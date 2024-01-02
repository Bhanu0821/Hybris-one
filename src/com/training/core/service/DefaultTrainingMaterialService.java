package com.training.core.service;

import com.training.core.dao.TrainingMaterialDao;
import com.training.core.model.TrainingMaterialModel;
import de.hybris.platform.commercefacades.product.data.TrainingMaterialData;
import de.hybris.platform.commercewebservicescommons.dto.material.MaterialWsDTO;
import de.hybris.platform.servicelayer.model.ModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class DefaultTrainingMaterialService implements TrainingMaterialService {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultTrainingMaterialService.class);

    private TrainingMaterialDao trainingMaterialDao;
    private ModelService modelService;

    @Override
    public TrainingMaterialModel getMaterialById(String bookId) {

        validateParameterNotNull(bookId, "Parameter code must not be null");
        final List<TrainingMaterialModel> material = trainingMaterialDao.getMaterialById(bookId);
        LOG.info("Retrieved Training Material with ID '{}': {}", bookId, material.isEmpty() ? "No record found" : material.get(0));
        return material.get(0);
    }
    @Override
    public void createMaterial(MaterialWsDTO materialData) {
        final TrainingMaterialModel materialModel = getModelService().create(TrainingMaterialModel.class);
        materialModel.setBookId(materialData.getBookId());
        materialModel.setBookName(materialData.getBookName());
        materialModel.setAuthor(materialData.getAuthor());
        materialModel.setCourseType(materialData.getCourseType());
        materialModel.setDescription(materialData.getDescription());
        materialModel.setLevel(materialData.getLevel());
        materialModel.setPrice(materialData.getPrice());
        materialModel.setReview(materialData.getReview());
        materialModel.setIsExpired(materialData.getIsExpired());
        materialModel.setDuration(materialData.getDuration());
        modelService.save(materialModel);
    }

    @Override
    public void updateMaterialEntry(String bookId, TrainingMaterialData materialData) {
        TrainingMaterialModel trainingMaterialModel = trainingMaterialDao.getMaterialId(bookId);
        trainingMaterialModel.setAuthor(materialData.getAuthor());
        trainingMaterialModel.setLevel(materialData.getLevel());
        modelService.save(trainingMaterialModel);
    }

    @Override
    public void deleteMaterialEntry(String bookId) {
        TrainingMaterialModel trainingMaterialModel = trainingMaterialDao.getMaterialId(bookId);
        modelService.remove(trainingMaterialModel.getPk());
    }

    public TrainingMaterialDao getTrainingMaterialDao() {
        return trainingMaterialDao;
    }

    public void setTrainingMaterialDao(TrainingMaterialDao trainingMaterialDao) {
        this.trainingMaterialDao = trainingMaterialDao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
