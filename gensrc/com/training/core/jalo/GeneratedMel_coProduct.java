/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 22-Nov-2023, 12:00:29 PM                    ---
 * ----------------------------------------------------------------
 */
package com.training.core.jalo;

import com.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Mel_coProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMel_coProduct extends Product
{
	/** Qualifier of the <code>Mel_coProduct.isExport</code> attribute **/
	public static final String ISEXPORT = "isExport";
	/** Qualifier of the <code>Mel_coProduct.mel_coDescription</code> attribute **/
	public static final String MEL_CODESCRIPTION = "mel_coDescription";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ISEXPORT, AttributeMode.INITIAL);
		tmp.put(MEL_CODESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mel_coProduct.isExport</code> attribute.
	 * @return the isExport
	 */
	public Boolean isIsExport(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISEXPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mel_coProduct.isExport</code> attribute.
	 * @return the isExport
	 */
	public Boolean isIsExport()
	{
		return isIsExport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mel_coProduct.isExport</code> attribute. 
	 * @return the isExport
	 */
	public boolean isIsExportAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsExport( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mel_coProduct.isExport</code> attribute. 
	 * @return the isExport
	 */
	public boolean isIsExportAsPrimitive()
	{
		return isIsExportAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mel_coProduct.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISEXPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mel_coProduct.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final Boolean value)
	{
		setIsExport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mel_coProduct.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final SessionContext ctx, final boolean value)
	{
		setIsExport( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mel_coProduct.isExport</code> attribute. 
	 * @param value the isExport
	 */
	public void setIsExport(final boolean value)
	{
		setIsExport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mel_coProduct.mel_coDescription</code> attribute.
	 * @return the mel_coDescription
	 */
	public String getMel_coDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEL_CODESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Mel_coProduct.mel_coDescription</code> attribute.
	 * @return the mel_coDescription
	 */
	public String getMel_coDescription()
	{
		return getMel_coDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mel_coProduct.mel_coDescription</code> attribute. 
	 * @param value the mel_coDescription
	 */
	public void setMel_coDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEL_CODESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Mel_coProduct.mel_coDescription</code> attribute. 
	 * @param value the mel_coDescription
	 */
	public void setMel_coDescription(final String value)
	{
		setMel_coDescription( getSession().getSessionContext(), value );
	}
	
}
