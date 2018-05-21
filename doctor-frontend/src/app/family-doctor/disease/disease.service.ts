import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Disease} from './disease.model';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class DiseaseService {

  private apiURL = 'http://localhost:8080/api/disease';
  // private apiURL = 'http://family.alburnus.pl:8080/api/disease';

  constructor(private http: HttpClient) {
  }

  findAllByPatientId(idPatient: number): Observable<Array<Disease>> {
    return this.http.get<Array<Disease>> (this.apiURL + '/patient/' + idPatient);
  }

  create(disease: Disease): Observable<Disease> {
    return this.http.post(this.apiURL, disease);
  }
}
