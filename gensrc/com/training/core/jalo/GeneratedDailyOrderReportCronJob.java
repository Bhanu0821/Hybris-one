/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 22-Nov-2023, 12:00:29 PM                    ---
 * ----------------------------------------------------------------
 */
package com.training.core.jalo;

import com.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob DailyOrderReportCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDailyOrderReportCronJob extends CronJob
{
	/** Qualifier of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute **/
	public static final String NUMBEROFORDERS = "numberOfOrders";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NUMBEROFORDERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute.
	 * @return the numberOfOrders
	 */
	public Integer getNumberOfOrders(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFORDERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute.
	 * @return the numberOfOrders
	 */
	public Integer getNumberOfOrders()
	{
		return getNumberOfOrders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute. 
	 * @return the numberOfOrders
	 */
	public int getNumberOfOrdersAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfOrders( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute. 
	 * @return the numberOfOrders
	 */
	public int getNumberOfOrdersAsPrimitive()
	{
		return getNumberOfOrdersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders
	 */
	public void setNumberOfOrders(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFORDERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders
	 */
	public void setNumberOfOrders(final Integer value)
	{
		setNumberOfOrders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders
	 */
	public void setNumberOfOrders(final SessionContext ctx, final int value)
	{
		setNumberOfOrders( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DailyOrderReportCronJob.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders
	 */
	public void setNumberOfOrders(final int value)
	{
		setNumberOfOrders( getSession().getSessionContext(), value );
	}
	
}
