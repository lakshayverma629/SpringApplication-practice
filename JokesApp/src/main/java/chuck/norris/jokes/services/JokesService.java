package chuck.norris.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService implements JokeServiceInterface {
private final ChuckNorrisQuotes norrisQuotes;

    public JokesService(ChuckNorrisQuotes norrisQuotes) {
        this.norrisQuotes = norrisQuotes;
    }

    public String getJoke(){
        return norrisQuotes.getRandomQuote();
}


}
