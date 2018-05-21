import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {NewAdviceRoutingModule} from './new-advice-routing.module';
import {NewAdviceComponent} from './new-advice.component';
import {MatButtonModule, MatInputModule, MatNativeDateModule, MatSelectModule} from '@angular/material';
import {FormsModule} from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {AdviceService} from '../advice.service';

@NgModule({
  imports: [
    CommonModule,
    NewAdviceRoutingModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule
  ],
  declarations: [NewAdviceComponent],
  providers: [AdviceService]
})
export class NewAdviceModule { }
