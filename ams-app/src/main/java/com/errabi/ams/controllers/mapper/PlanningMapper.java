package com.errabi.ams.controllers.mapper;

import com.errabi.ams.controllers.dto.PlanningDto;
import com.errabi.ams.entities.Planning;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalTime;

@Mapper
public interface PlanningMapper {

    PlanningDto planningToPlanningDto(Planning planning);
    Planning    planningDtoToPlanning(PlanningDto planningDto);
}
