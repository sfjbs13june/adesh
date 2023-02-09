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

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PatientControllerTest {

    @InjectMocks
    PatientController patientController;
    @Mock
    AppointmentRepository appointmentRepository;

    @Mock
    Appointment appointment;
    @BeforeEach
    void setUp(){

        appointmentRepository= Mockito.mock(AppointmentRepository.class);
        appointment= Mockito.mock(Appointment.class);
    }

    @Test
    public void TestGetAppointments() {
        List<Appointment> getMyAppointment = new ArrayList();
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(getMyAppointment);
        List<Appointment> result = patientController.getMyAppointments("pat01");
        assertEquals(getMyAppointment, result);
    }
    @Test
    public void TestSaveAppointment() {
        Appointment savePatientAppointment= new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(savePatientAppointment);
        Appointment result = patientController.saveAppointment(appointment);
        assertEquals(savePatientAppointment, result);
    }
}
