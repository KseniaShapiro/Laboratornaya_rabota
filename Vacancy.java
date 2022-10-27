public class Vacancy extends Post { // класс Вакансия
    private String work_schedule; // график работы
    private String name_of_company; // название компании
    private int count_of_resume; // количество поданных резюме на вакансию

    public Vacancy() { // конструктор без параметров
        super(); // инициализация элемента родительского класса
    }

    public Vacancy(int post_id, String name, int salary, int experience, String work_schedule, String name_of_company, int count_of_resume) { // конструктор с параметрами
        super(post_id,name,salary,experience);
        this.work_schedule = work_schedule;
        this.name_of_company = name_of_company;
        this.count_of_resume = count_of_resume;
    }

    public Vacancy (Vacancy v) { // конструктор копирования
        super(v.post_id,v.name,v.salary,v.experience);
        this.work_schedule = v.work_schedule;
        this.name_of_company = v.name_of_company;
        this.count_of_resume = v.count_of_resume;
    }

    // ниже все геттеры и сеттеры + метод toString для удобства вывода

    public String getWork_Shedule() {
        return work_schedule;
    }

    public void setWork_Schedule(String work_schedule) {
        this.work_schedule = work_schedule;
    }

    public String getName_Of_Company() {
        return name_of_company;
    }

    public void setName_Of_Company(String name_of_company) {
        this.name_of_company = name_of_company;
    }

    public int getCount_Of_Resume() {
        return count_of_resume;
    }

    public void setCount_Of_Resume(int count_of_resume) {
        this.count_of_resume = count_of_resume;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "post_id="+ post_id +
                ", name=" + name +
                ", salary=" + salary +
                ", experience=" + experience +
                ", work_schedule=" + work_schedule +
                ", name_of_company=" + name_of_company +
                ", count_of_resume=" + count_of_resume +
                '}';
    }
}