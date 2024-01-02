/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 22-Nov-2023, 12:00:29 PM                    ---
 * ----------------------------------------------------------------
 */
package com.training.core.jalo;

import com.training.core.constants.TrainingCoreConstants;
import com.training.core.jalo.ApparelProduct;
import com.training.core.jalo.ApparelSizeVariantProduct;
import com.training.core.jalo.ApparelStyleVariantProduct;
import com.training.core.jalo.CartTotalExceedsEmail;
import com.training.core.jalo.DailyOrderReportCronJob;
import com.training.core.jalo.ElectronicsColorVariantProduct;
import com.training.core.jalo.Mel_coProduct;
import com.training.core.jalo.NewsLetter;
import com.training.core.jalo.TrainingEmailProcess;
import com.training.core.jalo.TrainingMaterial;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("quantity", AttributeMode.INITIAL);
		tmp.put("salesspecialflag", AttributeMode.INITIAL);
		tmp.put("productconfigid", AttributeMode.INITIAL);
		tmp.put("version", AttributeMode.INITIAL);
		tmp.put("deliverymode", AttributeMode.INITIAL);
		tmp.put("trngProductDecs", AttributeMode.INITIAL);
		tmp.put("productNum", AttributeMode.INITIAL);
		tmp.put("trngProductReview", AttributeMode.INITIAL);
		tmp.put("productRating", AttributeMode.INITIAL);
		tmp.put("feedback", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("isExport", AttributeMode.INITIAL);
		tmp.put("postalAddress", AttributeMode.INITIAL);
		tmp.put("emailAddress", AttributeMode.INITIAL);
		tmp.put("phoneNumber", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CartTotalExceedsEmail createCartTotalExceedsEmail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.CARTTOTALEXCEEDSEMAIL );
			return (CartTotalExceedsEmail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CartTotalExceedsEmail : "+e.getMessage(), 0 );
		}
	}
	
	public CartTotalExceedsEmail createCartTotalExceedsEmail(final Map attributeValues)
	{
		return createCartTotalExceedsEmail( getSession().getSessionContext(), attributeValues );
	}
	
	public DailyOrderReportCronJob createDailyOrderReportCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.DAILYORDERREPORTCRONJOB );
			return (DailyOrderReportCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DailyOrderReportCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public DailyOrderReportCronJob createDailyOrderReportCronJob(final Map attributeValues)
	{
		return createDailyOrderReportCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Mel_coProduct createMel_coProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.MEL_COPRODUCT );
			return (Mel_coProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Mel_coProduct : "+e.getMessage(), 0 );
		}
	}
	
	public Mel_coProduct createMel_coProduct(final Map attributeValues)
	{
		return createMel_coProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public NewsLetter createNewsLetter(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.NEWSLETTER );
			return (NewsLetter)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NewsLetter : "+e.getMessage(), 0 );
		}
	}
	
	public NewsLetter createNewsLetter(final Map attributeValues)
	{
		return createNewsLetter( getSession().getSessionContext(), attributeValues );
	}
	
	public TrainingEmailProcess createTrainingEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.TRAININGEMAILPROCESS );
			return (TrainingEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TrainingEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public TrainingEmailProcess createTrainingEmailProcess(final Map attributeValues)
	{
		return createTrainingEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public TrainingMaterial createTrainingMaterial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.TRAININGMATERIAL );
			return (TrainingMaterial)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TrainingMaterial : "+e.getMessage(), 0 );
		}
	}
	
	public TrainingMaterial createTrainingMaterial(final Map attributeValues)
	{
		return createTrainingMaterial( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.deliverymode</code> attribute.
	 * @return the deliverymode
	 */
	public String getDeliverymode(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.DELIVERYMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.deliverymode</code> attribute.
	 * @return the deliverymode
	 */
	public String getDeliverymode(final Product item)
	{
		return getDeliverymode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.deliverymode</code> attribute. 
	 * @param value the deliverymode
	 */
	public void setDeliverymode(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.DELIVERYMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.deliverymode</code> attribute. 
	 * @param value the deliverymode
	 */
	public void setDeliverymode(final Product item, final String value)
	{
		setDeliverymode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.EMAILADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress(final Customer item)
	{
		return getEmailAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.EMAILADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final Customer item, final String value)
	{
		setEmailAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.feedback</code> attribute.
	 * @return the feedback
	 */
	public String getFeedback(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.FEEDBACK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.feedback</code> attribute.
	 * @return the feedback
	 */
	public String getFeedback(final Product item)
	{
		return getFeedback( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.feedback</code> attribute. 
	 * @param value the feedback
	 */
	public void setFeedback(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.FEEDBACK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.feedback</code> attribute. 
	 * @param value the feedback
	 */
	public void setFeedback(final Product item, final String value)
	{
		setFeedback( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isExport</code> attribute.
	 * @return the isExport
	 */
	public Boolean isIsExport(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.ISEXPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isExport</code> attribute.
	 * @return the isExport
	 */
	public Boolean isIsExport(final Customer item)
	{
		return isIsExport( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isExport</code> attribute. 
	 * @return the isExport
	 */
	public boolean isIsExportAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsExport( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isExport</code> attribute. 
	 * @return the isExport
	 */
	public boolean isIsExportAsPrimitive(final Customer item)
	{
		return isIsExportAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.ISEXPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final Customer item, final Boolean value)
	{
		setIsExport( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsExport( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final Customer item, final boolean value)
	{
		setIsExport( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.PHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phoneNumber</code> attribute.
	 * @return the phoneNumber
	 */
	public String getPhoneNumber(final Customer item)
	{
		return getPhoneNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.PHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phoneNumber</code> attribute. 
	 * @param value the phoneNumber
	 */
	public void setPhoneNumber(final Customer item, final String value)
	{
		setPhoneNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.postalAddress</code> attribute.
	 * @return the postalAddress
	 */
	public String getPostalAddress(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.POSTALADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.postalAddress</code> attribute.
	 * @return the postalAddress
	 */
	public String getPostalAddress(final Customer item)
	{
		return getPostalAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.postalAddress</code> attribute. 
	 * @param value the postalAddress
	 */
	public void setPostalAddress(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.POSTALADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.postalAddress</code> attribute. 
	 * @param value the postalAddress
	 */
	public void setPostalAddress(final Customer item, final String value)
	{
		setPostalAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productconfigid</code> attribute.
	 * @return the productconfigid
	 */
	public String getProductconfigid(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.PRODUCTCONFIGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productconfigid</code> attribute.
	 * @return the productconfigid
	 */
	public String getProductconfigid(final Product item)
	{
		return getProductconfigid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productconfigid</code> attribute. 
	 * @param value the productconfigid
	 */
	public void setProductconfigid(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.PRODUCTCONFIGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productconfigid</code> attribute. 
	 * @param value the productconfigid
	 */
	public void setProductconfigid(final Product item, final String value)
	{
		setProductconfigid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productNum</code> attribute.
	 * @return the productNum
	 */
	public Integer getProductNum(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.PRODUCTNUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productNum</code> attribute.
	 * @return the productNum
	 */
	public Integer getProductNum(final Product item)
	{
		return getProductNum( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productNum</code> attribute. 
	 * @return the productNum
	 */
	public int getProductNumAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getProductNum( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productNum</code> attribute. 
	 * @return the productNum
	 */
	public int getProductNumAsPrimitive(final Product item)
	{
		return getProductNumAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productNum</code> attribute. 
	 * @param value the productNum
	 */
	public void setProductNum(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.PRODUCTNUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productNum</code> attribute. 
	 * @param value the productNum
	 */
	public void setProductNum(final Product item, final Integer value)
	{
		setProductNum( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productNum</code> attribute. 
	 * @param value the productNum
	 */
	public void setProductNum(final SessionContext ctx, final Product item, final int value)
	{
		setProductNum( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productNum</code> attribute. 
	 * @param value the productNum
	 */
	public void setProductNum(final Product item, final int value)
	{
		setProductNum( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRating</code> attribute.
	 * @return the productRating
	 */
	public Integer getProductRating(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.PRODUCTRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRating</code> attribute.
	 * @return the productRating
	 */
	public Integer getProductRating(final Product item)
	{
		return getProductRating( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRating</code> attribute. 
	 * @return the productRating
	 */
	public int getProductRatingAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getProductRating( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRating</code> attribute. 
	 * @return the productRating
	 */
	public int getProductRatingAsPrimitive(final Product item)
	{
		return getProductRatingAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRating</code> attribute. 
	 * @param value the productRating
	 */
	public void setProductRating(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.PRODUCTRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRating</code> attribute. 
	 * @param value the productRating
	 */
	public void setProductRating(final Product item, final Integer value)
	{
		setProductRating( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRating</code> attribute. 
	 * @param value the productRating
	 */
	public void setProductRating(final SessionContext ctx, final Product item, final int value)
	{
		setProductRating( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRating</code> attribute. 
	 * @param value the productRating
	 */
	public void setProductRating(final Product item, final int value)
	{
		setProductRating( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.quantity</code> attribute.
	 * @return the quantity
	 */
	public Integer getQuantity(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.quantity</code> attribute.
	 * @return the quantity
	 */
	public Integer getQuantity(final Product item)
	{
		return getQuantity( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.quantity</code> attribute. 
	 * @return the quantity
	 */
	public int getQuantityAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getQuantity( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.quantity</code> attribute. 
	 * @return the quantity
	 */
	public int getQuantityAsPrimitive(final Product item)
	{
		return getQuantityAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final Product item, final Integer value)
	{
		setQuantity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final Product item, final int value)
	{
		setQuantity( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final Product item, final int value)
	{
		setQuantity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.salesspecialflag</code> attribute.
	 * @return the salesspecialflag
	 */
	public Boolean isSalesspecialflag(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.SALESSPECIALFLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.salesspecialflag</code> attribute.
	 * @return the salesspecialflag
	 */
	public Boolean isSalesspecialflag(final Product item)
	{
		return isSalesspecialflag( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.salesspecialflag</code> attribute. 
	 * @return the salesspecialflag
	 */
	public boolean isSalesspecialflagAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isSalesspecialflag( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.salesspecialflag</code> attribute. 
	 * @return the salesspecialflag
	 */
	public boolean isSalesspecialflagAsPrimitive(final Product item)
	{
		return isSalesspecialflagAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.salesspecialflag</code> attribute. 
	 * @param value the salesspecialflag
	 */
	public void setSalesspecialflag(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.SALESSPECIALFLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.salesspecialflag</code> attribute. 
	 * @param value the salesspecialflag
	 */
	public void setSalesspecialflag(final Product item, final Boolean value)
	{
		setSalesspecialflag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.salesspecialflag</code> attribute. 
	 * @param value the salesspecialflag
	 */
	public void setSalesspecialflag(final SessionContext ctx, final Product item, final boolean value)
	{
		setSalesspecialflag( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.salesspecialflag</code> attribute. 
	 * @param value the salesspecialflag
	 */
	public void setSalesspecialflag(final Product item, final boolean value)
	{
		setSalesspecialflag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.trngProductDecs</code> attribute.
	 * @return the trngProductDecs
	 */
	public String getTrngProductDecs(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.TRNGPRODUCTDECS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.trngProductDecs</code> attribute.
	 * @return the trngProductDecs
	 */
	public String getTrngProductDecs(final Product item)
	{
		return getTrngProductDecs( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.trngProductDecs</code> attribute. 
	 * @param value the trngProductDecs
	 */
	public void setTrngProductDecs(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.TRNGPRODUCTDECS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.trngProductDecs</code> attribute. 
	 * @param value the trngProductDecs
	 */
	public void setTrngProductDecs(final Product item, final String value)
	{
		setTrngProductDecs( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.trngProductReview</code> attribute.
	 * @return the trngProductReview
	 */
	public String getTrngProductReview(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.TRNGPRODUCTREVIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.trngProductReview</code> attribute.
	 * @return the trngProductReview
	 */
	public String getTrngProductReview(final Product item)
	{
		return getTrngProductReview( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.trngProductReview</code> attribute. 
	 * @param value the trngProductReview
	 */
	public void setTrngProductReview(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.TRNGPRODUCTREVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.trngProductReview</code> attribute. 
	 * @param value the trngProductReview
	 */
	public void setTrngProductReview(final Product item, final String value)
	{
		setTrngProductReview( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.version</code> attribute.
	 * @return the version
	 */
	public Integer getVersion(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.VERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.version</code> attribute.
	 * @return the version
	 */
	public Integer getVersion(final Product item)
	{
		return getVersion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.version</code> attribute. 
	 * @return the version
	 */
	public int getVersionAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getVersion( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.version</code> attribute. 
	 * @return the version
	 */
	public int getVersionAsPrimitive(final Product item)
	{
		return getVersionAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.version</code> attribute. 
	 * @param value the version
	 */
	public void setVersion(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.VERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.version</code> attribute. 
	 * @param value the version
	 */
	public void setVersion(final Product item, final Integer value)
	{
		setVersion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.version</code> attribute. 
	 * @param value the version
	 */
	public void setVersion(final SessionContext ctx, final Product item, final int value)
	{
		setVersion( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.version</code> attribute. 
	 * @param value the version
	 */
	public void setVersion(final Product item, final int value)
	{
		setVersion( getSession().getSessionContext(), item, value );
	}
	
}
