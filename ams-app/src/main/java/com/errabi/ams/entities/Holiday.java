package com.errabi.ams.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@Entity
@Builder
public class Holiday extends BaseEntity{
    private String name ;
    private String description ;
    private LocalDate startDate ;
    private LocalDate endDate ;
}
