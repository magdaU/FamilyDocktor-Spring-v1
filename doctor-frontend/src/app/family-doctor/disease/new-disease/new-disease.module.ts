import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {NewDiseaseComponent} from './new-disease.component';
import {FormsModule} from '@angular/forms';
import {DiseaseService} from '../disease.service';

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [NewDiseaseComponent],
  providers: [DiseaseService]

})
export class NewDiseaseModule { }
