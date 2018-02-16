import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {FamilyDoctorRoutingModule} from './family-doctor-routing.module';
import {PatientModule} from './patient/patient.module';
import {DiseaseModule} from "./disease/disease.module";

@NgModule({
  imports: [
    CommonModule,
    FamilyDoctorRoutingModule,
    PatientModule,
    DiseaseModule
  ],
  declarations: []
})
export class FamilyDoctorModule { }
