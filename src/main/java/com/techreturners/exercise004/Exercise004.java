package com.techreturners.exercise004;

import java.time.*;

public class Exercise004 {

    private LocalDateTime localDateTime;
    private final long GIGASECONDS = 1000000000;

    public Exercise004(LocalDate date) {
        this.localDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return localDateTime.plusSeconds(GIGASECONDS);
    }



}
