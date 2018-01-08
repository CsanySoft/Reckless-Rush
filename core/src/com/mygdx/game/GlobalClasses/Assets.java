//https://github.com/tuskeb/mester
package com.mygdx.game.GlobalClasses;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;


public class Assets {
	// https://github.com/libgdx/libgdx/wiki/Managing-your-assets
	// http://www.jacobplaster.net/using-libgdx-asset-manager
	// https://www.youtube.com/watch?v=JXThbQir2gU
	// https://github.com/Matsemann/libgdx-loading-screen/blob/master/Main/src/com/matsemann/libgdxloadingscreen/screen/LoadingScreen.java

	public static AssetManager manager;
	public static final String CHARS = "0123456789öüóqwertzuiopőúasdfghjkléáűíyxcvbnm'+!%/=()ÖÜÓQWERTZUIOPŐÚASDFGHJKLÉÁŰÍYXCVBNM?:_*<>#&@{}[],-.";


	static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
	static {
		fontParameter.fontFileName = "arial.ttf";
		fontParameter.fontParameters.size = 30;
		fontParameter.fontParameters.characters = CHARS;
		fontParameter.fontParameters.color = Color.WHITE;
	}


	//Betútípus
	public static final AssetDescriptor<BitmapFont> ARIAL_30_FONT
			= new AssetDescriptor<BitmapFont>(fontParameter.fontFileName, BitmapFont.class, fontParameter);

	//Autó ép
	public static final AssetDescriptor<Texture> B_ELSO_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/elso_bal.png",Texture.class);
	public static final AssetDescriptor<Texture> B_ORR_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/orr_bal.png",Texture.class);
	public static final AssetDescriptor<Texture> B_HATSO_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/hatso_bal.png",Texture.class);
	public static final AssetDescriptor<Texture> B_SEGG_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/bal_segg.png",Texture.class);
	public static final AssetDescriptor<Texture> B_OLDAL_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/oldal_bal.png",Texture.class);
	public static final AssetDescriptor<Texture> J_ELSO_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/elso_jobb.png",Texture.class);
	public static final AssetDescriptor<Texture> J_ORR_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/orr_jobb.png",Texture.class);
	public static final AssetDescriptor<Texture> J_HATSO_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/hatso_jobb.png",Texture.class);
	public static final AssetDescriptor<Texture> J_SEGG_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/jobb_segg.png",Texture.class);
	public static final AssetDescriptor<Texture> J_OLDAL_EP
			= new AssetDescriptor<Texture>("car_sprite/intact/oldal_jobb.png",Texture.class);

	//Autó törött
	/*
	public static final AssetDescriptor<Texture> B_ELSO_TOROTT
			= new AssetDescriptor<Texture>("car_sprite/damage/b_elso.png",Texture.class);
	public static final AssetDescriptor<Texture> B_HATSO_TOROTT
			= new AssetDescriptor<Texture>("car_sprite/damage/b_hatso.png",Texture.class);
	public static final AssetDescriptor<Texture> B_OLDAL_TOROTT
			= new AssetDescriptor<Texture>("car_sprite/damage/b_oldal.png",Texture.class);
	public static final AssetDescriptor<Texture> J_ELSO_TOROTT
			= new AssetDescriptor<Texture>("car_sprite/damage/j_elso.png",Texture.class);
	public static final AssetDescriptor<Texture> J_HATSO_TOROTT
			= new AssetDescriptor<Texture>("car_sprite/damage/j_hatso.png",Texture.class);
	public static final AssetDescriptor<Texture> J_OLDAL_TOROTT
			= new AssetDescriptor<Texture>("car_sprite/damage/j_oldal.png",Texture.class);

*/
	public static void prepare() {
		manager = new AssetManager();
		Texture.setAssetManager(manager);
	}



	public static void load() {
		FileHandleResolver resolver = new InternalFileHandleResolver();
		manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
		manager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
		manager.setLoader(BitmapFont.class, ".otf", new FreetypeFontLoader(resolver));


		manager.load(ARIAL_30_FONT);

		//Autó ép
		manager.load(B_ELSO_EP);
		manager.load(B_ORR_EP);
		manager.load(B_HATSO_EP);
		manager.load(B_SEGG_EP);
		manager.load(B_OLDAL_EP);
		manager.load(J_ELSO_EP);
		manager.load(J_ORR_EP);
		manager.load(J_HATSO_EP);
		manager.load(J_SEGG_EP);
		manager.load(J_OLDAL_EP);

		//Autó törött
		/*
		manager.load(B_ELSO_TOROTT);
		manager.load(B_HATSO_TOROTT);
		manager.load(B_OLDAL_TOROTT);
		manager.load(J_ELSO_TOROTT);
		manager.load(J_HATSO_TOROTT);
		manager.load(J_OLDAL_TOROTT);
	*/
	}

    public static void afterLoaded() {
        //manager.get(MUSIC).setLooping(true);
    }

	public static void unload() {
		manager.dispose();
	}

}
