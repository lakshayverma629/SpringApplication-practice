package verma.lakshay.didemo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello! gooD morning";
    }

    @Override
    public String getSpanishGreeting() {
        return "Bonjour";
    }

    @Override
    public String getGermanGreeting() {
        return "salam";
    }
}
