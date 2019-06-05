package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

/**
 * 测试marker interface，注意要修改CDPlayerTest类中的@ContextConfiguration(classes=CDPlayerConfig.class)，
 * 将classes=CDPlayerConfig.class换为classes=TestMarkerInterface.class即可
 * @author wsp
 *
 */
//@Configuration
//@ComponentScan(basePackages={"soundsystem", "video"})
public class TestMarkerInterface {

}
