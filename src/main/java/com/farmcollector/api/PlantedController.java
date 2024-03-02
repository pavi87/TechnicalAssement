// PlantedController.java
package com.farmcollector.api;

import com.farmcollector.application.PlantService;
import com.farmcollector.domain.PlantedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlantedController {

    private final PlantService plantService;

    @Autowired
    public PlantedController(PlantService plantService) {
        this.plantService = plantService;
    }

    @PostMapping("/planted")
    public ResponseEntity<String> savePlantedData(@RequestBody PlantedData planting) {
        plantService.savePlantedData(planting);
        return ResponseEntity.status(HttpStatus.CREATED).body("Planted data saved successfully");
    }
}
