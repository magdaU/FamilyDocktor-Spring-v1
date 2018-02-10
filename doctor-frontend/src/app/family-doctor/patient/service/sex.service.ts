import {Injectable} from '@angular/core';

@Injectable()
export class SexService {

  sex = [{value: 'Male'}, {value: 'Female'}];

  constructor() { }

  findAll(): any[] {
    return this.sex;
  }

}
