package springIntroduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
@ComponentScan("springIntroduction")
public class MyConfig {

    @Bean
    @Scope("prototype")
    //создаётся бин с названием метода т.е catBean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
