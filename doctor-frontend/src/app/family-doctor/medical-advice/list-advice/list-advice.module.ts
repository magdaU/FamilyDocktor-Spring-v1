import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ListAdviceRoutingModule} from './list-advice-routing.module';
import {ListAdviceComponent} from './list-advice.component';
import {MatButtonModule} from '@angular/material';
import {RouterModule} from '@angular/router';

@NgModule({
  imports: [
    CommonModule,
    ListAdviceRoutingModule,
    MatButtonModule,
    RouterModule
  ],
  declarations: [ListAdviceComponent]
})
export class ListAdviceModule { }
