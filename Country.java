package misc;

public class Country {

	private String continent;
	private int population;
	
	Country(String con,int pop){
		continent = con;
		population = pop;
	}
	
	public String get_continent() {
		return continent;
	}
	public int get_population(){
		return population;
	}
	
}
