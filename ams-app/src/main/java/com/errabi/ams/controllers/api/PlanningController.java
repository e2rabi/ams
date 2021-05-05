package com.errabi.ams.controllers.api;

import com.errabi.ams.controllers.dto.PlanningDto;
import com.errabi.ams.services.IPlanningService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class PlanningController {

    IPlanningService planningService ;

    @PostMapping("/plannings")
    public ResponseEntity<PlanningDto> createPlanning(@RequestBody @Valid PlanningDto planningDto){
        log.debug("Creating planning ... {}",planningDto);
        return new ResponseEntity<>(planningService.save(planningDto), HttpStatus.CREATED);
    }

    @PutMapping("/plannings")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePlanning(@RequestBody @Valid PlanningDto planningDto){
        log.debug("Updating planning ... {}",planningDto);
        planningService.update(planningDto);
    }

    @PutMapping("/plannings/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlanning(@PathVariable(name = "id") UUID id ){
        log.debug("deleting planning with id... {}",id);
        planningService.delete(id);
    }

    @PutMapping("/plannings/{id}/{enabled}")
    @ResponseStatus(HttpStatus.OK)
    public void publishPlanning(@PathVariable(name = "id") UUID id ,@PathVariable(name = "enabled") Boolean enabled ){
        log.debug("Publishing planning with id... {}",id);
        planningService.publishPlanning(id,enabled);
    }

    @GetMapping("/plannings")
    public ResponseEntity<Page<PlanningDto>> getAllPlannings(@NotNull final Pageable pageable){
        log.debug("get page of planning ... {}",pageable);
       return new ResponseEntity<>(planningService.getAllPlanning(pageable),HttpStatus.OK);
    }
}
