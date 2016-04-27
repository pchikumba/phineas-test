package zw.co.hitrac.support.web.conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import org.apache.wicket.protocol.http.WicketFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import zw.co.hitrac.support.business.config.PersistenceConfig;


/**
 *
 * @pchikumba
 */
@WebFilter(value = "/*", initParams = {
   @WebInitParam(name = "applicationClassName", value = "zw.co.hitrac.support.web.conf.SupportApplication"),
   @WebInitParam(name = "filterMappingUrlPattern", value = "/*")})
public class SupportWebInitializer extends WicketFilter implements WebApplicationInitializer {

   public void onStartup(ServletContext servletContext) throws ServletException {
       AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
       servletContext.addListener(new ContextLoaderListener(ctx));
       ctx.register(PersistenceConfig.class);

   }

}
