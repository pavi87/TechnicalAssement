// CropReportController.java
package com.farmcollector.api;

import com.farmcollector.application.PlantService;
import com.farmcollector.domain.PlantedData;
import com.farmcollector.dto.CropReportDTO;
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
@RequestMapping("/api/report/crop")
public class CropReportController {

    private final PlantService plantService;

    @Autowired
    public CropReportController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping("/{cropName}/season/{season}")
    public ResponseEntity<List<CropReportDTO>> getCropReport(@PathVariable String cropName, @PathVariable String season) {
        List<CropReportDTO> cropReport = plantService.getCropReport(cropName, season);
        return ResponseEntity.status(HttpStatus.OK).body(cropReport);
    }
}
