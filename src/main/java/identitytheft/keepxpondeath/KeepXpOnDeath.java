package identitytheft.keepxpondeath;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeepXpOnDeath implements ModInitializer {
	public static final String MOD_ID = "dont-drop-xp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Starting Don't Drop XP!");
	}
}