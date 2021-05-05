package com.errabi.ams.services;

import com.errabi.ams.controllers.dto.PlanningDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IPlanningService {
    PlanningDto save(PlanningDto planningDto);
    PlanningDto update(PlanningDto planningDto);
    void delete (UUID planningId);
    Boolean publishPlanning(UUID planningId,boolean enabled);
    Page<PlanningDto> getAllPlanning(Pageable pageable);
}
