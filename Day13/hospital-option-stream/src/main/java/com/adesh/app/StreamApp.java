package com.adesh.app;

import com.adesh.app.model.Doctor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {
    private static Doctor[] arrayOfDoc = {
            new Doctor(1, "Dr.Gill", 500000.0),
            new Doctor(2, "Dr.Sumit", 700000.0),
            new Doctor(3, "Dr.Sai", 900000.0)
    };

    public Stream<Doctor> getDocterArray() {
        return Stream.of(arrayOfDoc);
    }

    public Stream<Doctor> getDocterList() {
        List<Doctor> docList = Arrays.asList(arrayOfDoc);
        return docList.stream();
    }

    public Stream<Doctor> getDocterData() {
        return Stream.of(arrayOfDoc[0], arrayOfDoc[1], arrayOfDoc[2]);
    }

    public Stream<Doctor> getDocterStreamBulider() {
        Stream.Builder<Doctor> docStreamBuilder = Stream.builder();

        docStreamBuilder.accept(arrayOfDoc[0]);
        docStreamBuilder.accept(arrayOfDoc[1]);
        docStreamBuilder.accept(arrayOfDoc[2]);

        Stream<Doctor> docStream = docStreamBuilder.build();
        return docStream;
    }
}