package com.errabi.ams.controllers.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class PlanningDto {
    private String name ;
    private String description ;
    private LocalDate startDate ;
    private LocalDate endDate ;
    private LocalTime startMorningTime ;
    private LocalTime endMorningTime ;
    private Boolean enabled ;
}
