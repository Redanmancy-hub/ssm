
import com.spring.advice.MyAdvice;
import com.spring.config.SpringAopConfig;
import com.spring.config.SpringConfig;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

    @Test
    public void test(){
        //基于xml方式的spring容器
/*
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = classPathXmlApplicationContext.getBean(UserService.class);
        userService.show1();
*/



        //基于注解方式去加载spring的核心配置类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringAopConfig.class);
        UserService bean = applicationContext.getBean(UserService.class);
        bean.show1();
    }
}
