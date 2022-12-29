package text.Entity;

//This is pojo class
public class Agent {
	
	
	
	//create constructor(argment and non argument) and getter setter method of Agent class
	public Agent(int id) {
		super();
		this.id = id;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agent(int id, String name, int commission) {
		super();
		this.id = id;
		this.name = name;
		this.commission = commission;
	}
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
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	//private variable of agent class
	private int id;
	private String name;
	private int commission;

}
