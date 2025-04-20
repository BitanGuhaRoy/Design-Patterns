package com.example.patterns.builder.student;

public class Student {
    private int age;
    private String name;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private String school;
    private String major;
    private String grade;
    private int gradYear;

    private Student(StudentBuilder studentBuilder) {
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
        this.gender = studentBuilder.getGender();
        this.address = studentBuilder.getAddress();
        this.phone = studentBuilder.getPhone();
        this.email = studentBuilder.getEmail();
        this.school = studentBuilder.getSchool();
        this.major = studentBuilder.getMajor();
        this.grade = studentBuilder.getGrade();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    static public class StudentBuilder {
        private int age;
        private String name;
        private String gender;
        private String address;
        private String phone;
        private String email;
        private String school;
        private String major;
        private String grade;
        private int gradYear;

        public StudentBuilder() {
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getSchool() {
            return school;
        }

        public StudentBuilder setSchool(String school) {
            this.school = school;
            return this;
        }

        public String getMajor() {
            return major;
        }

        public StudentBuilder setMajor(String major) {
            this.major = major;
            return this;
        }

        public String getGrade() {
            return grade;
        }

        public StudentBuilder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build() {
            // validation logic
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", gradYear=" + gradYear +
                '}';
    }
}
