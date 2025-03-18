package ma.abdellah.hospitalmanagement.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Collection;

@Entity(name = "patient")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateNaissance;
    private boolean malade;
    private int score;
    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;
}
