package com.arkisoftware.tutors.command.application.dtos.response;

import lombok.Value;

@Value
public class RegisterTutorResponse {
    String tutorId;
    String firstName;
    String lastName;
    String dni;
}