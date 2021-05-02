package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Builder
public class Planning extends BaseEntity{
    private String name ;
    private String description ;
    private LocalDate startDate ;
    private LocalDate endDate ;
    private LocalTime startMorningTime ;
    private LocalTime endMorningTime ;
    private Boolean enabled ;
}
