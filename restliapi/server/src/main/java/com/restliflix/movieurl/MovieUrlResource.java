/**
 * Simple Rest.li Resource that returns movie details
 */
 package com.restliflix.movieurl;

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
class GMovieUrl{
  long id;
  String movieUrl;
}

@RestLiCollection(name = "movieurl")
public class MovieUrlResource extends CollectionResourceTemplate<Long, MovieUrl>{
  
  @Override  
  public MovieUrl get(Long key) throws RuntimeException {
    try{
      
      String filePath = "../data/movies.json";
      String json;

      //GSON shenanigans to strip away unwanted json fields before mapping to rest.li response
      Gson gson = new Gson();      
      GMovieUrl[] gsonArray = new GMovieUrl[0];
      gsonArray = gson.fromJson(new FileReader(filePath), GMovieUrl[].class);      
      json = gson.toJson(gsonArray, GMovieUrl[].class);
      json = gson.toJson(gsonArray[(int)(long)key], GMovieUrl.class);      
      
      //convert 
      InputStream in = IOUtils.toInputStream(json);
      MovieUrl movieUrl = DataMapUtils.read(in, MovieUrl.class); // Where Greeting is class extending RecordTemplate           
      return movieUrl;
    }
    catch (Exception ex){
      throw new RuntimeException(ex);
    }
  }
}