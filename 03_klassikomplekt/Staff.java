package com.company;

public abstract class Staff {
    Person person;
    Boolean viewProfile;
    Double bonus = 0.0;
    Double salary;
    Double vacation;


    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Boolean getViewProfile() {
        return viewProfile;
    }

    public void setViewProfile(Boolean viewProfile) {
        this.viewProfile = viewProfile;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public Double getVacation() {
        return vacation;
    }

    public void setVacation(Double vacation) {
        this.vacation = vacation;
    }
}
