package net.synchlabs.backrooms;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.synchlabs.backrooms.registry.BackroomsBlocks;
import net.synchlabs.backrooms.registry.BackroomsItems;

public class Backrooms implements ModInitializer {

	public static final String MOD_ID = "backrooms";

	@Override
	public void onInitialize() {
		BackroomsBlocks.registerBlocks();
		BackroomsItems.registerItems();
		System.out.println("Backrooms POG");
	}

	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
}
