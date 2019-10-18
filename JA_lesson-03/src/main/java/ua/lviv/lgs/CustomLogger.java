package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLogger {

	private static Logger LOG = Logger.getLogger(CustomLogger.class);

	public static void main(String[] args) {
		
		logWithDomConfigurator();

	}

	public static void logWithDomConfigurator() {
		DOMConfigurator.configure("loggerConfig.xml");
		LOG.trace("TRACE Logger message of project");
		LOG.debug("DEBUG Logger message of project");
		LOG.info("INFO Logger message of project");
		LOG.warn("WARN Logger message of project");
		LOG.error("ERROR Logger message of project");
		LOG.fatal("FATAL Logger message of project");
	}

}
