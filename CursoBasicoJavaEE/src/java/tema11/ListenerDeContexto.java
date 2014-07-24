package tema11;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerDeContexto implements ServletContextListener {

    public void contextInitialized(ServletContextEvent contextEvent) {
        ServletContext contexto= contextEvent.getServletContext();
        System.out.println("Aplicacion arrancando en el contexto " +
                contexto.getContextPath() +
                " con el siguiente parámetro de configuracion: " +
                contexto.getInitParameter("parametro"));

    }

    public void contextDestroyed(ServletContextEvent contextEvent) {
        ServletContext contexto= contextEvent.getServletContext();
                System.out.println("Aplicacion del contexto " +
                contexto.getContextPath() + " deteniéndose.");
    }
}
