package ma.abdellah.hospitalmanagement.repository;

import ma.abdellah.hospitalmanagement.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
