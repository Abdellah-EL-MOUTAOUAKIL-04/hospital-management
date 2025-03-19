package ma.abdellah.hospitalmanagement.web;

import ma.abdellah.hospitalmanagement.entities.Patient;
import ma.abdellah.hospitalmanagement.repository.PatientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    private PatientRepository patientRepository;
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }
}
