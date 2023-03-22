package com.manas.dto.request;

import java.time.LocalDate;

public record BookRequest (
        String name,
        String author,
        int price,
        LocalDate createdAt
) { }
