import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListDiseaseComponent } from './list-disease.component';
import {DiseaseService} from "../disease.service";

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [ListDiseaseComponent],
  providers: [DiseaseService]
})
export class ListDiseaseModule { }
