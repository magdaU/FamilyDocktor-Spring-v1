import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {NewDiseaseComponent} from './new-disease/new-disease.component';
import {ListDiseaseComponent} from './list-disease/list-disease.component';


const routes: Routes = [
  {
    path: 'patient/:id/disease/new', component: NewDiseaseComponent
  }, {
    path: 'patient/:id/disease', component: ListDiseaseComponent
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DiseaseRoutingModule {
}
