package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// Não precisa anotar com @Repository porque o extends JpaRepository já faz isso por baixo
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByCarLicensePlate(String licensePlate);
    boolean existsBySpotNumber(String licensePlate);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
