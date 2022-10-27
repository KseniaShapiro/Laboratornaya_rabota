public class Resume extends Post { // класс резюме

    private int resume_id; //id резюме
    private String name_of_person; // имя человека
    private String soft_skills; // дополнительные навыки
    private String email; // почта
    private String education; // образование
    private String previous_companies; // предыдущие места работы

    public Resume() { // конструктор без параметров
        super(); //инициализация элемента родительского класса
    }

    public Resume(int post_id, // конструктор с параметрами
                String name,
                int salary,
                int experience,
                int resume_id,
                String name_of_person,
                String soft_skills,
                String email,
                String education,
                String previous_companies) {
        super(post_id,name,salary,experience);
        this.resume_id = resume_id;
        this.name_of_person = name_of_person;
        this.soft_skills = soft_skills;
        this.email = email;
        this.education = education;
        this.previous_companies = previous_companies;
    }

    public Resume(Resume r) { // конструктор копирования
        super(r.post_id,r.name,r.salary,r.experience);
        this.resume_id = r.resume_id;
        this.name_of_person = r.name_of_person;
        this.soft_skills = r.soft_skills;
        this.email = r.email;
        this.education = r.education;
        this.previous_companies = r.previous_companies;
    }


    // ниже все сеттеры и геттеры + toString

    public int getResume_id() {
        return resume_id;
    }

    public void setResume_id(int resume_id) {
        this.resume_id = resume_id;
    }

    public String getName_Of_Person() {
        return name_of_person;
    }

    public void setName_Of_Person(String name_of_person) {
        this.name_of_person = name_of_person;
    }

    public String getSoft_Skills() {
        return soft_skills;
    }

    public void setSoft_Skills(String soft_skills) {
        this.soft_skills = soft_skills;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPrevious_Companies() {
        return previous_companies;
    }

    public void setPrevious_Companies(String previous_companies) {
        this.previous_companies = previous_companies;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "post_id="+ post_id +
                ", name=" + name +
                ", salary=" + salary +
                ", experience=" + experience +
                ", resume_id=" + resume_id +
                ", name_of_person=" + name_of_person +
                ", soft_skills=" + soft_skills +
                ", email=" + email +
                ", education=" + education +
                ", previous_companies=" + previous_companies +
                '}';
    }
}