
public class Minion {
	private String name; 
	private int eyes; 
private String color; 
	private String master;
	
public static void main(String[] args) {
	
}
Minion(String name,int eyes, String color, String master){
	this.color=color;
	this.eyes=eyes;
	this.master= master;
	this.name= name;
}
String getName() {
	
	return name;
}
String getColor() {
	
	return color;
	
}
int getEyes() {
	return eyes;
}
String getMaster() {
	return master;
}
String setMaster(String master) {
	this.master= master;
	
	return master;
	
}
}
