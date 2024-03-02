package com.farmcollector.application;

import com.farmcollector.domain.HarvestedData;
import com.farmcollector.domain.PlantedData;

public interface HarvestService {

    void saveHarvestedData(HarvestedData plantedData);
}
