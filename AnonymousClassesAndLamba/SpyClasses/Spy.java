package SpyClasses;
public interface Spy {

	public String encode(String val);

	public default void outputEncoding(String val){
		System.out.println(val + ": " + encode(val));
	}
}