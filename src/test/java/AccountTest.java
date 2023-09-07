import com.spring.config.SpringTransConfig;
import com.spring.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountTest {
    @Test
    public void transformMoneyTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTransConfig.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        accountService.transformMoney("张娅","胡虞强",500);
        System.out.println("赚钱成功");
    }
}
