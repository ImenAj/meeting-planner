package com.test.meetingplanner.service;

import com.test.meetingplanner.model.Reservation;
import com.test.meetingplanner.model.SalleReunion;

import java.util.List;
import java.util.Set;

public interface MeetingService {

    public Set<SalleReunion> ChercherSalleReunion(Reservation reservation);

    public Reservation addReservation(Reservation reservation,int salleId);

    public List<SalleReunion> findAllSalleReunion();
}
