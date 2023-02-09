package com.adesh.app;

import com.adesh.app.controller.PatientController;
import com.adesh.app.model.Appointment;
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
        List getAppointment=new ArrayList();
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(getAppointment);
        List result=patientController.getMyAppointments("xyz");
        assertEquals(getAppointment,result);
    }

    @Test
    public void TestSaveAppointment(){
        Appointment saveAppointment=new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(saveAppointment);
        Appointment result=patientController.saveAppointment(appointment);
        assertEquals(saveAppointment,result);
    }

}
