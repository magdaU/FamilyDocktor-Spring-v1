export class Patient {
  id?: number;
  firstName?: string;
  lastName?: string;
  birthDate?: any;
  sex?: any;

  constructor(id: number, firstName: string, lastName: string, birthDate: any, sex: any) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.sex = sex;
  }
}
