package com.errabi.ams.services.impl;

import com.errabi.ams.controllers.dto.PlanningDto;
import com.errabi.ams.controllers.mapper.PlanningMapper;
import com.errabi.ams.entities.Planning;
import com.errabi.ams.repositories.PlanningRepository;
import com.errabi.ams.services.IPlanningService;
import com.errabi.ams.services.exception.AmsException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.UUID;

import static com.errabi.ams.utils.AmsConstants.PLANING_NOT_FOUND;


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
    public void update(PlanningDto dto) throws AmsException {
        final Planning planning =   planningRepository.findById(dto.getId()).orElseThrow(()->new AmsException(PLANING_NOT_FOUND));
        final Planning planningToUpdate = planningMapper.planningDtoToPlanning(dto);
        BeanUtils.copyProperties(planning,planningToUpdate);
        planningRepository.save(planningToUpdate);
    }

    @Override
    public void delete(UUID planningId) throws AmsException {
        final Planning planning =   planningRepository.findById(planningId).orElseThrow(()->new AmsException(PLANING_NOT_FOUND));
        planningRepository.delete(planning);
    }

    @Override
    public Boolean publishPlanning(UUID planningId,boolean enabled) throws AmsException {
        final Planning planning =   planningRepository.findById(planningId).orElseThrow(()->new AmsException(PLANING_NOT_FOUND));
        planning.setEnabled(enabled);
        planningRepository.save(planning);
        return enabled ;
    }

    @Override
    public Page<PlanningDto> getAllPlanning(Pageable pageable) {
       return planningRepository.findAll(pageable).map(planningMapper::planningToPlanningDto);
    }
}
