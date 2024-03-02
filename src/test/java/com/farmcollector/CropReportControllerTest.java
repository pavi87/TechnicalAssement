package com.farmcollector;

import com.farmcollector.api.CropReportController;
import com.farmcollector.application.PlantService;
import com.farmcollector.domain.PlantedData;
import com.farmcollector.dto.CropReportDTO;
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

public class CropReportControllerTest {

    @Mock
    private PlantService plantingService;

    @InjectMocks
    private CropReportController cropReportController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetCropReport() {

        // Given
        String cropName = "Corn";
        String season = "Summer";
        List<CropReportDTO> cropReport = new ArrayList<>();
        // populate cropReport list with test data as needed

        // When
        when(plantingService.getCropReport(cropName, season)).thenReturn(cropReport);
        ResponseEntity<List<CropReportDTO>> responseEntity = cropReportController.getCropReport(cropName, season);

        // Then
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(cropReport, responseEntity.getBody());
    }
}

