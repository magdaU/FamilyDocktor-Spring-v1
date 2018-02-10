import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';

import {AppComponent} from './app.component';
import {FamilyDoctorModule} from './family-doctor/family-doctor.module';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FamilyDoctorModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
