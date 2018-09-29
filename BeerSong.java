public class BeerSong {
	public static void main(String[] args) {
	}
	
	public static void Ninety_Nine_Bottles_of_Beer() {
		for (int i = 99; i > 0; i--) {
			String bottles = String.valueOf(i);
			if (i == 1) {
				System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer");
				System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
			} else {
				System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
				if (i == 2) {
					System.out.println("take one down, pass it around, " + String.valueOf(i - 1) + " bottle of beer on the wall.");
				} else {
					System.out.println("take one down, pass it around, " + String.valueOf(i - 1) + " bottles of beer on the wall.");
				}
			}
		}
	}
}
