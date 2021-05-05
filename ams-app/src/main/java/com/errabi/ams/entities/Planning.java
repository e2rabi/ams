package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@DynamicUpdate
public class Planning extends BaseEntity{
    private String name ;
    private String description ;
    private LocalDate startDate ;
    private LocalDate endDate ;
    private LocalTime startMorningTime ;
    private LocalTime endMorningTime ;
    private LocalTime startAfternoonTime ;
    private LocalTime endMAfternoonTime ;
    private Boolean enabled ;

    @OneToMany(mappedBy = "location")
    private Set<PlanningLocationConfig> planningLocationConfigs = new HashSet<PlanningLocationConfig>();
}
