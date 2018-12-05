import { Component, OnInit, Input } from '@angular/core';
import { MovieUrl } from '../../model/movie-url';

@Component({
  selector: 'video-component',
  templateUrl: './video-component.component.html',
  styleUrls: ['./video-component.component.css']
})

export class VideoComponent implements OnInit {

  private _movieUrl: MovieUrl;
  public hasMovie: boolean = false;

  @Input()
  set movieUrl(movieUrl: MovieUrl) {
    this.hasMovie = false;
    this._movieUrl = movieUrl;    
      if (this._movieUrl.movieUrl) {
        if (this._movieUrl.movieUrl.length > 0) {
          this.hasMovie = true;
        }
      }
  }

  get movieUrl(): MovieUrl {
    return this._movieUrl;
  }

  constructor() {
    this.movieUrl = new MovieUrl();
    //this.movieUrl.movieUrl = 'https://dz1vmszs6rjp8.cloudfront.net/t/v2/3be2f94d-da7c-454b-849f-3e2f8b31a5bd/ToyStory4_DomesticTrailer1A_Clouds_NoGreenband_x264-(1)/high.mp4';    
  }

  ngOnInit() { }
}
