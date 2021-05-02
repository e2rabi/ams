package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @OneToMany(mappedBy = "location")
    private Set<PlanningLocationConfig> planningLocationConfigs = new HashSet<PlanningLocationConfig>();
}
