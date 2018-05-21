import {Injectable} from '@angular/core';
import {Advice} from './advice.model';
import {Observable} from 'rxjs/Observable';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class AdviceService {

  private apiUrl = 'http://localhost:8080/api/advice';

  constructor(private http: HttpClient) {
  }

  create(advice: Advice): Observable<Advice> {
    console.log(advice);
    return this.http.post(this.apiUrl, advice);
  }
}
