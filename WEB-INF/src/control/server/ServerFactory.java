package control.server;

import model.World;
import model.WorldFactory;

/**
 * @since 21.04.2014
 * @author Julian Schelker
 */
public class ServerFactory {

	private static Server server;

	public static Server getServer() {
		if (server == null) {
			TaskHandler taskHandler = new TaskHandler();
			World world = WorldFactory.createTestWorld((TaskHandlerI) taskHandler);

			server = Server.getInstance(world);
			server.addListener(taskHandler);
			server.addListener(world.getUniverse());
		}
		return server;
	}
}
