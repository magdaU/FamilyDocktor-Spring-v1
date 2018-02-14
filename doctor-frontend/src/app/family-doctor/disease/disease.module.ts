import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DiseaseRoutingModule } from './disease-routing.module';
import {NewDiseaseModule} from "./new-disease/new-disease.module";
import {FormsModule} from "@angular/forms";

@NgModule({
  imports: [
    CommonModule,
    DiseaseRoutingModule,
    NewDiseaseModule,
    FormsModule
  ],
  declarations: []
})
export class DiseaseModule { }
