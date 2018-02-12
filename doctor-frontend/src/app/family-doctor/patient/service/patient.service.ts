import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Patient} from '../patient.model';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class PatientService {

  private apiUrl = 'http://localhost:8080/api/patient';

  constructor(private http: HttpClient) {
  }

  findAll(): Observable<Array<Patient>> {
    return this.http.get<Array<Patient>>(this.apiUrl);
  }

  create(patient: Patient): Observable<Patient> {
    return this.http.post(this.apiUrl, patient);
  }
}
