package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Builder

public class Constraints extends BaseEntity{
    private String name ;
    private String description ;
    private LocalDate startDate ;
    private LocalDate endDate ;
    private LocalTime timeSlot;

    @ManyToOne
    @JoinColumn(name="location_id", nullable=false)
    private Location location;
}
