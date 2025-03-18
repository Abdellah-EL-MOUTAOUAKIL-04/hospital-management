package ma.abdellah.hospitalmanagement.repository;

import ma.abdellah.hospitalmanagement.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
