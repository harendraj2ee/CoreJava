/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module_2;

class Player0 {
	String name;
	int age;
}

public class Test0 {
	public static void main(String args[]){
		Test0 test0 = new Test0();
		test0.newPlayer();
                test0.makeNewPlayer("Ronaldo", 28);
                
              // test0.youngerPlayer(Player0 player1, Player0 player2);
	}

	// do a dry run
	public void newPlayer() {
		Player0 player1 = new Player0();
		player1.name = "Messi";
		player1.age = 27;
		System.out.println(player1.name+" : "+player1.age);
	}

	//makeNewPlayer("Ronaldo",28)
	public void makeNewPlayer(String name, int age) {
		Player0 player1 = new Player0();
		player1.name = name;
		player1.age = age;
		System.out.println(player1.name+" : "+player1.age);			
	}

	public Player0 youngerPlayer(Player0 player1, Player0 player2){
		int age1 = player1.age;
		int age2 = player2.age;
		if (age1<age2)
			return player1;
		return player2;
	}

}
