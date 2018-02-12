import {Component, OnInit} from '@angular/core';
import {Patient} from "../patient.model";
import {PatientService} from "../service/patient.service";

@Component({
  selector: 'app-list-patient',
  templateUrl: './list-patient.component.html',
  styleUrls: ['./list-patient.component.css']
})
export class ListPatientComponent implements OnInit {

  patients: Array<Patient>;

  constructor(private patientService: PatientService) {
  }

  ngOnInit() {
    this.patientService.findAll().subscribe(
      results => {
        this.patients = results;
      },
      err => {
        console.log(err);
      }
    );
  }

}
