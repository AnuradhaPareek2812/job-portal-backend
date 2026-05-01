package com.job_portal.JobPortal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="jobs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String company;

    private String location;
    private String description;
    private Double salary;
    private String category;
    private String jobType;
    private boolean isActive=true;
    private LocalDate postedDate;

    @ManyToOne
    @JoinColumn(name="recruiter_id")
    private User recruiter;
}
