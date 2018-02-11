import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {FamilyDoctorRoutingModule} from './family-doctor-routing.module';
import {PatientModule} from './patient/patient.module';

@NgModule({
  imports: [
    CommonModule,
    FamilyDoctorRoutingModule,
    PatientModule
  ],
  declarations: []
})
export class FamilyDoctorModule { }
