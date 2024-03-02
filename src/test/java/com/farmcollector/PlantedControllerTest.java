package com.farmcollector;
import com.farmcollector.api.PlantedController;
import com.farmcollector.application.PlantService;
import com.farmcollector.domain.PlantedData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PlantedControllerTest {

    @Mock
    private PlantService plantService;

    @InjectMocks
    private PlantedController plantedController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddPlantedData() {
        // Given
        PlantedData plantedData = new PlantedData();
        plantedData.setFarmName("myFarm");
        plantedData.setCropType("corn");
        plantedData.setExpectedProduct(1000);
        ResponseEntity<String> expectedResponse = ResponseEntity.status(HttpStatus.CREATED).body("Planted data saved successfully");

        // When
       // when(plantService.savePlantedData(plantedData)).thenReturn(null);
        ResponseEntity<String> actualResponse = plantedController.savePlantedData(plantedData);

        // Then
        assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
        assertEquals(expectedResponse.getBody(), actualResponse.getBody());
        verify(plantService).savePlantedData(plantedData);
    }
}

