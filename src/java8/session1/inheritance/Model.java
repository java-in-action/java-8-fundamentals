package java8.session1.inheritance;

import java.time.LocalDate;

public class Model {
	private int id;
	private String description;
	public Model(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", description=" + description + "]";
	}	
}
