package concert;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {

	private Map<Integer, Integer> trackCounts = new HashMap<>();
	
	@Pointcut("execution(* soundsystem.CompactDisc.playTrack(int) && args(trackNumber))")
	public void trackPlayed(int trackNumber) {} 
	
	public void countTrack(int trackNumber){
		int currentCount = getPlayCount(trackNumber);
		
	}

	public int getPlayCount(int trackNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
}
