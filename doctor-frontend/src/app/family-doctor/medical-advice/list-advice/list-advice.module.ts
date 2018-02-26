import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ListAdviceRoutingModule} from './list-advice-routing.module';
import {ListAdviceComponent} from './list-advice.component';

@NgModule({
  imports: [
    CommonModule,
    ListAdviceRoutingModule
  ],
  declarations: [ListAdviceComponent]
})
export class ListAdviceModule { }
