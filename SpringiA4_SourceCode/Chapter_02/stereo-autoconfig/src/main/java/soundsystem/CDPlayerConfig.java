package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 表明这个类是一个配置类
 * @ComponentScan  开启组件扫描, Spring将会扫描带ComponentScan注解类所在包以及这个包下的所有子包
 * 将 basePackages 属性设置为要扫描包的一个数组,可以设置多个基础包：{"soundsystem", "video"}
 * 将其指定为包中所包含的类或接口:basePackageClasses={CDPlayer.class, DVDPlayer.class},这些类所在的包将会作为组件扫描的基础包。
 * 可以考虑在包中创建一个用来进行扫描的空标记接口（ marker interface ）。
 * @author wsp
 *
 */

@Configuration
@ComponentScan(basePackages={"soundsystem", "video"})
//@ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class})
public class CDPlayerConfig { 
}
