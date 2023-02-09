package com.adesh.app;

import com.adesh.app.controller.PrescriptionController;
import com.adesh.app.model.Prescription;
import com.adesh.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {
    @InjectMocks
    private PrescriptionController prescriptionController;
    @Mock
    Prescription prescription;
    @Mock
    PrescriptionRepository prescriptionRepository;
    @BeforeEach
    void setUp(){
        prescription= Mockito.mock(Prescription.class);
        prescriptionRepository=Mockito.mock(PrescriptionRepository.class);
    }

    @Test
    public void Test1(){
        List test=new ArrayList();
        when(prescriptionRepository.findByPatientName(anyString())).thenReturn(test);
        List result=prescriptionController.getAllPrescriptions("xyz");
        assertEquals(test,result);
    }

    @Test
    public void Test2(){
        Prescription p1=new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(p1);
        Prescription result=prescriptionController.savePrescription(prescription);
        assertEquals(p1,result);
    }
}