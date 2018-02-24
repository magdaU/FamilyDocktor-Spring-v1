import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {NewPatientRoutingModule} from './new-patient-routing.module';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule} from "@angular/forms";
import {MatButtonModule, MatInputModule, MatSelectModule, MatNativeDateModule} from "@angular/material";
import {MatDatepickerModule} from '@angular/material/datepicker';
import {NewPatientComponent} from "./new-patient.component";

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    NewPatientRoutingModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule
  ],
  declarations: [NewPatientComponent]
})
export class NewPatientModule {
}
