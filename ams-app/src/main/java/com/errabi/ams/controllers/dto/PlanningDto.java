package com.errabi.ams.controllers.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Data
@Builder
public class PlanningDto {
    private UUID id;
    private String name ;
    private String description ;
    private LocalDate startDate ;
    private LocalDate endDate ;
    private LocalTime startMorningTime ;
    private LocalTime endMorningTime ;
    private LocalTime startAfternoonTime ;
    private LocalTime endMAfternoonTime ;
    private Boolean enabled ;
}
