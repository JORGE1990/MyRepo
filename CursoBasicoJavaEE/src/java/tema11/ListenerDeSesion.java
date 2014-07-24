package tema11;

import java.util.Date;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerDeSesion implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.print("A las " + getTime() + "  se creo la sesion con ID: " +
                session.getId() + " MaxInactiveInterval=" +
                session.getMaxInactiveInterval());
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("A las " + getTime() + " se destruyo la sesion con ID: "
                + session.getId());
    }

    private String getTime() {
        return new Date(System.currentTimeMillis()).toString();
    }
}
