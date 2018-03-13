import {Component, OnInit} from '@angular/core';
import {Advice} from '../advice.model';
import {AdviceService} from '../advice.service';

@Component({
  selector: 'app-new-advice',
  templateUrl: './new-advice.component.html',
  styleUrls: ['./new-advice.component.css']
})
export class NewAdviceComponent implements OnInit {

  advice: Advice;

  constructor(private adviceService: AdviceService) { }

  ngOnInit() {
    this.advice = {};
  }

  save() {
    this.adviceService.create(this.advice).subscribe();
  }
}
