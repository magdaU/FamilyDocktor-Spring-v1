import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {NewAdviceComponent} from './new-advice.component';

const routes: Routes = [
  {
    path: 'patient/:id/disease/:idDisease/advice/new', component: NewAdviceComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NewAdviceRoutingModule { }
