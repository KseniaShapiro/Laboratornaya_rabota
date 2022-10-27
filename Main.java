import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Создание экземпляров класса Vacancy

        Vacancy v1 = new Vacancy(
                1,
                "Designer",
                60000,
                2,
                "full day",
                "TwoPizzas",
                0);
        Vacancy v2 = new Vacancy(
                2,
                "Teacher",
                20000,
                5,
                "full day",
                "EnglishTochka",
                2);
        Vacancy v3 = new Vacancy(
                3,
                "Uber Driver",
                40000,
                0,
                "free",
                "Yandex",
                1);

        // Создание экземпляров класса Resume

        Resume r1 = new Resume(
                2,
                "Teacher",
                20000,
                3,
                1,
                "Bruce Lee",
                "World champion of jiu jitsu",
                "kick_low_kick@gmail.com",
                "self - taught",
                "Shaolin Monastery");
        Resume r2 = new Resume(
                2,
                "Teacher",
                20000,
                8,
                2,
                "Palubova Galina Ivanovna",
                "English language, Master of sports of fencing, Mom of 5 children",
                "Super_teacher@gmail.com",
                "Yaroslavl State Pedagogical University named after K.D.Ushinsky",
                "School 33, Lyceum 86");
        Resume r3 = new Resume(
                    3,
                    "Uber Driver",
                    40000,
                    3,
                    3,
                    "Supov Igor Igorevich",
                    "English language, Driving experience of 20 years, Knowledge of 5000 jokes",
                    "vrumvrumvrum@gmail.com",
                    "Yaroslavl College of Culture",
                    "Maxim, POEHALI");

        Vacancy v4 = new Vacancy(v1); // Проверяем работоспособность конструктора копирования
        Resume r4 = new Resume(r2); // И тут

        System.out.println(v1); // Выводим все вакансии
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4); //Вывод работы конструктора копирования

        System.out.println();

        CompOnExperience compOnExperience = new CompOnExperience(); // Создаём экземпляр компаратора по опыту работы
        CompOnSalary compOnSalary = new CompOnSalary(); // Создаём экземпляр компаратора по зарплате
        
        TreeSet<Vacancy> vacancies = new TreeSet<>(compOnSalary); // Создаем TreeSet с параметром - экземпляром компаратора по зарплате
        TreeSet<Resume> resumme = new TreeSet<>(compOnExperience); // Создаем TreeSet с параметром - экземпляром компаратора по опыту работы
        
         //Добавляем элементы в vacancies
        vacancies.add(v1);
        vacancies.add(v2);
        vacancies.add(v3);

        


        for (Vacancy v : vacancies) { // Вывод элементов TreeSet'а
            System.out.println(v);
        }

        System.out.println();

        System.out.println(r1); // Выводим все поданные резюме
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4); // Результать работы конструктора копирования

        System.out.println();
        System.out.println();

        // Добавляем элементы в resumme
        resumme.add(r1);
        resumme.add(r2);
        resumme.add(r3);

        for (Resume r : resumme) { // Вывод элементов TreeSet'а
            System.out.println(r);
        }

        System.out.println();
        System.out.println();

        for (Vacancy v : vacancies) { // Вывод выкансий, на которые не откликнулись
           if(v.getCount_Of_Resume()==0) System.out.println(v);
        }

        System.out.println();
        System.out.println();

        for (Vacancy v : vacancies) { // Вывод резюме, которые подходят под требования по опыту
           for(Resume r : resumme) {
                 if(v.getPost_id()==r.getPost_id() && v.getExperience()<r.getExperience()) System.out.println(r);
           }
        }

        System.out.println();
        System.out.println();

        for (Vacancy v : vacancies) { // Вывод вакансий, которые не подходят под требования по опыту
           for(Resume r : resumme) {
                 if(v.getPost_id()==r.getPost_id() && v.getExperience()>r.getExperience()) System.out.println(r);
           }
        }

    }
}