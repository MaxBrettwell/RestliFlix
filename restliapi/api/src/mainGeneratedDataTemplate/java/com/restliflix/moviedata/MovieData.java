
package com.restliflix.moviedata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Movie Data
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from V:\\restliflix\\restliapi\\api\\src\\main\\pegasus\\com\\restliflix\\moviedata\\MovieData.pdsc.", date = "Sun Dec 02 02:44:15 CST 2018")
public class MovieData
    extends RecordTemplate
{

    private final static MovieData.Fields _fields = new MovieData.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"MovieData\",\"namespace\":\"com.restliflix.moviedata\",\"doc\":\"Movie Data\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"doc\":\"Movie ID\"},{\"name\":\"imageUrl\",\"type\":\"string\",\"doc\":\"Movie Image URL\"},{\"name\":\"descr\",\"type\":\"string\",\"doc\":\"Movie description\"},{\"name\":\"year\",\"type\":\"int\",\"doc\":\"Movie release year\"}]}"));
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_ImageUrl = SCHEMA.getField("imageUrl");
    private final static RecordDataSchema.Field FIELD_Descr = SCHEMA.getField("descr");
    private final static RecordDataSchema.Field FIELD_Year = SCHEMA.getField("year");

    public MovieData() {
        super(new DataMap(), SCHEMA);
    }

    public MovieData(DataMap data) {
        super(data, SCHEMA);
    }

    public static MovieData.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for id
     * 
     * @see MovieData.Fields#id
     */
    public boolean hasId() {
        return contains(FIELD_Id);
    }

    /**
     * Remover for id
     * 
     * @see MovieData.Fields#id
     */
    public void removeId() {
        remove(FIELD_Id);
    }

    /**
     * Getter for id
     * 
     * @see MovieData.Fields#id
     */
    public Long getId(GetMode mode) {
        return obtainDirect(FIELD_Id, Long.class, mode);
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MovieData.Fields#id
     */
    @Nonnull
    public Long getId() {
        return obtainDirect(FIELD_Id, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for id
     * 
     * @see MovieData.Fields#id
     */
    public MovieData setId(Long value, SetMode mode) {
        putDirect(FIELD_Id, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MovieData.Fields#id
     */
    public MovieData setId(
        @Nonnull
        Long value) {
        putDirect(FIELD_Id, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for id
     * 
     * @see MovieData.Fields#id
     */
    public MovieData setId(long value) {
        putDirect(FIELD_Id, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for imageUrl
     * 
     * @see MovieData.Fields#imageUrl
     */
    public boolean hasImageUrl() {
        return contains(FIELD_ImageUrl);
    }

    /**
     * Remover for imageUrl
     * 
     * @see MovieData.Fields#imageUrl
     */
    public void removeImageUrl() {
        remove(FIELD_ImageUrl);
    }

    /**
     * Getter for imageUrl
     * 
     * @see MovieData.Fields#imageUrl
     */
    public String getImageUrl(GetMode mode) {
        return obtainDirect(FIELD_ImageUrl, String.class, mode);
    }

    /**
     * Getter for imageUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MovieData.Fields#imageUrl
     */
    @Nonnull
    public String getImageUrl() {
        return obtainDirect(FIELD_ImageUrl, String.class, GetMode.STRICT);
    }

    /**
     * Setter for imageUrl
     * 
     * @see MovieData.Fields#imageUrl
     */
    public MovieData setImageUrl(String value, SetMode mode) {
        putDirect(FIELD_ImageUrl, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for imageUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MovieData.Fields#imageUrl
     */
    public MovieData setImageUrl(
        @Nonnull
        String value) {
        putDirect(FIELD_ImageUrl, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for descr
     * 
     * @see MovieData.Fields#descr
     */
    public boolean hasDescr() {
        return contains(FIELD_Descr);
    }

    /**
     * Remover for descr
     * 
     * @see MovieData.Fields#descr
     */
    public void removeDescr() {
        remove(FIELD_Descr);
    }

    /**
     * Getter for descr
     * 
     * @see MovieData.Fields#descr
     */
    public String getDescr(GetMode mode) {
        return obtainDirect(FIELD_Descr, String.class, mode);
    }

    /**
     * Getter for descr
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MovieData.Fields#descr
     */
    @Nonnull
    public String getDescr() {
        return obtainDirect(FIELD_Descr, String.class, GetMode.STRICT);
    }

    /**
     * Setter for descr
     * 
     * @see MovieData.Fields#descr
     */
    public MovieData setDescr(String value, SetMode mode) {
        putDirect(FIELD_Descr, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for descr
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MovieData.Fields#descr
     */
    public MovieData setDescr(
        @Nonnull
        String value) {
        putDirect(FIELD_Descr, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for year
     * 
     * @see MovieData.Fields#year
     */
    public boolean hasYear() {
        return contains(FIELD_Year);
    }

    /**
     * Remover for year
     * 
     * @see MovieData.Fields#year
     */
    public void removeYear() {
        remove(FIELD_Year);
    }

    /**
     * Getter for year
     * 
     * @see MovieData.Fields#year
     */
    public Integer getYear(GetMode mode) {
        return obtainDirect(FIELD_Year, Integer.class, mode);
    }

    /**
     * Getter for year
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MovieData.Fields#year
     */
    @Nonnull
    public Integer getYear() {
        return obtainDirect(FIELD_Year, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for year
     * 
     * @see MovieData.Fields#year
     */
    public MovieData setYear(Integer value, SetMode mode) {
        putDirect(FIELD_Year, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for year
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MovieData.Fields#year
     */
    public MovieData setYear(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Year, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for year
     * 
     * @see MovieData.Fields#year
     */
    public MovieData setYear(int value) {
        putDirect(FIELD_Year, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MovieData clone()
        throws CloneNotSupportedException
    {
        return ((MovieData) super.clone());
    }

    @Override
    public MovieData copy()
        throws CloneNotSupportedException
    {
        return ((MovieData) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Movie ID
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * Movie Image URL
         * 
         */
        public PathSpec imageUrl() {
            return new PathSpec(getPathComponents(), "imageUrl");
        }

        /**
         * Movie description
         * 
         */
        public PathSpec descr() {
            return new PathSpec(getPathComponents(), "descr");
        }

        /**
         * Movie release year
         * 
         */
        public PathSpec year() {
            return new PathSpec(getPathComponents(), "year");
        }

    }

}
