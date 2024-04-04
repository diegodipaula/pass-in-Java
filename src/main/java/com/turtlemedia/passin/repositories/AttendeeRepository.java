package com.turtlemedia.passin.repositories;

import com.turtlemedia.passin.domain.attendee.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
    public List<Attendee> findByEventId(String eventId);

    Optional<Attendee> findByEventIdAndEmail(String eventId, String email);
}
