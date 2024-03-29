package mond.mamind.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class DoctorAndCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "doctor_category_id")
    private DoctorCategory doctorCategory;
    public DoctorAndCategory() {

    }
}
