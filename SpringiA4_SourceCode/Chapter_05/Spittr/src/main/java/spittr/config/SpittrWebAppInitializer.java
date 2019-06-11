package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.web.WebConfig;

/**
 * 配置 DispatcherServlet
 * @author wsp
 *
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	/**
	 * 会将一个或多个路径映射到 DispatcherServlet 上
	 * 在本例中，它映射的是 “/” ，它会处理进入应用的所有请求。
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{ "/" };		//将DispatcherServlet映射到“/”
	}

	/**
	 *  ContextLoaderListener 要加载应用中的其他 bean 。这些 bean 通常是驱动应用后端的中间层和数据层组件。
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{ RootConfig.class};
	}

	/**
	 * 当 DispatcherServlet 启动的时候，它会创建 Spring 应用上下文，并加载配置文件或配置类中所声明的 bean 。
	 *  DispatcherServlet 加载包含 Web 组件的 bean ，如控制器、视图解析器以及处理器映射
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{ WebConfig.class};
	}

}
