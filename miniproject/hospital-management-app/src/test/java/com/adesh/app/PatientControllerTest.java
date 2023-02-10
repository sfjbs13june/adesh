package com.adesh.app;

import com.adesh.app.controller.PatientController;
import com.adesh.app.model.Appointment;
import com.adesh.app.model.Prescription;
import com.adesh.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.boot.autoconfigure.AutoConfigurationPackages.get;


@RunWith(MockitoJUnitRunner.class)
public class PatientControllerTest {
    @InjectMocks
    private PatientController patientController;
    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentRepository;
    @BeforeEach
    void setUp(){
        appointment= Mockito.mock(Appointment.class);
        appointmentRepository=Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void TestGetAppointments(){
        List<Appointment> getAppointment =new ArrayList();
        Prescription prescription1 = new Prescription("p04","a02", "Medicine paracetamol", "pat01", "02");
        getAppointment.add(appointment);
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(getAppointment);
        List<Appointment> result = patientController.getMyAppointments("pat01");
        assertEquals(getAppointment.size(),1);
        assertEquals(getAppointment.size(),1);
        assertEquals(getAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(getAppointment.get(0).getPrescription(),result.get(0).getPrescription());
        assertEquals(getAppointment.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(getAppointment.get(0).getDate(),result.get(0).getDate());
        assertEquals(getAppointment.get(0).getPatientName(),result.get(0).getPatientName());

    }

    @Test
    public void TestSaveAppointment(){
        Appointment saveAppointment=new Appointment();
        saveAppointment.setAppointmentId("a03");
        saveAppointment.setDate("10th Feb");
        saveAppointment.setDoctorName("doc02");
        saveAppointment.setPatientName("pat03");
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(saveAppointment);
        Appointment result=patientController.saveAppointment(appointment);
        assertEquals(saveAppointment.getAppointmentId(),result.getAppointmentId());
        assertEquals(saveAppointment.getDate(),result.getDate());
        assertEquals(saveAppointment.getDoctorName(),result.getDoctorName());
        assertEquals(saveAppointment.getPatientName(),result.getPatientName());
    }

}
