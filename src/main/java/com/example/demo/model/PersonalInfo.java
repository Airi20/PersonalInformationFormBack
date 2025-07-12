package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PersonalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String furigana;
    private String birth;
    private String gender;
    private String email;
    private String tel;
    private String address;
    private String job;
    private String education;
    private String qualification;
    private String hobby;
    private String skill;
    private String sns;
    private String website;
    private String contactMethod;
    private String contactTime;
    private String emergencyContact;
    private String health;
    private String allergy;
    private String emergencyAction;
    private String family;
    private String familyHealth;
    private String familyAllergy;
    private String familyEmergencyContact;
    private String hobbySkill;
    private String selfIntro;
    private String selfPR;
    private String desireJobType;
    private String internshipExperience;
    private String programmingExperience;
    private String programmingLanguageUsed;
    private String yearsOfExperience;
    private String programmingLanguageUsed2;
    private String yearsOfExperience2;
    private String frameworks;
    private String github;
    private String others;
    private boolean confirmEmail;
}
