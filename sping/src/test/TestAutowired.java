import config.StudentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.StudentService;
import service.StudentServiceImpl;

public class TestAutowired {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                StudentConfig.class
        );
        StudentService studentService = context.getBean("studentService", StudentServiceImpl.class);
        studentService.printStudentInfo();
    }
}
