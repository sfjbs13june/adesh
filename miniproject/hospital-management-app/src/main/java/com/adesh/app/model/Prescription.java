package com.adesh.app.model;

public class Prescription {
    String prescriptionId;
    String appontmentId;
    String description;
    String patientName;
    String doctorName;

    public Prescription(String prescriptionId, String appontmentId, String description, String patientName, String doctorName){
        this.prescriptionId = prescriptionId;
        this.appontmentId = appontmentId;
        this.description = description;
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public Prescription() {

    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getAppontmentId() {
        return appontmentId;
    }

    public void setAppontmentId(String appontmentId) {
        this.appontmentId = appontmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
