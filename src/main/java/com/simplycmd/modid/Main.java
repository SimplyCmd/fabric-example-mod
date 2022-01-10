package simplycmd.modid;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "modid";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_ID + " activated :O");
	}

	@Override
	public void onInitializeClient() {
	}
}
