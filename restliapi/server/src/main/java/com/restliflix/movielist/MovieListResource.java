/**
 * Simple Rest.li Resource that returns list of all movies
 */
package com.restliflix.movielist;

//import com.linkedin.restli.server.annotations.RestLiCollection;
//import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.linkedin.restli.server.annotations.RestLiSimpleResource;
import com.linkedin.restli.server.resources.SimpleResourceTemplate;
import com.linkedin.restli.internal.server.util.DataMapUtils;

import java.io.FileReader;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

// Data Model to use with GSON shenanigans
class GMovie{
  long id;
  String name;
  String imageUrl;
}

@RestLiSimpleResource(name = "movielist")
  public class MovieListResource extends SimpleResourceTemplate<MovieList> {

  MovieList movieList = new MovieList();

  @Override
  //public MovieUrl get(Long key) throws RuntimeException {
  public MovieList get() throws RuntimeException { 
    try{
      String json;    
      String filePath = "../data/movies.json";

      //GSON shenanigans to strip away unwanted json fields before mapping to rest.li response
      Gson gson = new Gson();      
      GMovie[] gsonArray = new GMovie[0];      
      gsonArray = gson.fromJson(new FileReader(filePath), GMovie[].class);
      json = gson.toJson(gsonArray, GMovie[].class);
      json = "{\"movies\":" + json + "}"; 
      
      //convert 
      InputStream in = IOUtils.toInputStream(json);      
      MovieList movieList = DataMapUtils.read(in, MovieList.class); // Where Greeting is class extending RecordTemplate     
      return movieList;
    }
    catch (Exception ex){
      throw new RuntimeException(ex);
    }
  }
}