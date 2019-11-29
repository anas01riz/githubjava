package banking.managment.system;

public interface Room {

public default boolean roomavialable() {
	return false;
	
}
	public default int roomtype() {
	return 0;
	
}
	
	public default int roomdetails() {
		return 0;
		
	}
	
	
}
