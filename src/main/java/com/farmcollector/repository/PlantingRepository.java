// PlantingRepository.java
package com.farmcollector.repository;

import com.farmcollector.domain.PlantedData;
import com.farmcollector.dto.CropReportDTO;
import com.farmcollector.dto.FarmReportDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantingRepository extends CrudRepository<PlantedData, Long> {

    @Query(value = "SELECT p.farm_name, p.season, SUM(p.expected_product) AS expected_product, COALESCE(SUM(h.actual_product), 0) AS actual_product FROM planted_data p LEFT JOIN harvested_data h ON p.farm_name = h.farm_name AND p.season = h.season AND p.crop_type = h.crop_type GROUP BY p.farm_name, p.season;")
    List<FarmReportDTO> findByFarmNameAndSeason(String farmName, String season);

    @Query(value="SELECT p.crop_type, p.season, SUM(p.expected_product) AS expected_product, COALESCE(SUM(h.actual_product), 0) AS actual_product FROM planted_data p LEFT JOIN harvested_data h ON p.crop_type = h.crop_type AND p.season = h.season GROUP BY p.crop_type, p.season;")
    List<CropReportDTO> findByCropTypeAndSeason(String cropName, String season);

}
