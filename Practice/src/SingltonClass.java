

public class SingltonClass implements Cloneable{
	
	public static SingltonClass instance = null;
	
	private SingltonClass() {
		
	}

	public static SingltonClass getInstance() {
		if(instance==null) {
			instance = new SingltonClass();
		}
		return instance; 
	}
	
	protected SingltonClass clone() {
		return instance;
	}
	
	
	protected Object readResolve() {
		return getInstance();
	}
}
