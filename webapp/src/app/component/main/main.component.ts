import { Component, OnInit } from '@angular/core';
import { CarouselComponent} from '../carousel-component/carousel-component.component'
import { VideoComponent } from '../video-component/video-component.component';
import { MovieService } from '../../service/movie.service';
import { MovieList} from '../../model/movie-list';
import { MovieListItem } from '../../model/movie-list-item';
import { MovieUrl} from '../../model/movie-url';
import { MovieData} from '../../model/movie-data';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
  //movieList: MovieListItem[];
  movieList: MovieList;
  movieUrl: MovieUrl;

  constructor(private movieServie: MovieService) { }
  
  ngOnInit() {    
    this.movieServie.getMovieList().subscribe(response => {this.movieList = response; console.log(response);)
  }

  loadMovie(movieUrl: MovieUrl){
    this.movieUrl = movieUrl;
  } 
}
