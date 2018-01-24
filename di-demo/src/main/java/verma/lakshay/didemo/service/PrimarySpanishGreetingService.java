package verma.lakshay.didemo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("hi")
public class PrimarySpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Namaste!!";
    }
}
