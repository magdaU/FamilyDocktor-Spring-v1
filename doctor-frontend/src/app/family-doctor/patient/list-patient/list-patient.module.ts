import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ListPatientRoutingModule} from './list-patient-routing.module';
import {ListPatientComponent} from './list-patient.component';
import {MatButtonModule} from '@angular/material/button';

@NgModule({
  imports: [
    CommonModule,
    ListPatientRoutingModule,
    MatButtonModule
  ],
  declarations: [ListPatientComponent]
})
export class ListPatientModule { }
