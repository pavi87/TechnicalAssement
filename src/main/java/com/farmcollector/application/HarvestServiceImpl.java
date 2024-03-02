package com.farmcollector.application;

import com.farmcollector.domain.HarvestedData;
import com.farmcollector.repository.HarvestingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HarvestServiceImpl implements HarvestService{

    private final HarvestingRepository harvestingRepository;

    @Autowired
    public HarvestServiceImpl(HarvestingRepository harvestingRepository) {
        this.harvestingRepository = harvestingRepository;
    }
    @Override
    public void saveHarvestedData(HarvestedData plantedData) {

    }
}
