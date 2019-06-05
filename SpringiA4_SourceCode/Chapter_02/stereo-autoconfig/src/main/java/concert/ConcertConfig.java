package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 在JavaConfig中启用AspectJ注解的自动代理
 * @author wsp
 *
 */
@Configuration
@EnableAspectJAutoProxy		//启用AspectJ自动代理
@ComponentScan
public class ConcertConfig {

	@Bean
	public Audience audience() {	//声明Audience bean
		return new Audience();
	}
}
