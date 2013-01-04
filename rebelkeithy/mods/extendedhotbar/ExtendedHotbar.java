package rebelkeithy.mods.extendedhotbar;

import java.io.*;
import java.util.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

@TransformerExclusions("rebelkeithy.mods.extendedhotbar")
public class ExtendedHotbar implements IFMLLoadingPlugin, IFMLCallHook
{

	@Override
	public String[] getLibraryRequestClass() 
	{
		return null;
	}

	@Override
	public String[] getASMTransformerClass() 
	{
		return new String[] {"rebelkeithy.mods.extendedhotbar.DiyosClassOverride"};
	}

	@Override
	public String getModContainerClass()
	{
		return "rebelkeithy.mods.extendedhotbar.ExtendedHotbarContainer";
	}

	@Override
	public String getSetupClass() 
	{
		return "rebelkeithy.mods.extendedhotbar.ExtendedHotbar";
	}

	@Override
	public void injectData(Map<String, Object> data) 
	{
		if (data.containsKey("coremodLocation"))
			coreLocation = (File) data.get("coremodLocation");
	}

	public static File coreLocation;

	@Override
	public Void call() throws Exception 
	{
		
		DiyosClassOverride.addClassOverride("atr", "GuiIngame, changes to hotbar drawing");
		DiyosClassOverride.addClassOverride("qw", "InventoryPlayer, allow selected slots higher than 9");
		
		return null;
		
	}
}
