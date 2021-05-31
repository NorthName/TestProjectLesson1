public class WorkerOfCompany {
    private String nameWorkerOfCompany;
    private String surnameWorkerOfCompany;
    private String positionWorkerOfCompany;
    private String educationWorkerOfCompany;
    private String certificatesWorkerOfCompany;
    private String salaryWorkerOfCompany;
    private String workingDaysWorkerOfCompany;
    private int workHoursWorkerOfCompany;
    private int workExperienceWorkerOfCompany;
    private int ageWorkerOfCompany;

    public WorkerOfCompany(String nameWorkerOfCompany, String surnameWorkerOfCompany, String positionWorkerOfCompany, String educationWorkerOfCompany, String certificatesWorkerOfCompany, String salaryWorkerOfCompany, String workingDaysWorkerOfCompany, int workHoursWorkerOfCompany, int workExperienceWorkerOfCompany, int ageWorkerOfCompany) {
        this.nameWorkerOfCompany = nameWorkerOfCompany;
        this.surnameWorkerOfCompany = surnameWorkerOfCompany;
        this.positionWorkerOfCompany = positionWorkerOfCompany;
        this.educationWorkerOfCompany = educationWorkerOfCompany;
        this.certificatesWorkerOfCompany = certificatesWorkerOfCompany;
        this.salaryWorkerOfCompany = salaryWorkerOfCompany;
        this.workingDaysWorkerOfCompany = workingDaysWorkerOfCompany;
        this.workHoursWorkerOfCompany = workHoursWorkerOfCompany;
        this.workExperienceWorkerOfCompany = workExperienceWorkerOfCompany;
        this.ageWorkerOfCompany = ageWorkerOfCompany;
    }

    public String getNameWorkerOfCompany() {
        return nameWorkerOfCompany;
    }

    public void setNameWorkerOfCompany(String nameWorkerOfCompany) {
        this.nameWorkerOfCompany = nameWorkerOfCompany;
    }

    public String getSurnameWorkerOfCompany() {
        return surnameWorkerOfCompany;
    }

    public void setSurnameWorkerOfCompany(String surnameWorkerOfCompany) {
        this.surnameWorkerOfCompany = surnameWorkerOfCompany;
    }

    public String getPositionWorkerOfCompany() {
        return positionWorkerOfCompany;
    }

    public void setPositionWorkerOfCompany(String positionWorkerOfCompany) {
        this.positionWorkerOfCompany = positionWorkerOfCompany;
    }

    public String getEducationWorkerOfCompany() {
        return educationWorkerOfCompany;
    }

    public void setEducationWorkerOfCompany(String educationWorkerOfCompany) {
        this.educationWorkerOfCompany = educationWorkerOfCompany;
    }

    public String getCertificatesWorkerOfCompany() {
        return certificatesWorkerOfCompany;
    }

    public void setCertificatesWorkerOfCompany(String certificatesWorkerOfCompany) {
        this.certificatesWorkerOfCompany = certificatesWorkerOfCompany;
    }

    public String getSalaryWorkerOfCompany() {
        return salaryWorkerOfCompany;
    }

    public void setSalaryWorkerOfCompany(String salaryWorkerOfCompany) {
        this.salaryWorkerOfCompany = salaryWorkerOfCompany;
    }

    public String getWorkingDaysWorkerOfCompany() {
        return workingDaysWorkerOfCompany;
    }

    public void setWorkingDaysWorkerOfCompany(String workingDaysWorkerOfCompany) {
        this.workingDaysWorkerOfCompany = workingDaysWorkerOfCompany;
    }

    public int getWorkHoursWorkerOfCompany() {
        return workHoursWorkerOfCompany;
    }

    public void setWorkHoursWorkerOfCompany(int workHoursWorkerOfCompany) {
        this.workHoursWorkerOfCompany = workHoursWorkerOfCompany;
    }

    public int getWorkExperienceWorkerOfCompany() {
        return workExperienceWorkerOfCompany;
    }

    public void setWorkExperienceWorkerOfCompany(int workExperienceWorkerOfCompany) {
        this.workExperienceWorkerOfCompany = workExperienceWorkerOfCompany;
    }

    public int getAgeWorkerOfCompany() {
        return ageWorkerOfCompany;
    }

    public void setAgeWorkerOfCompany(int ageWorkerOfCompany) {
        this.ageWorkerOfCompany = ageWorkerOfCompany;
    }

    public void displayInformationAboutWorkerOfCompany() {
        System.out.println("Name of company worker : " + nameWorkerOfCompany);
        System.out.println("Surname of company worker : " + surnameWorkerOfCompany);
        System.out.println("Position of company worker : " + positionWorkerOfCompany);
        System.out.println("Education of company worker : " + educationWorkerOfCompany);
        System.out.println("Certificates of company worker : " + certificatesWorkerOfCompany);
        System.out.println("Salary of company worker : " + salaryWorkerOfCompany);
        System.out.println("Working days of company worker : " + workingDaysWorkerOfCompany);
        System.out.println("Work hours of company worker : " + workHoursWorkerOfCompany);
        System.out.println("Work experience in months of company worker : " + workExperienceWorkerOfCompany);
        System.out.println("Age worker of company : " + ageWorkerOfCompany);
    }

    public void salaryForWorkExperience() {
        if (workExperienceWorkerOfCompany <= 6)
            System.out.println("Salary is 400$");
        else if (workExperienceWorkerOfCompany < 24)
            System.out.println("Salary is 1400$");
        else if (workExperienceWorkerOfCompany > 24)
            System.out.println("Salary is 2500$");
        else
            System.out.println("Invalid work experience");

    }

    public void workerPositionAndSalary() {
        String workerSalary;
        switch (positionWorkerOfCompany) {
            case "Junior QA":
                workerSalary = "400$";
                break;
            case "Middle QA":
                workerSalary = "1400$";
                break;
            case "Senior QA":
                workerSalary = "2500$";
                break;

        }
    }



    public static void main(String[] args) {
        WorkerOfCompany productOne = new WorkerOfCompany("Albert", "Kotovskiy", "Junior QA", "Computer Science Bachelor", "IT-academy", "400$", "5/2", 8, 2, 28);
        productOne.displayInformationAboutWorkerOfCompany();
        productOne.salaryForWorkExperience();
        productOne.workerPositionAndSalary();
    }
}


