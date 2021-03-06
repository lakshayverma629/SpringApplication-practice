package verma.lakshay.didemo.service;

public class PrimarySpanishGreetingService implements GreetingService{
    GreetingRepository greetingRepository;
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getEnglishGreeting();
    }
}
