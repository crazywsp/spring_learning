package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
	private CompactDisc compactDisc;

	//通过自动装配，将一个 CompactDisc 注入到 CDPlayer 之中
	//@Autowired等同于@Inject
	/*@Autowired(required=false)
	public CDPlayer(CompactDisc compactDisc){
		this.compactDisc = compactDisc;
	}*/
	
	@Autowired
	public void setCompactDisc(CompactDisc compactDisc){
		this.compactDisc = compactDisc;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		compactDisc.play();
	}

}
