package com.errabi.ams.controllers.mapper;

import com.errabi.ams.controllers.dto.PlanningDto;
import com.errabi.ams.entities.Planning;
import org.mapstruct.Mapper;

@Mapper
public interface PlanningMapper {

    PlanningDto planningToPlanningDto(Planning planning);
    Planning    planningDtoToPlanning(PlanningDto planningDto);
}
