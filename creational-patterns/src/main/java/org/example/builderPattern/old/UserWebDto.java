package org.example.builderPattern.old;

// product in builder pattern
public class UserWebDto implements UserDto {
    private final String name;
    private final String address;
    private final String age;

    public UserWebDto(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
