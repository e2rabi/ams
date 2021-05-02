package com.errabi.ams.entities;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Embeddable
@Table(name = "PlanningLocationConfig")
public class PlanningLocationConfig {

    @EmbeddedId
    private PlanningLocationConfigFk id ;


    @ManyToOne
    @MapsId("LOCATION_ID")
    @JoinColumn(name = "LOCATION_ID")
    private Location location;

    @ManyToOne
    @MapsId("PLANNING_ID")
    @JoinColumn(name = "PLANNING_ID")
    private Planning planning;

    private Integer capacity ;
    private Integer duration ;
}
