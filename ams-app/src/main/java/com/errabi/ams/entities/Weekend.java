package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@Builder
public class Weekend extends BaseEntity{
    private String dayName ;
    private String dayNumber ;

    @ManyToOne
    @JoinColumn(name="location_id", nullable=false)
    private Location location;
}
