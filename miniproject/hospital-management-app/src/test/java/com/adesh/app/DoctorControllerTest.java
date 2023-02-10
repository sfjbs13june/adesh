package com.adesh.app;

import com.adesh.app.controller.DoctorController;
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

@RunWith(MockitoJUnitRunner.class)
public class DoctorControllerTest {
    @InjectMocks
    private DoctorController doctorController;
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
    public void TestGetAppointments() {
        List<Appointment> getAppointment = new ArrayList();
        Appointment appointment1 = new Appointment();
        Prescription prescription1 = new Prescription("p04","a02","Medicine B","pat01","02");
        appointment1.setAppointmentId("a02");
        appointment1.setDate("11-02-2023");
        appointment1.setPatientName("pat01");
        appointment1.setDoctorName("doc02");
        appointment1.setPrescription(prescription1);
        getAppointment.add(appointment1);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(getAppointment);
        List<Appointment> result = doctorController.getAppointments("doc01");
        assertEquals(getAppointment.size(), 1);
        assertEquals(getAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(getAppointment.get(0).getDate(),result.get(0).getDate());
        assertEquals(getAppointment.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(getAppointment.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(getAppointment.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());
    }

    @Test
    public void TestSaveAppointment() {
        Appointment saveAppointment=new Appointment();
        saveAppointment.setAppointmentId("a03");
        saveAppointment.setDate("10-2-2023");
        saveAppointment.setDoctorName("doc04");
        saveAppointment.setPatientName("pat04");
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(saveAppointment);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(saveAppointment.getAppointmentId(), result.getAppointmentId());
        assertEquals(saveAppointment.getDate(), result.getDate());
        assertEquals(saveAppointment.getDoctorName(),result.getDoctorName());
        assertEquals(saveAppointment.getPatientName(), result.getPatientName());
    }

}
