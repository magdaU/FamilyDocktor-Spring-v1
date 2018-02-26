import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ListDiseaseComponent} from './list-disease.component';
import {DiseaseService} from '../disease.service';
import {RouterModule} from '@angular/router';
import {MatButtonModule} from '@angular/material';

@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    MatButtonModule
  ],
  declarations: [ListDiseaseComponent],
  providers: [DiseaseService]
})
export class ListDiseaseModule { }
