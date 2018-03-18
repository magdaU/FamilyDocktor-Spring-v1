import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FamilyDoctorRoutingModule} from './family-doctor-routing.module';
import {PatientModule} from './patient/patient.module';
import {DiseaseModule} from './disease/disease.module';
import {ListAdviceModule} from './medical-advice/list-advice/list-advice.module';
import {NewAdviceModule} from './medical-advice/new-advice/new-advice.module';

@NgModule({
  imports: [
    CommonModule,
    FamilyDoctorRoutingModule,
    PatientModule,
    DiseaseModule,
    ListAdviceModule,
    NewAdviceModule
  ],
  declarations: []
})
export class FamilyDoctorModule { }
