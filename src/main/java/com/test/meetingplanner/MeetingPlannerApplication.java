package com.test.meetingplanner;

import com.test.meetingplanner.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class MeetingPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingPlannerApplication.class, args);

		List<SalleReunion> salleReunionSet = new ArrayList<>();
		SalleReunion salleReunion = new SalleReunion();
		SalleReunion salleReunion1 = new SalleReunion();
		SalleReunion salleReunion2 = new SalleReunion();
		SalleReunion salleReunion3 = new SalleReunion();
        Reservation reservation = new Reservation();
        Reservation reservation1 = new Reservation();
        Reservation reservation2 = new Reservation();
        TypeReunion typeReunion = new TypeReunion();
        TypeReunion typeReunion1 = new TypeReunion();
        TypeMateriel typeMateriel = new TypeMateriel();
        TypeMateriel typeMateriel1 = new TypeMateriel();
        Materiel materiel = new Materiel();
        Materiel materiel1 = new Materiel();

        typeMateriel.setId(1);
        typeMateriel.setNom("Table");
        typeMateriel1.setId(2);
        typeMateriel1.setNom("Ecran");
        materiel.setId(1);
        materiel.setMobile(true);
        materiel.setTypeMateriel(typeMateriel);
        materiel1.setId(2);
        materiel1.setMobile(false);
        materiel.setTypeMateriel(typeMateriel1);
        typeReunion.setId(1);
        typeReunion.setNom("AC");
        typeReunion1.setId(2);
        typeReunion1.setNom("AL");
        reservation.setDebut(8);
        reservation.setFin(9);
        reservation.setMateriel(materiel);
        reservation.setNombrePersonne(10);
        reservation.setTypeReunion(typeReunion);
        reservation1.setDebut(10);
        reservation1.setFin(12);
        reservation1.setNombrePersonne(5);
        reservation1.setTypeReunion(typeReunion1);
        Set<Reservation>  reservations = new HashSet<>();
        reservations.add(reservation);
        reservations.add(reservation1);
        salleReunion.setId(1);
        salleReunion.setCapacite(10);
        salleReunion.setReservationSet(reservations);
        salleReunion.setNom("Salle1");
        salleReunion.setId(2);
        salleReunion.setCapacite(15);
        salleReunion.setReservationSet(reservations);
        salleReunion.setNom("Salle2");
        salleReunionSet.add(salleReunion);
        salleReunionSet.add(salleReunion1);
	}

}
