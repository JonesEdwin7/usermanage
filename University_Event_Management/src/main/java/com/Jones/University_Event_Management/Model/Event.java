package com.Jones.University_Event_Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Event")
public class Event {
    @Id
    private Long eventId;

    private String eventName;

    private String locationOfEvent;

    private LocalDate eventDate;

    private Timestamp startTime;

    private Timestamp endTime;
}
