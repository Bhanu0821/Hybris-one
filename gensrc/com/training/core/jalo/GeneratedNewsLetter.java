/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 22-Nov-2023, 12:00:29 PM                    ---
 * ----------------------------------------------------------------
 */
package com.training.core.jalo;

import com.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem NewsLetter}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNewsLetter extends GenericItem
{
	/** Qualifier of the <code>NewsLetter.newsletterID</code> attribute **/
	public static final String NEWSLETTERID = "newsletterID";
	/** Qualifier of the <code>NewsLetter.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>NewsLetter.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>NewsLetter.published</code> attribute **/
	public static final String PUBLISHED = "published";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NEWSLETTERID, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		tmp.put(PUBLISHED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.content</code> attribute.
	 * @return the content
	 */
	public String getContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.content</code> attribute.
	 * @return the content
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.newsletterID</code> attribute.
	 * @return the newsletterID
	 */
	public Integer getNewsletterID(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NEWSLETTERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.newsletterID</code> attribute.
	 * @return the newsletterID
	 */
	public Integer getNewsletterID()
	{
		return getNewsletterID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.newsletterID</code> attribute. 
	 * @return the newsletterID
	 */
	public int getNewsletterIDAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNewsletterID( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.newsletterID</code> attribute. 
	 * @return the newsletterID
	 */
	public int getNewsletterIDAsPrimitive()
	{
		return getNewsletterIDAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.newsletterID</code> attribute. 
	 * @param value the newsletterID
	 */
	protected void setNewsletterID(final SessionContext ctx, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+NEWSLETTERID+"' is not changeable", 0 );
		}
		setProperty(ctx, NEWSLETTERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.newsletterID</code> attribute. 
	 * @param value the newsletterID
	 */
	protected void setNewsletterID(final Integer value)
	{
		setNewsletterID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.newsletterID</code> attribute. 
	 * @param value the newsletterID
	 */
	protected void setNewsletterID(final SessionContext ctx, final int value)
	{
		setNewsletterID( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.newsletterID</code> attribute. 
	 * @param value the newsletterID
	 */
	protected void setNewsletterID(final int value)
	{
		setNewsletterID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.published</code> attribute.
	 * @return the published
	 */
	public Boolean isPublished(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PUBLISHED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.published</code> attribute.
	 * @return the published
	 */
	public Boolean isPublished()
	{
		return isPublished( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.published</code> attribute. 
	 * @return the published
	 */
	public boolean isPublishedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPublished( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.published</code> attribute. 
	 * @return the published
	 */
	public boolean isPublishedAsPrimitive()
	{
		return isPublishedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.published</code> attribute. 
	 * @param value the published
	 */
	public void setPublished(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PUBLISHED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.published</code> attribute. 
	 * @param value the published
	 */
	public void setPublished(final Boolean value)
	{
		setPublished( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.published</code> attribute. 
	 * @param value the published
	 */
	public void setPublished(final SessionContext ctx, final boolean value)
	{
		setPublished( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.published</code> attribute. 
	 * @param value the published
	 */
	public void setPublished(final boolean value)
	{
		setPublished( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetter.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetter.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
