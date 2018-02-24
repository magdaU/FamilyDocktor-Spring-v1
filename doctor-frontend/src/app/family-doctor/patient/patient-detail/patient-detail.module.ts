import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PatientDetailRoutingModule } from './patient-detail-routing.module';
import { PatientDetailComponent } from './patient-detail.component';
import {MatTabsModule} from '@angular/material/tabs';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material';

@NgModule({
  imports: [
    CommonModule,
    PatientDetailRoutingModule,
    MatCardModule,
    MatTabsModule,
    MatButtonModule
  ],
  declarations: [PatientDetailComponent]
})
export class PatientDetailModule { }
