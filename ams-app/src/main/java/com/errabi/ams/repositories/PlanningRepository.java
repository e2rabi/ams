package com.errabi.ams.repositories;

import com.errabi.ams.entities.Planning;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlanningRepository extends PagingAndSortingRepository<Planning, UUID> {
}
