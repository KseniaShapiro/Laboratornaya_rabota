// Абстрактный класс Post необходим для того, чтобы от него наследовались классы Vacancy и Resume

public abstract class Post {
    protected int post_id; //id должности
    protected String name; // название должности
    protected int salary; // зарплата
    protected int experience; // требуемый опыт

    public Post(){} // конструктор без параметров

    public Post(int post_id, String name, int salary, int experience) { // конструктор с параметрами
        this.post_id = post_id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public Post(Post v) { // конструктор копирования
        this.post_id = v.post_id;
        this.name = v.name;
        this.salary = v.salary;
        this.experience = v.experience;
    }


    // ниже все геттеры и сеттеры
    
    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

}