package org.getspout.vanilla.entities.hostile;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entities.HostileEntityController;
import org.getspout.vanilla.mobs.MobID;

public class SpiderEntityController extends HostileEntityController {

	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata("MobID", new MetadataStringValue(MobID.Spider.id));
	}

	@Override
	public void onTick(float dt) {
		super.onTick(dt);
	}
	
}