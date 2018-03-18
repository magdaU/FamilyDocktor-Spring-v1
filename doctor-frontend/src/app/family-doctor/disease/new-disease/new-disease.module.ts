import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DiseaseService} from '../disease.service';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule} from '@angular/forms';
import {MatButtonModule, MatInputModule, MatNativeDateModule, MatSelectModule} from '@angular/material';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {NewDiseaseComponent} from './new-disease.component';


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    MatCheckboxModule
  ],
  declarations: [NewDiseaseComponent],
  providers: [DiseaseService]

})
export class NewDiseaseModule { }
