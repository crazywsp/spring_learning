import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

    private String title = "music";
    private String artist = "The Super Wu";

    public void play(){
        System.out.println("Playing " + title + " by " + artist);
    }
}
