/**
 * Simple Rest.li Resource that returns movie details
 */
package com.restliflix.moviedata;

import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
//import com.linkedin.restli.server.annotations.RestLiSimpleResource;
//import com.linkedin.restli.server.resources.SimpleResourceTemplate;
import com.linkedin.restli.internal.server.util.DataMapUtils;

import java.io.FileReader;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

// Data Model to use with GSON shenanigans
class GMovieData{
  long id;
  String name;
  String movieUrl;
  String imageUrl;
  String descr;
  int year;  
}

@RestLiCollection(name = "moviedata")
public class MovieDataResource extends CollectionResourceTemplate<Long, MovieData>{
  
  @Override  
  public MovieData get(Long key) throws RuntimeException {
    try{
      
      String filePath = "../data/movies.json";
      String json;

      //GSON shenanigans to strip away unwanted json fields before mapping to rest.li response
      Gson gson = new Gson();      
      GMovieData[] gsonArray = new GMovieData[0];
      gsonArray = gson.fromJson(new FileReader(filePath), GMovieData[].class);      
      json = gson.toJson(gsonArray, GMovieData[].class);
      json = gson.toJson(gsonArray[(int)(long)key], GMovieData.class);      
      
      //convert 
      InputStream in = IOUtils.toInputStream(json);
      MovieData movieData = DataMapUtils.read(in, MovieData.class); // Where Greeting is class extending RecordTemplate           
      return movieData;
    }
    catch (Exception ex){
      throw new RuntimeException(ex);
    }
  }
}