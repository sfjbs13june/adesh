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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {

    @InjectMocks
    PrescriptionController prescriptionController;
    @Mock
    PrescriptionRepository prescriptionRepository;

    @Mock
    Prescription prescription;
    @BeforeEach
    void setUp(){
        prescriptionRepository= Mockito.mock(PrescriptionRepository.class);
        prescription= Mockito.mock(Prescription.class);
    }

    @Test
    public void TestGetAllPrescriptions() {
        List<Prescription> viewprescription = new ArrayList();
        Prescription prescription1 = new Prescription("p04","a03","Medicine para","pat01", "doc02");
        viewprescription.add(prescription1);
        when(prescriptionRepository.findByPatientName(anyString())).thenReturn(viewprescription);

        List<Prescription> result = prescriptionController.getAllPrescriptions("pat01");
        assertEquals(viewprescription.size(),1);
        assertEquals(viewprescription.get(0).getPrescriptionId(),result.get(0).getPrescriptionId());
        assertEquals(viewprescription.get(0).getAppontmentId(),result.get(0).getAppontmentId());
        assertEquals(viewprescription.get(0).getDescription(),result.get(0).getDescription());
        assertEquals(viewprescription.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(viewprescription.get(0).getDoctorName(),result.get(0).getDoctorName());
    }

 @Test
    public void TestSavePrescription(){
        Prescription saveprescription = new Prescription();
        saveprescription.setAppontmentId("a03");
        saveprescription.setPrescriptionId("p04");
        saveprescription.setDoctorName("doc04");
        saveprescription.setDescription("Medicine para");
        saveprescription.setPatientName("pat02");
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(saveprescription);
        Prescription result = prescriptionController.savePrescription(prescription);
        assertEquals(saveprescription.getPrescriptionId(),result.getPrescriptionId());
        assertEquals(saveprescription.getAppontmentId(),result.getAppontmentId());
        assertEquals(saveprescription.getDoctorName(),result.getDoctorName());
        assertEquals(saveprescription.getDescription(),result.getDescription());
        assertEquals(saveprescription.getPatientName(),result.getPatientName());
 }
}
