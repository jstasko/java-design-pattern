package org.example.builderPattern;

import org.example.builderPattern.old.*;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDtoBuilder userDtoBuilder = new UserWebDtoBuilder();
        UserDto userDto = directBuild(userDtoBuilder, user);

        org.example.builderPattern.common.UserDto second = commonBuild(user);

        System.out.println(second);
        System.out.println(userDto);
    }

    private static org.example.builderPattern.common.UserDto commonBuild(User user) {
        return org.example.builderPattern.common.UserDto
                .builder()
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthDate())
                .build();
    }

    private static UserDto directBuild(UserDtoBuilder userDtoBuilder, User user) {
        return userDtoBuilder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthDate())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthDate(LocalDate.of(1960, 5, 6));
        user.setFirstName("John");
        user.setLastName("Doe");
        Address address = new Address();
        address.setCity("San Francisco");
        address.setState("CA");
        address.setHouseNumber("100");
        address.setZip("23131");
        address.setStreet("Main Street");
        user.setAddress(address);
        return user;
    }
}
