import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarouselComponent } from './component/carousel-component/carousel-component.component';
import { BlankComponent } from './component/blank-component/blank-component.component';
import { VideoComponent } from './component/video-component/video-component.component';
import { MainComponent} from './component/main/main.component'


const routes: Routes = [
  { path: '', redirectTo: 'main', pathMatch: 'full'},
  { path: 'carousel', component: CarouselComponent },
  { path: 'blank', component: BlankComponent },
  { path: 'video', component: VideoComponent },
  { path: 'main', component: MainComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
