package ma.abdellah.hospitalmanagement;

import ma.abdellah.hospitalmanagement.entities.*;
import ma.abdellah.hospitalmanagement.repository.ConsultationRepository;
import ma.abdellah.hospitalmanagement.repository.MedecinRepository;
import ma.abdellah.hospitalmanagement.repository.PatientRepository;
import ma.abdellah.hospitalmanagement.repository.RendezVousRepository;
import ma.abdellah.hospitalmanagement.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalManagementApplication.class, args);
    }

    //Sa si pour la premiere version
    //    @Bean
    //    public CommandLineRunner commandLineRunner(){
    //        return args -> {
    //            //l'ajout
    //            System.out.println("********* L'ajout des patients ********");
    //            patientRepository.save(new Patient(null, "abdellah", LocalDate.of(2004, 2, 26), false, 100));
    //            patientRepository.save(new Patient(null, "ahmed", LocalDate.of(1999, 4, 26), false, 200));
    //            patientRepository.save(new Patient(null, "zahra", LocalDate.of(2002, 9, 26), false, 500));
    //            //Consultation de tous les patients
    //            System.out.println("********* Tous les patients ********");
    //            List<Patient> patients = patientRepository.findAll();
    //            patients.forEach(System.out::println);
    //            //Consultation d'un patient
    //            System.out.println("********* Le patient avec l'id 1 ********");
    //            Patient patient=patientRepository.findById(1L).get();
    //            System.out.println(patient.toString());
    //            //Modifier
    //            System.out.println("********* Modification de patient avec id 1 ********");
    //            patient.setNom("salah");
    //            patientRepository.save(patient);
    //            patient=patientRepository.findById(1L).get();
    //            System.out.println(patient.toString());
    //            //Supprimer
    //            System.out.println("********* Suppression de patient avec id 1 ********");
    //            patientRepository.delete(patient);
    //            patients=patientRepository.findAll();
    //            System.out.println("********* Tous les patients apres la suppression ********");
    //            patients.forEach(System.out::println);
    //        };
    //    }

    //2nd version
    @Bean
    CommandLineRunner start(IHospitalService hospitalService,
                            PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            RendezVousRepository rendezVousRepository) {
        return args -> {
            Stream.of("abdellah","zahra","ahmed").forEach(name -> {
                Patient patient=new Patient();
                patient.setNom(name);
                patient.setDateNaissance(LocalDate.now());
                patient.setMalade(false);
                patient.setScore(100);
                hospitalService.savePatient(patient);
            });

            Stream.of("atmane","salah","omar").forEach(name -> {
                Medecin medecin=new Medecin();
                medecin.setNom(name);
                medecin.setEmail("test@gmail.com");
                medecin.setSpecialite("specialite X");
                hospitalService.saveMedecin(medecin);
            });

            Patient patient=patientRepository.findById(1L).orElse(null);
            patient=patientRepository.findByNom("abdellah");

            Medecin medecin=medecinRepository.findByNom("salah");

            RendezVous rendezVous=new RendezVous();
            rendezVous.setDate(LocalDate.now());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            hospitalService.saveRDV(rendezVous);

            RendezVous rdv=rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation=new Consultation();
            consultation.setDateConsultation(LocalDate.now());
            consultation.setRendezVous(rdv);
            consultation.setRapport("r1");
            hospitalService.saveConsultation(consultation);
        };

    }

}
