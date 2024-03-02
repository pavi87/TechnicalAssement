package com.farmcollector.repository;

import com.farmcollector.domain.HarvestedData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarvestingRepository  extends CrudRepository<HarvestedData, Long> {
}
