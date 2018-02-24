import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DiseaseRoutingModule } from './disease-routing.module';
import {NewDiseaseModule} from "./new-disease/new-disease.module";
import {FormsModule} from "@angular/forms";
import {ListDiseaseComponent} from "./list-disease/list-disease.component";
import {ListDiseaseModule} from "./list-disease/list-disease.module";
import {NewDiseaseComponent} from "./new-disease/new-disease.component";

@NgModule({
  imports: [
    CommonModule,
    DiseaseRoutingModule,
    NewDiseaseModule,
    FormsModule,
    ListDiseaseModule
  ],
  declarations: []
})
export class DiseaseModule { }
