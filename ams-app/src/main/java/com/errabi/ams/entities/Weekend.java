package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
@Builder
public class Weekend extends BaseEntity{
    private String dayName ;
    private String dayNumber ;

}
