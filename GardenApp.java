import java.util.Scanner;

public class GardenApp {

	public static void main(String[] args) {
		
		// ' ' - land
		// 'Y' - corn
		// 'o' - potato
		
		final float PRICE_CORN = 50.00F; //MDL
		final float PRICE_POTATO = 20.00F; //MDL
			  float total         = 00.00F;
			  
			  Scanner in = new Scanner (System.in);
		System.out.print("Where to? : ");
		int where = in.nextInt();
		System.out.print("What? Press 1 for Corn, Press 2 for Potato : ");
		int what = in.nextInt();
		
		
		char[] garden = {'.', '.', '.', 'Y', 'Y', 'Y', 'o', 'o', 'o', 'o'};
		if (what==1){
			
			garden[where]='Y';
		}
		if (what==2){
			garden[where]='o';
		}
		
	
		
		// ..sbor
//		for ( char g : garden){
//			if ( g == 'Y'){
//				total += PRICE_CORN;
//			} else if ( g == 'o'){
//				total += PRICE_POTATO;
//			}
//			
//		}
//		
//		System.out.print(total);
			
		for ( char g : garden){
			System.out.print(g);
		}
	}

}
