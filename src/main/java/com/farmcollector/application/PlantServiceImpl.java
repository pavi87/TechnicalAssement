package com.farmcollector.application;

import com.farmcollector.domain.HarvestedData;
import com.farmcollector.domain.PlantedData;
import com.farmcollector.repository.PlantingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {


    private final PlantingRepository plantingRepository;

   @Autowired
    public PlantServiceImpl(PlantingRepository plantingRepository) {
        this.plantingRepository = plantingRepository;
    }

    @Override
    public void savePlantedData(PlantedData plantedData) {
            plantingRepository.save(plantedData);
    }

    @Override
    public void saveHarvestedData(HarvestedData plantedData) {

    }

    @Override
    public List<PlantedData> getFarmReport(String farmName, String season) {
        return plantingRepository.findByFarmNameAndSeason(farmName, season);
    }

    @Override
    public List<PlantedData> getCropReport(String cropName, String season) {
        return plantingRepository.findByCropTypeAndSeason(cropName, season);
    }
}
