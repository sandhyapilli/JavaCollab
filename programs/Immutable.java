package programs;

public final class Immutable {
private final int number;
private final String name;
private final int id;
public int getNumber() {
	return number;
}
public String getName() {
	return name;
}
public int getId() {
	return id;
}

public Immutable(int number, String name, int id) {
	this.number=number;
	this.name=name;
	this.id=id;
}
}
