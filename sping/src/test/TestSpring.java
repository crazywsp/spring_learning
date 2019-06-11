import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Source;
import pojo.Student;
import config.StudentConfig;
import service.ProduceService;

public class TestSpring {

    @Test
    public void test(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        Source source = (Source) context.getBean("source");
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());

        /*JuiceMaker juiceMaker = (JuiceMaker) context.getBean("juickMaker");
        System.out.println(juiceMaker.makeJuice());*/

    }

    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(
                StudentConfig.class
        );
        Student student = context.getBean("student1", Student.class);
        System.out.println(student.getId() + " xx " + student.getName());
    }

    @Test
    public void test01(){
        ApplicationContext context02 = new
                ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        ProduceService s = (ProduceService) context02.getBean("produceService");
        s.doSomeService();
    }
}
