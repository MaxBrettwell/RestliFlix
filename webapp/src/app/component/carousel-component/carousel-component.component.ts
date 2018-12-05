import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';
import { MovieService } from '../../service/movie.service'
import { MovieList } from '../../model/movie-list';
import { MovieUrl } from 'src/app/model/movie-url';

@Component({
  selector: 'carousel-component',
  templateUrl: './carousel-component.component.html',
  styleUrls: ['./carousel-component.component.scss']
})
export class CarouselComponent implements OnInit {

  _movieList: MovieList;
  public movieCount: number = 0;

  @Output() movieSelected = new EventEmitter();

  @Input() 
    public set movieList(movieList : MovieList) {    
      this.movieCount = 0;    
      this._movieList = movieList;
      if (this._movieList){
        if (this._movieList.movies.length > 0){
          this.movieCount = this._movieList.movies.length;
        }
      }
    }
  
  
  public get movieList(): MovieList{
    return this._movieList;
  }

  constructor(private movieService: MovieService) {
    this._movieList = new MovieList();
  }

  ngOnInit() {
    this._movieList = new MovieList();
  }

   scrollCarousel(scrollValue){
    console.log('scrollin?');

    let divCarousel = document.getElementById("carousel");  
    let width = divCarousel.offsetWidth;    
    //scrollValue = scrollValue * width * 0.1;    
    
    let _this = this;
    divCarousel.scrollLeft = divCarousel.scrollLeft  + (width *scrollValue * .9);

    //this.scrollCarouselSlow(scrollValue, 0, 500, 5);
  }

  movieClick(id: number){
    let ctrl = this;
    ctrl.movieSelected.emit(new MovieUrl());
    this.movieService.getMovieUrl(id).subscribe(response => {ctrl.movieSelected.emit(response); console.log(response); })
  }
    
  //  cosDelay(xValue){  
  //   //I'm using this cosine function to help program smooth scrolling delay
  //   let x = xValue;
  //   let a = 2; //amplitude
  //   let b = 1; //period
    
  //   let delay = 1 * Math.cos((2*Math.PI*x)/b);  
  //   console.log([xValue, delay]);
  //   return delay;
  // }
  
  
  
  // scrollCarouselSlow(scrollValue, iteration, repeatTimes, waitTime){
  //   let _this = this;
  //   let divCarousel = document.getElementById("carousel");  
  //   divCarousel.scrollLeft = divCarousel.scrollLeft  + scrollValue;      
  
  //   let completionPerc = iteration/repeatTimes;
    
  //   if (iteration < repeatTimes){    
  //     iteration = iteration + 1;
      
  //     let adjWaitTime = _this.cosDelay(iteration/repeatTimes)*waitTime;

      

  //     console.log(adjWaitTime);
  //     //setTimeout(_this.scrollCarouselSlow, adjWaitTime, scrollValue, iteration, repeatTimes, waitTime);
  //     setTimeout(()=>{
  //                     _this.scrollCarouselSlow(scrollValue, iteration, repeatTimes, waitTime);
  //                    },  adjWaitTime);
  //   }
  //}
}
