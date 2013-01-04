package rebelkeithy.mods.extendedhotbar;

import java.util.Arrays;

import net.minecraftforge.event.EventBus;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class ExtendedHotbarContainer extends DummyModContainer
{
	public ExtendedHotbarContainer() {
        super(new ModMetadata());
        /* ModMetadata is the same as mcmod.info */
        ModMetadata myMeta = super.getMetadata();
        myMeta.authorList = Arrays.asList(new String[] { "RebelKeithy" });
        myMeta.description = "Extended Hotbar, Core mod";
        myMeta.modId = "ExtendedHotbar";
        myMeta.version = "1.4.6";
        myMeta.name = "Extended Hotbar";
	    //myMeta.url = "http://minecraftforge.net/wiki/Using_Access_Transformers";
	}

	public boolean registerBus(EventBus bus, LoadController controller) 
	{
		bus.register(this);
		return true;
	}
}
