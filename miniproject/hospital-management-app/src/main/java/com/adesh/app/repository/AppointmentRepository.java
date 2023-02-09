package com.adesh.app.repository;

import com.adesh.app.model.Appointment;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class AppointmentRepository implements MongoRepository<Appointment, String> {
//        public List<Appointment> findByDoctorName(String doctorName)
//        public Appointment save(Appointment appointment)
//        public List<Appointment> findByPatientName(String patientName)

    @Override
    public <S extends Appointment> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Appointment> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Appointment> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Appointment> findAll() {
        return null;
    }

    @Override
    public Iterable<Appointment> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }


    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Appointment entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Appointment> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Appointment> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Appointment> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Appointment> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Appointment> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Appointment> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Appointment> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Appointment> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Appointment> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Appointment> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Appointment> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Appointment, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    public List<Appointment> findByPatientName(String patientName) {
        return null;
    }

    public List<Appointment> findByDoctorName(String doctorName) {
        return null;
    }
}
