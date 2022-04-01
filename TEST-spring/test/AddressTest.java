import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jokereven.entity.Address;
import pers.jokereven.service.AddressService;

public class AddressTest {

    @Test
    public void test(){
        //创建spring上下文对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Spring容器中的service对象
        AddressService aService = (AddressService) context.getBean("service");

        //创建用于注册的用户对象
        Address a = new Address();

        a.setId(1);
        a.setUserId(001);
        a.setTel("110");

        aService.AddAddress(a);
    }
}
