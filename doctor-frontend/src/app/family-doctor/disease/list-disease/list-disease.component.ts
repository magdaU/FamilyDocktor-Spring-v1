import {Component, OnInit} from '@angular/core';
import {Disease} from '../disease.model';
import {DiseaseService} from '../disease.service';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-list-disease',
  templateUrl: './list-disease.component.html',
  styleUrls: ['./list-disease.component.css']
})
export class ListDiseaseComponent implements OnInit {

  diseases: Array<Disease>

  idPatient: number;
  private sub: any;

  constructor(private diseaseService: DiseaseService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.idPatient = +params['id']; // (+) converts string 'id' to a number
    });

    this.diseaseService.findAllByPatientId(this.idPatient).subscribe(
      results => {
        this.diseases = results;
      },
      err => {
        console.log(err);
      }
    );
  }

}
