import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {NewDiseaseComponent} from "./new-disease/new-disease.component";
import {ListDiseaseComponent} from "./list-disease/list-disease.component";


const routes: Routes = [
  {
    path: 'disease/new', component: NewDiseaseComponent
  }, {
    path: 'disease', component: ListDiseaseComponent
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DiseaseRoutingModule {
}
