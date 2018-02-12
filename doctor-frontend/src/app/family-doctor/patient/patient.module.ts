import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {NewPatientModule} from './new-patient/new-patient.module';
import {NewPatientComponent} from './new-patient/new-patient.component';
import {FormsModule} from '@angular/forms';
import {PatientService} from './service/patient.service';
import {SexService} from './service/sex.service';
import {ListPatientModule} from "./list-patient/list-patient.module";

@NgModule({
  imports: [
    CommonModule,
    NewPatientModule,
    ListPatientModule,
    FormsModule
  ],
  declarations: [NewPatientComponent],
  providers: [PatientService, SexService]
})
export class PatientModule { }
