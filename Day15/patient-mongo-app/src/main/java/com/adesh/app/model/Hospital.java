package com.adesh.app.model;

public class Hospital {

    String name;
    String doctorname;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Hospital(String name, String doctorname, String address) {
        this.name = name;
        this.doctorname = doctorname;
        this.address = address;
    }
}
