package com.sree.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInput {

    String name;
    String email;
    String phoneNumber;
    AddressInput addressInput;
}