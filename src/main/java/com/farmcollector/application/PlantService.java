package com.farmcollector.application;

import com.farmcollector.domain.HarvestedData;
import com.farmcollector.domain.PlantedData;
import com.farmcollector.dto.CropReportDTO;
import com.farmcollector.dto.FarmReportDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlantService {

    void savePlantedData(PlantedData plantedData);

    void saveHarvestedData(HarvestedData plantedData);

    @Query(value = "select * from orders o left join order_substate os on o.id = os.order_id "
            + "where o.primary_state = 'PLACED' " + "and os.type = 'APPROVAL' and os.state = 'PENDING' and o.id in ?1",
            nativeQuery = true)
    List<FarmReportDTO> getFarmReport(String farmName, String season);

    @Query(value = "select * from orders o left join order_substate os on o.id = os.order_id "
            + "where o.primary_state = 'PLACED' " + "and os.type = 'APPROVAL' and os.state = 'PENDING' and o.id in ?1",
            nativeQuery = true)
    List<CropReportDTO> getCropReport(String cropName, String season);

}
