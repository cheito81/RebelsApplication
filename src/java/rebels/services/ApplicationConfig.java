package rebels.services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * L'anotació @ApplicationPath determina la URL Base de tots els controladors.
 * En aquest cas v1 vol dir que per accedir a qualsevol controlador haurem de fer
 * les peticions HTTP a http://IP_Servidor/Nom_APP/services/[controlador]
 * @author Jose Gimenez
 */
@ApplicationPath("services")
public class ApplicationConfig extends Application {
    
}
