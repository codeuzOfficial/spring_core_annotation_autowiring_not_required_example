package dasturlash.uz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Subject {
    private String title = "AxmoqQilish";
    @Autowired(required = false)
    private Professor professor; // domla


    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", professor=" + professor +
                '}';
    }
}
