package com.learning.model;

import java.util.List;

public class Profile {
    private String id;
    private Name name;
    private String address;
    private List<JobType> jobTypes;
    private Sex sex = Sex.MALE;
    private boolean isMad = false;

    public List<JobType> getJobTypes() {
        return jobTypes;
    }

    public void setJobTypes(List<JobType> jobTypes) {
        this.jobTypes = jobTypes;
    }

    public boolean getIsMad() {
        return isMad;
    }

    public void setIsMad(boolean mad) {
        isMad = mad;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class Name {
        private String firstName;
        private String lastName;

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    }

    public enum JobType {
        SOFTWARE_DEVELOPER("software developer"),
        DELIVERY_GUY("delivery guy"),
        GOVERNMENT_EMPLOYEE("government employee"),
        DOCTOR("doctor");

        public static final JobType[] ALL = { SOFTWARE_DEVELOPER, DELIVERY_GUY, GOVERNMENT_EMPLOYEE, DOCTOR };

        private final String type;

        JobType(String type) {
            this.type = type;
        }
    }

    public enum Sex {
        MALE("male"),
        FEMALE("female");

        public static final Sex[] ALL = {MALE, FEMALE};

        private final String sex;

        Sex(String sex) {
            this.sex = sex;
        }

//        @Override
//        public String toString() {
//            return this.sex;
//        }
    }
}
