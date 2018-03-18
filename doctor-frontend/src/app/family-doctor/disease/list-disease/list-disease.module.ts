import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ListDiseaseComponent} from './list-disease.component';
import {DiseaseService} from '../disease.service';
import {RouterModule} from '@angular/router';
import {MatButtonModule, MatPaginatorModule, MatTableModule} from '@angular/material';

@NgModule({
  imports: [
    CommonModule,
    MatTableModule,
    MatPaginatorModule,
    MatButtonModule,
    RouterModule
  ],
  declarations: [ListDiseaseComponent],
  providers: [DiseaseService]
})
export class ListDiseaseModule { }
