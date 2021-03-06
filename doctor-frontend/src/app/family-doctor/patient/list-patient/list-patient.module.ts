import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ListPatientRoutingModule} from './list-patient-routing.module';
import {ListPatientComponent} from './list-patient.component';
import {MatButtonModule, MatPaginatorModule, MatTableModule} from '@angular/material';

@NgModule({
  imports: [
    CommonModule,
    MatTableModule,
    MatPaginatorModule,
    MatButtonModule,
    ListPatientRoutingModule,

  ],
  declarations: [ListPatientComponent]
})
export class ListPatientModule { }
