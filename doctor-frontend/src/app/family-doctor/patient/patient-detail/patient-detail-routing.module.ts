import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {PatientDetailComponent} from './patient-detail.component';

const routes: Routes = [
  {
    path: 'patient/:id', component: PatientDetailComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PatientDetailRoutingModule { }

