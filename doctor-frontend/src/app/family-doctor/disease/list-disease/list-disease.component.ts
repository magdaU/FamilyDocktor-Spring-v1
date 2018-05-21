import {Component, OnInit, ViewChild} from '@angular/core';
import {Disease} from '../disease.model';
import {DiseaseService} from '../disease.service';
import {ActivatedRoute} from '@angular/router';
import {MatPaginator, MatTableDataSource} from '@angular/material';

@Component({
  selector: 'app-list-disease',
  templateUrl: './list-disease.component.html',
  styleUrls: ['./list-disease.component.css']
})
export class ListDiseaseComponent implements OnInit {

  displayedColumns = ['symptom', 'diagnosis', 'isDoctorDiagnosis', 'diseaseStartDate', 'diseaseEndDate', 'operation'];
  dataSource: MatTableDataSource<Disease>;

  @ViewChild(MatPaginator) paginator: MatPaginator;

  idDisease: number;

  idPatient: number;
  private sub: any;

  constructor(private diseaseService: DiseaseService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.idPatient = +params['id']; // (+) converts string 'id' to a number
    });

    this.diseaseService.findAllByPatientId(this.idPatient).subscribe(
      results => {
        this.dataSource = new MatTableDataSource<Disease>(results);
        this.dataSource.paginator = this.paginator;
      },
      err => {
        console.log(err);
      }
    );
  }

}
