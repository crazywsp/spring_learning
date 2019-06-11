package soundsystem;
import org.springframework.stereotype.Component;

/**
 * 将这个 bean 标识为 lonelyHeartsClub
 * @author wsp
 *
 */

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}

/*@Bean
public CompactDisc sgtPeppers(){
	return new SgtPeppers();
}*/
