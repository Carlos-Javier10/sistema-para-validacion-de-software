package com.tuempresa.libreria.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class libreria {

	public static void main(String[] args) throws Exception {
		DBServer.start("libreria-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("libreria"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
