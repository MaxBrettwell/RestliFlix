
package com.restliflix.movieurl;

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
 * Movie Url
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from V:\\restliflix\\restliapi\\api\\src\\main\\pegasus\\com\\restliflix\\movieurl\\MovieUrl.pdsc.", date = "Sun Dec 02 02:44:16 CST 2018")
public class MovieUrl
    extends RecordTemplate
{

    private final static MovieUrl.Fields _fields = new MovieUrl.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"MovieUrl\",\"namespace\":\"com.restliflix.movieurl\",\"doc\":\"Movie Url\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"doc\":\"Movie ID\"},{\"name\":\"movieUrl\",\"type\":\"string\",\"doc\":\"Movie Video URL\"}]}"));
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_MovieUrl = SCHEMA.getField("movieUrl");

    public MovieUrl() {
        super(new DataMap(), SCHEMA);
    }

    public MovieUrl(DataMap data) {
        super(data, SCHEMA);
    }

    public static MovieUrl.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for id
     * 
     * @see MovieUrl.Fields#id
     */
    public boolean hasId() {
        return contains(FIELD_Id);
    }

    /**
     * Remover for id
     * 
     * @see MovieUrl.Fields#id
     */
    public void removeId() {
        remove(FIELD_Id);
    }

    /**
     * Getter for id
     * 
     * @see MovieUrl.Fields#id
     */
    public Long getId(GetMode mode) {
        return obtainDirect(FIELD_Id, Long.class, mode);
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MovieUrl.Fields#id
     */
    @Nonnull
    public Long getId() {
        return obtainDirect(FIELD_Id, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for id
     * 
     * @see MovieUrl.Fields#id
     */
    public MovieUrl setId(Long value, SetMode mode) {
        putDirect(FIELD_Id, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MovieUrl.Fields#id
     */
    public MovieUrl setId(
        @Nonnull
        Long value) {
        putDirect(FIELD_Id, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for id
     * 
     * @see MovieUrl.Fields#id
     */
    public MovieUrl setId(long value) {
        putDirect(FIELD_Id, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for movieUrl
     * 
     * @see MovieUrl.Fields#movieUrl
     */
    public boolean hasMovieUrl() {
        return contains(FIELD_MovieUrl);
    }

    /**
     * Remover for movieUrl
     * 
     * @see MovieUrl.Fields#movieUrl
     */
    public void removeMovieUrl() {
        remove(FIELD_MovieUrl);
    }

    /**
     * Getter for movieUrl
     * 
     * @see MovieUrl.Fields#movieUrl
     */
    public String getMovieUrl(GetMode mode) {
        return obtainDirect(FIELD_MovieUrl, String.class, mode);
    }

    /**
     * Getter for movieUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MovieUrl.Fields#movieUrl
     */
    @Nonnull
    public String getMovieUrl() {
        return obtainDirect(FIELD_MovieUrl, String.class, GetMode.STRICT);
    }

    /**
     * Setter for movieUrl
     * 
     * @see MovieUrl.Fields#movieUrl
     */
    public MovieUrl setMovieUrl(String value, SetMode mode) {
        putDirect(FIELD_MovieUrl, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for movieUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MovieUrl.Fields#movieUrl
     */
    public MovieUrl setMovieUrl(
        @Nonnull
        String value) {
        putDirect(FIELD_MovieUrl, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MovieUrl clone()
        throws CloneNotSupportedException
    {
        return ((MovieUrl) super.clone());
    }

    @Override
    public MovieUrl copy()
        throws CloneNotSupportedException
    {
        return ((MovieUrl) super.copy());
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
         * Movie Video URL
         * 
         */
        public PathSpec movieUrl() {
            return new PathSpec(getPathComponents(), "movieUrl");
        }

    }

}
