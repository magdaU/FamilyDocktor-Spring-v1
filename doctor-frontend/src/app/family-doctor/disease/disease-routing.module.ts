import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {NewDiseaseComponent} from "./new-disease/new-disease.component";

const routes: Routes = [
  {
    path: 'disease/new', component: NewDiseaseComponent
  }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DiseaseRoutingModule { }
