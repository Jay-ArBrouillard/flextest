package flexagon.fusion.hrdemo.model.entities;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 20 17:25:58 CDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CountriesEOImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    CountryId,
    CountryName,
    RegionId,
    Locations,
    Regions;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    public int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    public static final int firstIndex()
    {
      return firstIndex;
    }

    public static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    public static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }


  public static final int COUNTRYID = AttributesEnum.CountryId.index();
  public static final int COUNTRYNAME = AttributesEnum.CountryName.index();
  public static final int REGIONID = AttributesEnum.RegionId.index();
  public static final int LOCATIONS = AttributesEnum.Locations.index();
  public static final int REGIONS = AttributesEnum.Regions.index();

  /**
   * This is the default constructor (do not remove).
   */
  public CountriesEOImpl()
  {
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("flexagon.fusion.hrdemo.model.entities.CountriesEO");
  }


  /**
   * Gets the attribute value for CountryId, using the alias name CountryId.
   * @return the value of CountryId
   */
  public String getCountryId()
  {
    return (String) getAttributeInternal(COUNTRYID);
  }

  /**
   * Sets <code>value</code> as the attribute value for CountryId.
   * @param value value to set the CountryId
   */
  public void setCountryId(String value)
  {
    setAttributeInternal(COUNTRYID, value);
  }

  /**
   * Gets the attribute value for CountryName, using the alias name CountryName.
   * @return the value of CountryName
   */
  public String getCountryName()
  {
    return (String) getAttributeInternal(COUNTRYNAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for CountryName.
   * @param value value to set the CountryName
   */
  public void setCountryName(String value)
  {
    setAttributeInternal(COUNTRYNAME, value);
  }

  /**
   * Gets the attribute value for RegionId, using the alias name RegionId.
   * @return the value of RegionId
   */
  public BigDecimal getRegionId()
  {
    return (BigDecimal) getAttributeInternal(REGIONID);
  }

  /**
   * Sets <code>value</code> as the attribute value for RegionId.
   * @param value value to set the RegionId
   */
  public void setRegionId(BigDecimal value)
  {
    setAttributeInternal(REGIONID, value);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getLocations()
  {
    return (RowIterator) getAttributeInternal(LOCATIONS);
  }

  /**
   * @return the associated entity RegionsEOImpl.
   */
  public RegionsEOImpl getRegions()
  {
    return (RegionsEOImpl) getAttributeInternal(REGIONS);
  }

  /**
   * Sets <code>value</code> as the associated entity RegionsEOImpl.
   */
  public void setRegions(RegionsEOImpl value)
  {
    setAttributeInternal(REGIONS, value);
  }

  /**
   * @param countryId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(String countryId)
  {
    return new Key(new Object[] { countryId });
  }


}
