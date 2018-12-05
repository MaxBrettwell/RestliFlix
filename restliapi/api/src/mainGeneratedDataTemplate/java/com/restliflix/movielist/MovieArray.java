
package com.restliflix.movielist;

import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from V:\\restliflix\\restliapi\\api\\src\\main\\pegasus\\com\\restliflix\\movielist\\MovieList.pdsc.", date = "Sun Dec 02 02:44:16 CST 2018")
public class MovieArray
    extends WrappingArrayTemplate<Movie>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Movie\",\"namespace\":\"com.restliflix.movielist\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"int\"}]}}"));

    public MovieArray() {
        this(new DataList());
    }

    public MovieArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MovieArray(Collection<Movie> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MovieArray(DataList data) {
        super(data, SCHEMA, Movie.class);
    }

    @Override
    public MovieArray clone()
        throws CloneNotSupportedException
    {
        return ((MovieArray) super.clone());
    }

    @Override
    public MovieArray copy()
        throws CloneNotSupportedException
    {
        return ((MovieArray) super.copy());
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

        public com.restliflix.movielist.Movie.Fields items() {
            return new com.restliflix.movielist.Movie.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
