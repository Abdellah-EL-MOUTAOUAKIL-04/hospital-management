package ma.abdellah.hospitalmanagement.service;

import ma.abdellah.hospitalmanagement.entities.Consultation;
import ma.abdellah.hospitalmanagement.entities.Medecin;
import ma.abdellah.hospitalmanagement.entities.Patient;
import ma.abdellah.hospitalmanagement.entities.RendezVous;
import ma.abdellah.hospitalmanagement.repository.ConsultationRepository;
import ma.abdellah.hospitalmanagement.repository.MedecinRepository;
import ma.abdellah.hospitalmanagement.repository.PatientRepository;
import ma.abdellah.hospitalmanagement.repository.RendezVousRepository;

public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;
    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
