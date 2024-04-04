package com.turtlemedia.passin.repositories;


import com.turtlemedia.passin.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}
