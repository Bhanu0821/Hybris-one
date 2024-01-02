package com.training.core.dao;

import com.training.core.model.TrainingMaterialModel;

import java.util.List;

public interface TrainingMaterialDao {

List<TrainingMaterialModel> getMaterialById(final String bookId);

 TrainingMaterialModel getMaterialId(final String bookId);

}
