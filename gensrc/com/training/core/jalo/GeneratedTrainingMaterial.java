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
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TrainingMaterial}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingMaterial extends GenericItem
{
	/** Qualifier of the <code>TrainingMaterial.bookId</code> attribute **/
	public static final String BOOKID = "bookId";
	/** Qualifier of the <code>TrainingMaterial.bookName</code> attribute **/
	public static final String BOOKNAME = "bookName";
	/** Qualifier of the <code>TrainingMaterial.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>TrainingMaterial.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>TrainingMaterial.review</code> attribute **/
	public static final String REVIEW = "review";
	/** Qualifier of the <code>TrainingMaterial.isExpired</code> attribute **/
	public static final String ISEXPIRED = "isExpired";
	/** Qualifier of the <code>TrainingMaterial.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>TrainingMaterial.courseType</code> attribute **/
	public static final String COURSETYPE = "courseType";
	/** Qualifier of the <code>TrainingMaterial.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>TrainingMaterial.level</code> attribute **/
	public static final String LEVEL = "level";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BOOKID, AttributeMode.INITIAL);
		tmp.put(BOOKNAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(REVIEW, AttributeMode.INITIAL);
		tmp.put(ISEXPIRED, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		tmp.put(COURSETYPE, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(LEVEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.author</code> attribute.
	 * @return the author - The name or organization responsible for creating the material.
	 */
	public String getAuthor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.author</code> attribute.
	 * @return the author - The name or organization responsible for creating the material.
	 */
	public String getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.author</code> attribute. 
	 * @param value the author - The name or organization responsible for creating the material.
	 */
	public void setAuthor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.author</code> attribute. 
	 * @param value the author - The name or organization responsible for creating the material.
	 */
	public void setAuthor(final String value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.bookId</code> attribute.
	 * @return the bookId - book id with attribute
	 */
	public String getBookId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOOKID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.bookId</code> attribute.
	 * @return the bookId - book id with attribute
	 */
	public String getBookId()
	{
		return getBookId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.bookId</code> attribute. 
	 * @param value the bookId - book id with attribute
	 */
	public void setBookId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOOKID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.bookId</code> attribute. 
	 * @param value the bookId - book id with attribute
	 */
	public void setBookId(final String value)
	{
		setBookId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.bookName</code> attribute.
	 * @return the bookName
	 */
	public String getBookName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTrainingMaterial.getBookName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, BOOKNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.bookName</code> attribute.
	 * @return the bookName
	 */
	public String getBookName()
	{
		return getBookName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.bookName</code> attribute. 
	 * @return the localized bookName
	 */
	public Map<Language,String> getAllBookName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,BOOKNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.bookName</code> attribute. 
	 * @return the localized bookName
	 */
	public Map<Language,String> getAllBookName()
	{
		return getAllBookName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.bookName</code> attribute. 
	 * @param value the bookName
	 */
	public void setBookName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTrainingMaterial.setBookName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BOOKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.bookName</code> attribute. 
	 * @param value the bookName
	 */
	public void setBookName(final String value)
	{
		setBookName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.bookName</code> attribute. 
	 * @param value the bookName
	 */
	public void setAllBookName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,BOOKNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.bookName</code> attribute. 
	 * @param value the bookName
	 */
	public void setAllBookName(final Map<Language,String> value)
	{
		setAllBookName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.courseType</code> attribute.
	 * @return the courseType
	 */
	public String getCourseType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COURSETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.courseType</code> attribute.
	 * @return the courseType
	 */
	public String getCourseType()
	{
		return getCourseType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.courseType</code> attribute. 
	 * @param value the courseType
	 */
	public void setCourseType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COURSETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.courseType</code> attribute. 
	 * @param value the courseType
	 */
	public void setCourseType(final String value)
	{
		setCourseType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.duration</code> attribute.
	 * @return the duration - The estimated time it takes to complete the material.
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.duration</code> attribute.
	 * @return the duration - The estimated time it takes to complete the material.
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.duration</code> attribute. 
	 * @param value the duration - The estimated time it takes to complete the material.
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.duration</code> attribute. 
	 * @param value the duration - The estimated time it takes to complete the material.
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.isExpired</code> attribute.
	 * @return the isExpired
	 */
	public String getIsExpired(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISEXPIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.isExpired</code> attribute.
	 * @return the isExpired
	 */
	public String getIsExpired()
	{
		return getIsExpired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.isExpired</code> attribute. 
	 * @param value the isExpired
	 */
	public void setIsExpired(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISEXPIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.isExpired</code> attribute. 
	 * @param value the isExpired
	 */
	public void setIsExpired(final String value)
	{
		setIsExpired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.level</code> attribute.
	 * @return the level - knowledge level the material is beginner, intermediate, advanced
	 */
	public String getLevel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.level</code> attribute.
	 * @return the level - knowledge level the material is beginner, intermediate, advanced
	 */
	public String getLevel()
	{
		return getLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.level</code> attribute. 
	 * @param value the level - knowledge level the material is beginner, intermediate, advanced
	 */
	public void setLevel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.level</code> attribute. 
	 * @param value the level - knowledge level the material is beginner, intermediate, advanced
	 */
	public void setLevel(final String value)
	{
		setLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.price</code> attribute.
	 * @return the price
	 */
	public String getPrice(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.price</code> attribute.
	 * @return the price
	 */
	public String getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final String value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.review</code> attribute.
	 * @return the review
	 */
	public String getReview(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REVIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingMaterial.review</code> attribute.
	 * @return the review
	 */
	public String getReview()
	{
		return getReview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.review</code> attribute. 
	 * @param value the review
	 */
	public void setReview(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingMaterial.review</code> attribute. 
	 * @param value the review
	 */
	public void setReview(final String value)
	{
		setReview( getSession().getSessionContext(), value );
	}
	
}
