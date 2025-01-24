package org.example.builderPattern.old;

import java.time.LocalDate;

// abstract builder
public interface UserDtoBuilder {
    // methods to build "parts" of product at a time
    UserDtoBuilder withFirstName(String firstName);
    UserDtoBuilder withLastName(String lastName);
    UserDtoBuilder withBirthday(LocalDate date);
    UserDtoBuilder withAddress(Address address);

    // method to assemble final product
    UserDto build();

    // (optional) method to fetch already built object

    UserDto getUserDto();

}
