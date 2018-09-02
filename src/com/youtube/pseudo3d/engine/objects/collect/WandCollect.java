package com.youtube.pseudo3d.engine.objects.collect;

import com.youtube.pseudo3d.engine.GameLogic;
import com.youtube.pseudo3d.engine.objects.GameObject;
import com.youtube.pseudo3d.resource.TextureHolder.ID;
import com.youtube.pseudo3d.util.Vector2d;

public class WandCollect extends GameObject{

	public WandCollect(GameLogic raycaster, Vector2d position) {
		super(raycaster, position);
		
		texture = ID.WAND_COLLECT;
	}
	
	@Override
	public void update(double elapsed) {
		
	}
}