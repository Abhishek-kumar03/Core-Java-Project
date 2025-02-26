package coreproject;

import java.util.ArrayList;

public class Resume {
    PersonalInfo personalInfo;
    ArrayList<Education> educationList = new ArrayList<>();
    ArrayList<Experience> experienceList = new ArrayList<>();
    ArrayList<String> skills = new ArrayList<>();
    ArrayList<Language> languages = new ArrayList<>();
    ArrayList<Certification> certifications = new ArrayList<>();

    public Resume(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public void addEducation(Education edu) {
        educationList.add(edu);
    }

    public void updateEducation(int index, Education newEdu) {
        if (index >= 0 && index < educationList.size()) {
            educationList.set(index, newEdu);
            System.out.println("Education updated successfully.");
        } else {
            System.out.println("Invalid education entry.");
        }
    }

    public void deleteEducation(int index) {
        if (index >= 0 && index < educationList.size()) {
            educationList.remove(index);
            System.out.println("Education deleted successfully.");
        } else {
            System.out.println("Invalid education entry.");
        }
    }

    public void addExperience(Experience exp) {
        experienceList.add(exp);
    }

    public void updateExperience(int index, Experience newExp) {
        if (index >= 0 && index < experienceList.size()) {
            experienceList.set(index, newExp);
            System.out.println("Experience updated successfully.");
        } else {
            System.out.println("Invalid experience entry.");
        }
    }

    public void deleteExperience(int index) {
        if (index >= 0 && index < experienceList.size()) {
            experienceList.remove(index);
            System.out.println("Experience deleted successfully.");
        } else {
            System.out.println("Invalid experience entry.");
        }
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void deleteSkill(int index) {
        if (index >= 0 && index < skills.size()) {
            skills.remove(index);
            System.out.println("Skill deleted successfully.");
        } else {
            System.out.println("Invalid skill entry.");
        }
    }

    public void addLanguage(String name, String proficiency) {
        languages.add(new Language(name, proficiency));
    }

    public void deleteLanguage(int index) {
        if (index >= 0 && index < languages.size()) {
            languages.remove(index);
            System.out.println("Language deleted successfully.");
        } else {
            System.out.println("Invalid language entry.");
        }
    }

    public void addCertification(Certification cert) {
        certifications.add(cert);
    }

    public void deleteCertification(int index) {
        if (index >= 0 && index < certifications.size()) {
            certifications.remove(index);
            System.out.println("Certification deleted successfully.");
        } else {
            System.out.println("Invalid certification entry.");
        }
    }

    public void displayResume() {
        System.out.println("\n===== RESUME =====");
        System.out.println("Name: " + personalInfo.name);
        System.out.println("Email: " + personalInfo.email);
        System.out.println("Phone: " + personalInfo.phone);
        System.out.println("About Me: " + personalInfo.about);

        System.out.println("\nEducation:");
        int count = 1;
        for (Education edu : educationList) {
            System.out.println(count++ + ". " + edu.degree + " from " + edu.institution + " (Year: " + edu.year + ")");
        }

        System.out.println("\nExperience:");
        count = 1;
        for (Experience exp : experienceList) {
            System.out.println(count++ + ". " + exp.jobTitle + " at " + exp.company + " (" + exp.yearsWorked + " years)");
        }

        System.out.println("\nSkills:");
        count = 1;
        for (String skill : skills) {
            System.out.println(count++ + ". " + skill);
        }

        System.out.println("\nLanguages:");
        count = 1;
        for (Language lang : languages) {
            System.out.println(count++ + ". " + lang.name + " (" + lang.proficiency + ")");
        }

        System.out.println("\nCertifications:");
        count = 1;
        for (Certification cert : certifications) {
            System.out.println(count++ + ". " + cert.name + " (Certified Year: " + cert.certifiedYear + ")");
        }
    }
}