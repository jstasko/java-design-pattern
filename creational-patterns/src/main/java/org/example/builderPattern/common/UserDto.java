package org.example.builderPattern.common;


import org.example.builderPattern.old.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDto {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public static UserDtoBuilder builder() {
        return new UserDtoBuilder();
    }

    
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    
    public static class UserDtoBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDto userDto;

        
        public UserDtoBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        
        public UserDtoBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        
        public UserDtoBuilder withBirthday(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }

        
        public UserDtoBuilder withAddress(Address address) {
            this.address = address.toString();
            return this;
        }

        
        public UserDto build() {
            this.userDto = new UserDto();
            userDto.setAge(age);
            userDto.setAddress(address);
            userDto.setName(firstName + " " + lastName);
            return userDto;
        }

        
        public UserDto getUserDto() {
            return this.userDto;
        }
    }
}
