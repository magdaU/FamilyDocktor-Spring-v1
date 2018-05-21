export class Treatment {

  constructor(id: number, frequency: string, dosageFromDate: string, dosageToDate: string, comment: string, drugName: string) {
    this.id = id;
    this.frequency = frequency;
    this.dosageFromDate = dosageFromDate;
    this.dosageToDate = dosageToDate;
    this.comment = comment;
    this.drugName = drugName;
  }
  id?: number;
  frequency?: string;
  dosageFromDate?: string;
  dosageToDate?: string;
  comment?: string;
  drugName?: string;

}
