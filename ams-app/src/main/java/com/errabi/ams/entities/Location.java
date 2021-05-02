package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
public class Location extends BaseEntity{
    private String name ;
    private String description ;
    private String address;
    private Long longitude;
    private Long latitude;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="CITY_CODE",nullable=true)
    private Location city;

    @OneToMany(mappedBy = "planning")
    private Set<PlanningLocationConfig> planningLocationConfigs = new HashSet<PlanningLocationConfig>();

    @OneToMany(mappedBy="location")
    private Set<Constraints> constraints ;

    @OneToMany(mappedBy="location")
    private Set<Holiday> holidays ;

    @OneToMany(mappedBy="location")
    private Set<Weekend> weekends ;

    @OneToMany(mappedBy="location")
    private Set<Appointment> appointments ;

}
