import {Component, OnInit} from '@angular/core';
import {Disease} from "../disease.model";
import {DiseaseService} from "../disease.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-new-disease',
  templateUrl: './new-disease.component.html',
  styleUrls: ['./new-disease.component.css']
})
export class NewDiseaseComponent implements OnInit {

  disease: Disease;

  idPatient: number;
  private sub: any;


  constructor(private diseaseService: DiseaseService, private route: ActivatedRoute) {
  }

  ngOnInit() {
    this.disease = {};

    this.sub = this.route.params.subscribe(params => {
      this.idPatient = +params['id']; // (+) converts string 'id' to a number
    });
  }

  save() {
    this.disease.patientId = this.idPatient;
    this.diseaseService.create(this.disease).subscribe();
  }

  goBack() {

  }
}
