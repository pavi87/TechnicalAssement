package com.farmcollector;

import com.farmcollector.api.FarmReportController;
import com.farmcollector.application.PlantService;
import com.farmcollector.domain.PlantedData;
import com.farmcollector.dto.CropReportDTO;
import com.farmcollector.dto.FarmReportDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FarmReportControllerTest {

    @Mock
    private PlantService plantingService;

    @InjectMocks
    private FarmReportController farmReportController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetFarmReport() {
        // Given
        String farmName = "MyFarm";
        String season = "Summer";
        List<FarmReportDTO> farmReport = new ArrayList<>();
        // populate farmReport list with test data as needed

        // When
        when(plantingService.getFarmReport(farmName, season)).thenReturn(farmReport);
        ResponseEntity<List<FarmReportDTO>> responseEntity = farmReportController.getFarmReport(farmName, season);

        // Then
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(farmReport, responseEntity.getBody());
    }
}
