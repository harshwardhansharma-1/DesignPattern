package design_patterns_singleton;

public class Cache {
	private static class SingletonHelper {
		private static final Cache INSTANCE = new Cache();
	}
	
	public static Cache getInstance() {
		return SingletonHelper.INSTANCE;
	}
	private  Cache() {
	}
	
//	public static synchronized Cache getInstance() {
//		if(cache != null) {
//		cache = new Cache();	
//		}
//		
//		return cache;
//	}
}
