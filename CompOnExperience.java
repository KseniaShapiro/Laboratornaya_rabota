import java.util.Comparator;

public class CompOnExperience implements Comparator<Resume> { // компаратор, который сравнивает экземпляры класса Resume по опыту работы
    @Override
    public int compare(Resume r1, Resume r2) { // переопределяем метод compare в соответствии с заданной целью
        if (r1.getExperience() != r2.getExperience()) return r1.getExperience()-r2.getExperience();
        else return 1;
    }
}