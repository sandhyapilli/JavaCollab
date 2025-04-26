package tasksChatGpt;

public final class ImmutablePractice {

	private final String name;
    private final int age;
	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}



	public ImmutablePractice(String name, int age) {
		this.name = name;
		this.age = age;
	}



}