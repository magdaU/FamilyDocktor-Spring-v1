import {Injectable} from '@angular/core';
import {Sex} from '../sex.model';

@Injectable()
export class SexService {

  sex: Sex[];

  constructor() {
  }

  findAll(): any[] {
    this.sex = [
      {nameFront: 'Male', nameEnum: 'MALE'},
      {nameFront: 'Female', nameEnum: 'FEMALE'}
    ];
    return this.sex;
  }

}
