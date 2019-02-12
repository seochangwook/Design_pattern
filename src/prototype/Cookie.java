package prototype;

/*
 * Prototype Class
 */

public class Cookie implements Cloneable{
	private String name;
	
	public Cookie() {
		System.out.println("Prototype call");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() {
		try {
			Cookie copy = (Cookie)super.clone();
			
			return copy;
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			
			return null;
		}
	}

	@Override
	public String toString() {
		return "Cookie [name=" + this.name + "]";
	}
}
