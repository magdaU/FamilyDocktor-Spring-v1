export class Disease {
  id?: number;
  symptom?: string;
  diagnosis?: string;
  isDoctorDiagnosis?: boolean;
  diseaseStartDate?: string;
  diseaseEndDate?: string;
  patientId?: number;

  constructor(id: number, symptom: string, diagnosis: string, isDoctorDiagnosis: boolean, diseaseStartDate: string,
              diseaseEndDate: string, patientId: number) {
    this.id = id;
    this.symptom = symptom;
    this.diagnosis = diagnosis;
    this.isDoctorDiagnosis = isDoctorDiagnosis;
    this.diseaseStartDate = diseaseStartDate;
    this.diseaseEndDate = diseaseEndDate;
    this.patientId = patientId;
  }
}
