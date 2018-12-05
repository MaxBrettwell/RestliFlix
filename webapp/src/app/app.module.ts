import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarouselComponent } from './component/carousel-component/carousel-component.component';
import { BlankComponent } from './component/blank-component/blank-component.component';
import { VideoComponent } from './component/video-component/video-component.component';
import { MainComponent} from './component/main/main.component'

import { Injectable } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CarouselComponent,
    BlankComponent,
    VideoComponent,
    MainComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
