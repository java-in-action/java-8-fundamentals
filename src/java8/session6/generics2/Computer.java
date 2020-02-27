package java8.session6.generics2;

public class Computer implements Comparable<Computer>{
	private int id;
	private String desc;
	
	Computer(int id, String desc){
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "id: " + id + ", desc: " + desc; 
	}

	@Override
	public int compareTo(Computer comp) {
		return this.desc.compareTo(comp.desc);
	}


}
