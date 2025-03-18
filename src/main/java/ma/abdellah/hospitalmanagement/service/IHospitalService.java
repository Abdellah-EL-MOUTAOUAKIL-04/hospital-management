package ma.abdellah.hospitalmanagement.service;

import ma.abdellah.hospitalmanagement.entities.Consultation;
import ma.abdellah.hospitalmanagement.entities.Medecin;
import ma.abdellah.hospitalmanagement.entities.Patient;
import ma.abdellah.hospitalmanagement.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
