package verma.lakshay.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import verma.lakshay.didemo.exampleBean.FakeDataSource;
import verma.lakshay.didemo.exampleBean.FakeJMSSource;

@Configuration

public class PropertyConfig {
    @Value("${verma.user}")
    String user;

    @Value("${verma.password}")
    String password;

    @Value("${verma.dburl}")
    String url;

    @Value("${verma.JMS.user}")
    String userjms;

    @Value("${verma.JMS.password}")
    String passwordjms;

    @Value("${verma.JMS.dburl}")
    String urljms;

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
    public FakeJMSSource fakeJMSSource(){
        FakeJMSSource fakeJMSSource=new FakeJMSSource();
        fakeJMSSource.setPassword(passwordjms);
        fakeJMSSource.setUrl(urljms);
        fakeJMSSource.setUser(userjms);
        return  fakeJMSSource;

    }
    @Bean
   //PropertyPlaceholderConfigurer class to externalize the deployment details into a properties file,
   // and access from bean configuration file via a special format – ${variable}.
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
