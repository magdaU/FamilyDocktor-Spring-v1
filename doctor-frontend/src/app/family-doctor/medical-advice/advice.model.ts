import {Treatment} from './treatment.model';

export class Advice {

  id?: number;
  comment?: string;
  isDoctorAdvice?: boolean;
  adviceDate?: string;
  treatments?: Array<Treatment>;

  constructor(id: number, comment: string, isDoctorAdvice: boolean, adviceDate: string, treatments: Array<Treatment>) {
    this.id = id;
    this.comment = comment;
    this.isDoctorAdvice = isDoctorAdvice;
    this.adviceDate = adviceDate;
    this.treatments = treatments;
  }
}
