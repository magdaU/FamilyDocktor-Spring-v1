import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {NewPatientComponent} from './new-patient.component';

const routes: Routes = [
  {path: 'patient/new', component: NewPatientComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NewPatientRoutingModule { }
