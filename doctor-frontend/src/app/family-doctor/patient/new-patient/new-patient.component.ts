import {Component, OnInit} from '@angular/core';
import {Patient} from "../patient.model";
import {PatientService} from "../service/patient.service";
import {SexService} from "../service/sex.service";

@Component({
  selector: 'app-new-patient',
  templateUrl: './new-patient.component.html',
  styleUrls: ['./new-patient.component.css']
})
export class NewPatientComponent implements OnInit {

  patient: Patient;
  sexList: any[];

  constructor(private patientService: PatientService, private sexService: SexService) { }

  ngOnInit() {
    this.patient = {};
    this.sexList = this.sexService.findAll();
  }

  save(){
    console.log(this.patient);
  }

  goBack(): void {
    window.history.back();
  }

}
