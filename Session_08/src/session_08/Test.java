package session_08;

public class Test extends A{
	
	public static void main(String args [])
	{
		Popcorn p = new Popcorn() {
			
			@Override
			public void taste() {
				System.out.println("Cheesy");
			}
		};
		p.taste();
	}

}
