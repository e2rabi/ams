package com.errabi.ams.services.impl;

import com.errabi.ams.controllers.dto.PlanningDto;
import com.errabi.ams.controllers.mapper.PlanningMapper;
import com.errabi.ams.entities.Planning;
import com.errabi.ams.repositories.PlanningRepository;
import com.errabi.ams.services.IPlanningService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequiredArgsConstructor
public class PlanningServiceImpl implements IPlanningService {

    PlanningRepository planningRepository ;
    PlanningMapper planningMapper;

    @Override
    @Transactional
    public PlanningDto save(PlanningDto planningDto) {
        final Planning planning = planningRepository.save(planningMapper.planningDtoToPlanning(planningDto));
        return planningMapper.planningToPlanningDto(planning);
    }

    @Override
    public PlanningDto update(PlanningDto planningDto) {
        return null;
    }

    @Override
    public void delete(UUID planningId) {

    }

    @Override
    public Boolean publishPlanning(UUID planningId,boolean enabled) {
        return null;
    }

    @Override
    public Page<PlanningDto> getAllPlanning(Pageable pageable) {
        Page<PlanningDto> pagePlannings = planningRepository.findAll(pageable).map(planningMapper::planningToPlanningDto);
        return  pagePlannings;
    }
}
