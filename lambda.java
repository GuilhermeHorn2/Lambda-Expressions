package misc;

import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		get_value get_population = (list,cont) ->{
			
			int c = 0;
			for(Country k : list) {
				if(k.get_continent().equals(cont)){
					c += k.get_population();
				}
			}
			return c;
		};
		
		
		
	}
	
	
}
