// FarmReportController.java
package com.farmcollector.api;

import com.farmcollector.application.PlantService;
import com.farmcollector.domain.PlantedData;
import com.farmcollector.dto.FarmReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report/farm")
public class FarmReportController {

    private final PlantService plantingService;

    @Autowired
    public FarmReportController(PlantService plantingService) {
        this.plantingService = plantingService;
    }

    @GetMapping("/{farmName}/season/{season}")
    public ResponseEntity<List<FarmReportDTO>> getFarmReport(@PathVariable String farmName, @PathVariable String season) {
        List<FarmReportDTO> farmReport = plantingService.getFarmReport(farmName, season);
        return ResponseEntity.status(HttpStatus.OK).body(farmReport);
    }
}
