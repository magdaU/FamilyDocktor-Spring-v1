import {Component, OnInit, ViewChild} from '@angular/core';
import {Patient} from '../patient.model';
import {PatientService} from '../service/patient.service';
import {MatPaginator, MatTableDataSource} from '@angular/material';


@Component({
  selector: 'app-list-patient',
  templateUrl: './list-patient.component.html',
  styleUrls: ['./list-patient.component.css']
})
export class ListPatientComponent implements OnInit {

  displayedColumns = ['firstName', 'lastName', 'birthDate', 'sex', 'operation'];
  dataSource: MatTableDataSource<Patient>;

  @ViewChild(MatPaginator) paginator: MatPaginator;

  patients: Array<Patient>;

  constructor(private patientService: PatientService) {
  }

  ngOnInit() {
    this.patientService.findAll().subscribe(
      results => {
        this.dataSource = new MatTableDataSource<Patient>(results);
        this.dataSource.paginator = this.paginator;
      },
      err => {
        console.log(err);
      }
    );
  }

}
