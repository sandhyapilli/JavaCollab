package priyanka;

public class Encaps {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String Name(String name) {
	name=name.toLowerCase();
	return name;
}

}
