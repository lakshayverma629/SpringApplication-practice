package verma.lakshay.didemo.service;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingSevice(String lang) {

        switch (lang) {
            case "en":
                return new PrimaryEnglishGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryEnglishGreetingService(greetingRepository);
        }
    }
}