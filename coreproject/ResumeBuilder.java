package coreproject;

import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Personal Details:");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter About Me: ");
        String about = scanner.nextLine();

        Resume resume = new Resume(new PersonalInfo(name, email, phone, about));

        while (true) {
            System.out.println("\n1. Add Education");
            System.out.println("2. Add Experience");
            System.out.println("3. Add Certification");
            System.out.println("4. Add Skill");
            System.out.println("5. Add Language");
            System.out.println("6. Delete Education");
            System.out.println("7. Delete Experience");
            System.out.println("8. Delete Certification");
            System.out.println("9. Delete Skill");
            System.out.println("10. Delete Language");
            System.out.println("11. Update Education");
            System.out.println("12. Update Experience");
            System.out.println("13. Display Resume");
            System.out.println("14. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Degree: ");
                    String degree = scanner.nextLine();
                    System.out.print("Enter Institution: ");
                    String institution = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    resume.addEducation(new Education(degree, institution, year));
                    break;

                case 2:
                    System.out.print("Enter Job Title: ");
                    String jobTitle = scanner.nextLine();
                    System.out.print("Enter Company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter Years Worked: ");
                    int yearsWorked = scanner.nextInt();
                    scanner.nextLine();
                    resume.addExperience(new Experience(jobTitle, company, yearsWorked));
                    break;

                case 3:
                    System.out.print("Enter Certification Name: ");
                    String certName = scanner.nextLine();
                    System.out.print("Enter Certified Year: ");
                    int certYear = scanner.nextInt();
                    scanner.nextLine();
                    resume.addCertification(new Certification(certName, certYear));
                    break;

                case 4:
                    System.out.print("Enter Skill: ");
                    String skill = scanner.nextLine();
                    resume.addSkill(skill);
                    break;

                case 5:
                    System.out.print("Enter Language: ");
                    String language = scanner.nextLine();
                    System.out.print("Enter Proficiency: ");
                    String proficiency = scanner.nextLine();
                    resume.addLanguage(language, proficiency);
                    break;

                case 6:
                    System.out.print("Enter Education Index to Delete: ");
                    int eduIndex = scanner.nextInt();
                    scanner.nextLine();
                    resume.deleteEducation(eduIndex - 1);
                    break;

                case 7:
                    System.out.print("Enter Experience Index to Delete: ");
                    int expIndex = scanner.nextInt();
                    scanner.nextLine();
                    resume.deleteExperience(expIndex - 1);
                    break;

                case 8:
                    System.out.print("Enter Certification Index to Delete: ");
                    int certIndex = scanner.nextInt();
                    scanner.nextLine();
                    resume.deleteCertification(certIndex - 1);
                    break;

                case 9:
                    System.out.print("Enter Skill Index to Delete: ");
                    int skillIndex = scanner.nextInt();
                    scanner.nextLine();
                    resume.deleteSkill(skillIndex - 1);
                    break;

                case 10:
                    System.out.print("Enter Language Index to Delete: ");
                    int langIndex = scanner.nextInt();
                    scanner.nextLine();
                    resume.deleteLanguage(langIndex - 1);
                    break;

                case 11:
                    System.out.print("Enter Education Index to Update: ");
                    int updateEduIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Degree: ");
                    String newDegree = scanner.nextLine();
                    System.out.print("Enter New Institution: ");
                    String newInstitution = scanner.nextLine();
                    System.out.print("Enter New Year: ");
                    int newYear = scanner.nextInt();
                    scanner.nextLine();
                    resume.updateEducation(updateEduIndex - 1, new Education(newDegree, newInstitution, newYear));
                    break;

                case 12:
                    System.out.print("Enter Experience Index to Update: ");
                    int updateExpIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Job Title: ");
                    String newJobTitle = scanner.nextLine();
                    System.out.print("Enter New Company: ");
                    String newCompany = scanner.nextLine();
                    System.out.print("Enter New Years Worked: ");
                    int newYearsWorked = scanner.nextInt();
                    scanner.nextLine();
                    resume.updateExperience(updateExpIndex - 1, new Experience(newJobTitle, newCompany, newYearsWorked));
                    break;

                case 13:
                    resume.displayResume();
                    break;

                case 14:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}