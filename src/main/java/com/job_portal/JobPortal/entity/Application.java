package com.job_portal.JobPortal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="applications")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="candidate_id")
    private User candidate;

    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job;
    private String coverLetter;
    private String status;
    private LocalDate appliedDate;

}
