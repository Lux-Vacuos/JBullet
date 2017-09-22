package com.bulletphysics.collision.broadphase;

import java.util.List;

import com.bulletphysics.collision.dispatch.CollisionObject;
import com.bulletphysics.collision.dispatch.ManifoldResult;
import com.bulletphysics.collision.narrowphase.PersistentManifold;

public interface ICollisionAlgorithm {

	public void init();

	public void init(CollisionAlgorithmConstructionInfo ci);

	public void destroy();

	public void processCollision(CollisionObject body0, CollisionObject body1, DispatcherInfo dispatchInfo,
			ManifoldResult resultOut);

	public float calculateTimeOfImpact(CollisionObject body0, CollisionObject body1, DispatcherInfo dispatchInfo,
			ManifoldResult resultOut);

	public void getAllContactManifolds(List<PersistentManifold> manifoldArray);

}
