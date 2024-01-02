//import de.hybris.platform.commercefacades.product.data.ProductData;
//import de.hybris.platform.core.model.product.ProductModel;
//import de.hybris.platform.cronjob.enums.CronJobResult;
//import de.hybris.platform.cronjob.enums.CronJobStatus;
//import de.hybris.platform.cronjob.model.CronJobModel;
//import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
//import de.hybris.platform.servicelayer.cronjob.PerformResult;
//import de.hybris.platform.servicelayer.model.ModelService;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//public class ProductsJobPerformable extends AbstractJobPerformable<CronJobModel> {
//
//    private static final Logger logger = LogManager.getLogger(ProductsJobPerformable.class);
//
//
//    private ModelService modelService;
//
//    @Override
//    public PerformResult perform(CronJobModel cronJobModel) {
//        logger.info("Inside perform method");
//        List<ProductData> productDataList = getResponseService().getResponse();
//        List<ProductModel> productModels =  new ArrayList<>();
//        if(Objects.nonNull(productDataList)) {
//            for (ProductData productData:productDataList) {
//                convertDataToModel(productData, productModels);
//            }
//            try{
//                productDataList = mapper.readValue(jsonFile.getInputStream(),ProductData[].class);
//            }catch(IOException e){
//                throw  new RuntimeException(e);
//            }
//            getModelService().saveAll(productModels);
//            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
//        }
//        return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
//    }
//
//    private void convertDataToModel(ProductData productData, List<ProductModel> productModels) {
//        ProductModel productModel = getModelService().create(ProductModel.class);
//        productModel.setCode(productData.getCode());
//        productModel.setName(productData.getName());
//        productModel.setQuantity(productData.getQuantity());
//        productModel.setSalesspecialflag(productData.getSalesspecialflag());
//        productModel.setEan(productData.getEan());
//        productModel.setProductconfigid(productData.getProductconfigid());
//        productModel.setVersion(productData.getVersion());
//        //productModel.setUnit(productData.getUnit());
//
//        productModels.add(productModel);
//    }
//
//    public ModelService getModelService() {
//        return modelService;
//    }
//
//    @Override
//    public void setModelService(ModelService modelService) {
//        this.modelService = modelService;
//    }
//}