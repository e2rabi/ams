package com.errabi.ams.services;

import com.errabi.ams.controllers.dto.PlanningDto;
import com.errabi.ams.services.exception.AmsException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IPlanningService {
    PlanningDto save(PlanningDto planningDto);
    void update(PlanningDto planningDto) throws AmsException;
    void delete (UUID planningId) throws AmsException;
    Boolean publishPlanning(UUID planningId,boolean enabled) throws AmsException;
    Page<PlanningDto> getAllPlanning(Pageable pageable);
}
