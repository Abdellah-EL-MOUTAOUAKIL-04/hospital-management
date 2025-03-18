package ma.abdellah.hospitalmanagement.repository;

import ma.abdellah.hospitalmanagement.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
