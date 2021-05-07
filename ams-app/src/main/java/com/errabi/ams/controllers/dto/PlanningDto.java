package com.errabi.ams.controllers.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class PlanningDto {

    private UUID id;
    @NotBlank(message = "Planning name required")
    private String name ;
    private String description ;
    @NotNull(message = "Planning start date required")
    private LocalDate startDate ;
    @NotNull(message = "Planning end date required")
    private LocalDate endDate ;
    @NotBlank(message = "Planning start morning time required")
    private String startMorningTime ;
    @NotBlank(message = "Planning end morning time required")
    private String endMorningTime ;
    @NotBlank(message = "Planning start afternoon time required")
    private String startAfternoonTime ;
    @NotBlank(message = "Planning end afternoon time required")
    private String endMAfternoonTime ;
    @NotNull(message = "Planning enable flag required")
    private Boolean enabled ;
}
