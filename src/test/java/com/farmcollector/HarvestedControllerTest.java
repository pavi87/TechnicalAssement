package com.farmcollector;

import com.farmcollector.api.HarvestedController;
import com.farmcollector.application.HarvestService;
import com.farmcollector.domain.HarvestedData;
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

public class HarvestedControllerTest {

    @Mock
    private HarvestService harvestService;

    @InjectMocks
    private HarvestedController harvestedController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddHarvestedData() {
        // Given
        HarvestedData harvestedData = new HarvestedData();
        ResponseEntity<String> expectedResponse = ResponseEntity.status(HttpStatus.CREATED).body("Harvested data added successfully");

        // When
       // when(harvestService.saveHarvestedData(harvestedData)).thenReturn(null);
        ResponseEntity<String> actualResponse = harvestedController.savePlantedData(harvestedData);

        // Then
        assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
        assertEquals(expectedResponse.getBody(), actualResponse.getBody());
        verify(harvestService).saveHarvestedData(harvestedData);
    }
}

