import {Component, OnInit} from '@angular/core';
import {Disease} from "../disease.model";
import {DiseaseService} from "../disease.service";

@Component({
  selector: 'app-new-disease',
  templateUrl: './new-disease.component.html',
  styleUrls: ['./new-disease.component.css']
})
export class NewDiseaseComponent implements OnInit {

  disease: Disease;

  constructor(private diseaseService: DiseaseService) {
  }

  ngOnInit() {
    this.disease = {};
  }

  save() {
    this.diseaseService.create(this.disease).subscribe();
  }

  goBack() {

  }
}
