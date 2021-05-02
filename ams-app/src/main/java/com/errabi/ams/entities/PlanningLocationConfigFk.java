package com.errabi.ams.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class PlanningLocationConfigFk  implements Serializable {


    @Column(name = "LOCATION_ID")
    private UUID location_id;

    @Column(name = "PLANNING_ID")
    private UUID planning_id;
}
