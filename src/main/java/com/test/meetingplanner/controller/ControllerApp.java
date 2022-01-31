package com.test.meetingplanner.controller;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.test.meetingplanner.model.Reservation;
import com.test.meetingplanner.model.SalleReunion;
import com.test.meetingplanner.service.MeetingService;
import com.test.meetingplanner.service.MeetingServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping
public class ControllerApp {

  private MeetingServiceImpl meetingService;

    public ControllerApp(MeetingServiceImpl meetingService) {
        this.meetingService = meetingService;
    }

    @PostMapping("/salle/search")
  public Set<SalleReunion> chercherSalle(@RequestBody Reservation reservation) {
    return meetingService.ChercherSalleReunion(reservation);
  }

  @PostMapping("/reservation/create")
  public Reservation createReservation(@RequestBody Reservation reservation, @RequestBody int salleId){
      return meetingService.addReservation(reservation,salleId);
  }

  @GetMapping("/salle/all")
  public List<SalleReunion> findAll(){
      return meetingService.findAllSalleReunion();
  }
}
