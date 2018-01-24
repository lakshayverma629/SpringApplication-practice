package verma.lakshay.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import verma.lakshay.didemo.exampleBean.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Value("${verma.user}")
    String user;

    @Value("${verma.password}")
    String password;

    @Value("${verma.dburl}")
    String url;

    @Bean //Bean created by us using Java tags .
    // can be pulled up using getBean
    //we are putting data in our bean.
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        return  fakeDataSource;

    }
   @Bean
   //PropertyPlaceholderConfigurer class to externalize the deployment details into a properties file,
   // and access from bean configuration file via a special format – ${variable}.
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
