package tr.com.kansu.yasin.spring_helloworld_example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.com.kansu.yasin.spring_helloworld_example.bean.FullAdder;

@Configuration
public class RestConfiguration {

    @Bean
    public FullAdder fullAdder() {
        return new FullAdder();
    }
}
