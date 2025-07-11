package org.design.creational.Builder;

public class Student {
    private final String name;
    private final int age;
    private final String address;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        public void validate() {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            if (age <= 0) {
                throw new IllegalArgumentException("Age must be greater than zero");
            }
            if (address == null || address.isEmpty()) {
                throw new IllegalArgumentException("Address cannot be null or empty");
            }
        }
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address='" + address + '\'' + '}';
    }
}
