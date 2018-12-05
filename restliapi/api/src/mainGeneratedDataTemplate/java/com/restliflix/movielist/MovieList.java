
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
 * Movie Data
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from V:\\restliflix\\restliapi\\api\\src\\main\\pegasus\\com\\restliflix\\movielist\\MovieList.pdsc.", date = "Sun Dec 02 02:44:16 CST 2018")
public class MovieList
    extends RecordTemplate
{

    private final static MovieList.Fields _fields = new MovieList.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"MovieList\",\"namespace\":\"com.restliflix.movielist\",\"doc\":\"Movie Data\",\"fields\":[{\"name\":\"movies\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Movie\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"}]}}}]}"));
    private final static RecordDataSchema.Field FIELD_Movies = SCHEMA.getField("movies");

    public MovieList() {
        super(new DataMap(), SCHEMA);
    }

    public MovieList(DataMap data) {
        super(data, SCHEMA);
    }

    public static MovieList.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for movies
     * 
     * @see MovieList.Fields#movies
     */
    public boolean hasMovies() {
        return contains(FIELD_Movies);
    }

    /**
     * Remover for movies
     * 
     * @see MovieList.Fields#movies
     */
    public void removeMovies() {
        remove(FIELD_Movies);
    }

    /**
     * Getter for movies
     * 
     * @see MovieList.Fields#movies
     */
    public MovieArray getMovies(GetMode mode) {
        return obtainWrapped(FIELD_Movies, MovieArray.class, mode);
    }

    /**
     * Getter for movies
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MovieList.Fields#movies
     */
    @Nonnull
    public MovieArray getMovies() {
        return obtainWrapped(FIELD_Movies, MovieArray.class, GetMode.STRICT);
    }

    /**
     * Setter for movies
     * 
     * @see MovieList.Fields#movies
     */
    public MovieList setMovies(MovieArray value, SetMode mode) {
        putWrapped(FIELD_Movies, MovieArray.class, value, mode);
        return this;
    }

    /**
     * Setter for movies
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MovieList.Fields#movies
     */
    public MovieList setMovies(
        @Nonnull
        MovieArray value) {
        putWrapped(FIELD_Movies, MovieArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MovieList clone()
        throws CloneNotSupportedException
    {
        return ((MovieList) super.clone());
    }

    @Override
    public MovieList copy()
        throws CloneNotSupportedException
    {
        return ((MovieList) super.copy());
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

        public com.restliflix.movielist.MovieArray.Fields movies() {
            return new com.restliflix.movielist.MovieArray.Fields(getPathComponents(), "movies");
        }

        public PathSpec movies(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "movies");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
