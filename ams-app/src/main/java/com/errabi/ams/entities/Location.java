package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
@Builder
public class Location extends BaseEntity{
    private String name ;
    private String description ;
    private String address;
    private Long longitude;
    private Long latitude;

}
