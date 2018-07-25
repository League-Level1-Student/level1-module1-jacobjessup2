
public class DuckRunner {
public static void main(String[] args) {
	Duck duckduck = new Duck(0, "bread", "pressFtoPayRespects");
	for (int i = 0; i < 101; i++) {
		duckduck.quack();
	}
	duckduck.waddle();
	
	Duck duckduckduck = new Duck(3, "pizza", "Aaron");
	
	duckduckduck.waddle();
	
	
	
	duckduck.numberOfFriends = 1;
	System.out.println(duckduck.numberOfFriends);
	
	duckduckduck.numberOfFriends = 4;
	System.out.println(duckduckduck.numberOfFriends);
	
	System.out.println(duckduck.numberOfFriends);
	
	
	
	
	
	
}
}
