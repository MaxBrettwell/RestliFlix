import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-carousel-component',
  templateUrl: './carousel-component.component.html',
  styleUrls: ['./carousel-component.component.scss']
})
export class CarouselComponentComponent implements OnInit {

  constructor() { }

  ngOnInit() {
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
