package com.farmcollector.api;

import com.farmcollector.application.HarvestService;
import com.farmcollector.domain.HarvestedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HarvestedController {

    private final HarvestService harvestService;

    @Autowired
    public HarvestedController(HarvestService harvestService) {
        this.harvestService = harvestService;
    }

    @PostMapping("/harvested")
    public ResponseEntity<String> savePlantedData(@RequestBody HarvestedData harvestedData) {
        harvestService.saveHarvestedData(harvestedData);
        return ResponseEntity.status(HttpStatus.CREATED).body("harvestedData data saved successfully");
    }
}
