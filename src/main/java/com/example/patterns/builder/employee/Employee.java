package com.example.patterns.builder.employee;

public class Employee {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zip;

    private Employee(EmployeeBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.phone = builder.getPhone();
        this.email = builder.getEmail();
        this.address = builder.getAddress();
        this.city = builder.getCity();
        this.state = builder.getState();
        this.zip = builder.getZip();
    }
    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static class EmployeeBuilder {

        private String firstName;
        private String lastName;
        private String phone;
        private String email;
        private String address;
        private String city;
        private String state;
        private String zip;

        public String getFirstName() {
            return firstName;
        }

        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getCity() {
            return city;
        }

        public EmployeeBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public String getState() {
            return state;
        }

        public EmployeeBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public String getZip() {
            return zip;
        }

        public EmployeeBuilder setZip(String zip) {
            this.zip = zip;
            return this;
        }

        public Employee build(){

            // put all the checks that you want to take place
            return new Employee(this);
        }
    }

}
