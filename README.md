# RestliFlix
Restliflix is an Angular 7 movie carousel application using Rest.li as a backend server.  


##
The Rest.li services serves all data from a single json file acting as a central data source.  Data is returned from 3 seperate methods.


- get /movielist

   returns a list of all available movies, titles, and a preview image url
   
- get /moviedata/{id} 

   returns more movie data for the given movie id, including year and description.

- get /movieurl/{id} 

   returns the movie video url for the given movie id




# Requirements
- Node: https://nodejs.org/en/download/
- Java: https://www.java.com/en/download/windows-64bit.jsp
- Gradle: https://gradle.org/install/



# How To Run

## 1: Install node modules
- navigate a command prompt to restliflix\webapp\src\app
- run command "npm install"

## 2: Start node server
- navigate a command prompt to restliflix\webapp\src\app
- run command "npm start"

## 3: Start Restli server
- navigate a command prompt to restliflix\restliapi\server
- run command "gradle startMovieServer"

## 4: Open RestliFlix Application
- navigate your web browser to http://localhost:4200
