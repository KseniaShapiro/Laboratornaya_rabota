import java.util.Comparator;

public class CompOnSalary implements Comparator<Vacancy> { // компаратор, который сравнивает экземпляры класса Vacancy по зарплате
    @Override
    public int compare(Vacancy v1, Vacancy v2) { // переопределяем метод compare в соответствии с заданной целью
        if (v1.getSalary() != v2.getSalary()) return v1.getSalary()-v2.getSalary();
        else return 1;
    }
}