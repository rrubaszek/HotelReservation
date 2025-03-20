package com.hotel.repository;

import com.hotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.time.LocalDate;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findAvailable();

    @Query("SELECT r FROM Room r WHERE r.id NOT IN " +
            "(SELECT res.room.id FROM Reservation res " +
            "WHERE (res.checkInDate <= :checkOut AND res.checkOutDate >= :checkIn) " +
            "AND res.status != 'CANCELLED')")
    List<Room> findAvailableRooms(@Param("checkIn") LocalDate checkIn, @Param("checkOut") LocalDate checkOut);
}
