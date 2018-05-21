import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ListAdviceComponent} from './list-advice.component';

const routes: Routes = [
  {
    path: 'patient/:id/disease/:idDisease/advice', component: ListAdviceComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ListAdviceRoutingModule {
}
