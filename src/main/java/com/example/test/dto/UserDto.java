package com.example.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

}
