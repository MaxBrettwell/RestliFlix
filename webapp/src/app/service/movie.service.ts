import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
//import 'rxjs/add/operator/map';

import { MovieData } from '../model/movie-data';
import { MovieList } from '../model/movie-list';
//import { MovieListItem } from '../model/movie-list-item';
import { MovieUrl } from '../model/movie-url';


@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor (
    private http: HttpClient
  ) {}

  public getMovieList(): Observable<MovieList> {
    let ctrl = this;
    let url = 'api/movielist/'
    return this.http.get<MovieList>(url);    
  }

  public getMovieData(id: Number): Observable<MovieData> {
    let ctrl = this;
    let url = 'api/moviedata/' + id;
    return this.http.get<MovieData>(url);    
  }

  public getMovieUrl(id: Number): Observable<MovieUrl> {
    let ctrl = this;
    let url = 'api/movieurl/' + id;
    return this.http.get<MovieUrl>(url);    
  }

}
