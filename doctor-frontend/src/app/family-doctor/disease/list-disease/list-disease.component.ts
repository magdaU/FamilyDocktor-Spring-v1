import { Component, OnInit } from '@angular/core';
import {Disease} from '../disease.model';
import {DiseaseService} from '../disease.service';

@Component({
  selector: 'app-list-disease',
  templateUrl: './list-disease.component.html',
  styleUrls: ['./list-disease.component.css']
})
export class ListDiseaseComponent implements OnInit {

  diseases: Array<Disease>

  constructor(private diseaseService: DiseaseService) { }

  ngOnInit() {
    this.diseaseService.findAll().subscribe(
      results => {
        this.diseases = results;
      },
      err => {
        console.log(err);
      }
    );
  }

}
