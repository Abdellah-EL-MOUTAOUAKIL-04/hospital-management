package ma.abdellah.hospitalmanagement;

import ma.abdellah.hospitalmanagement.entities.Patient;
import ma.abdellah.hospitalmanagement.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalManagementApplication {

    private PatientRepository patientRepository;
    public HospitalManagementApplication(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

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


}
