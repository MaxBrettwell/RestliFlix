
package com.restliflix.movielist;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from V:\\restliflix\\restliapi\\api\\src\\main\\pegasus\\com\\restliflix\\movielist\\MovieList.pdsc.", date = "Sun Dec 02 02:44:16 CST 2018")
public class Movie
    extends RecordTemplate
{

    private final static Movie.Fields _fields = new Movie.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Movie\",\"namespace\":\"com.restliflix.movielist\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"}]}"));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");

    public Movie() {
        super(new DataMap(), SCHEMA);
    }

    public Movie(DataMap data) {
        super(data, SCHEMA);
    }

    public static Movie.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see Movie.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see Movie.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see Movie.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Movie.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see Movie.Fields#name
     */
    public Movie setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Movie.Fields#name
     */
    public Movie setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for id
     * 
     * @see Movie.Fields#id
     */
    public boolean hasId() {
        return contains(FIELD_Id);
    }

    /**
     * Remover for id
     * 
     * @see Movie.Fields#id
     */
    public void removeId() {
        remove(FIELD_Id);
    }

    /**
     * Getter for id
     * 
     * @see Movie.Fields#id
     */
    public Integer getId(GetMode mode) {
        return obtainDirect(FIELD_Id, Integer.class, mode);
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Movie.Fields#id
     */
    @Nonnull
    public Integer getId() {
        return obtainDirect(FIELD_Id, Integer.class, GetMode.STRICT);
    }

    /**
     * Setter for id
     * 
     * @see Movie.Fields#id
     */
    public Movie setId(Integer value, SetMode mode) {
        putDirect(FIELD_Id, Integer.class, Integer.class, value, mode);
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Movie.Fields#id
     */
    public Movie setId(
        @Nonnull
        Integer value) {
        putDirect(FIELD_Id, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for id
     * 
     * @see Movie.Fields#id
     */
    public Movie setId(int value) {
        putDirect(FIELD_Id, Integer.class, Integer.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Movie clone()
        throws CloneNotSupportedException
    {
        return ((Movie) super.clone());
    }

    @Override
    public Movie copy()
        throws CloneNotSupportedException
    {
        return ((Movie) super.copy());
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

        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

    }

}
