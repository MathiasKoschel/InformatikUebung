package AnimationGame;

public class TestVertex {

	public static void main(String[]args) {
		
		
		String s1="hallo";
		String s2="HallO".toLowerCase();
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Vertex v1 = new Vertex(42,30);
		Vertex v2 = new Vertex(0,0);
		Vertex v3 = new Vertex(100,100);
		//Vertex v5 = v1.skalarMult(2);
	
		
		System.out.println("v1.x = "+v1.x);
		System.out.println("v1.y = "+v1.y);
		System.out.println("v1 = "+v1);
		
		System.out.println("");
		
		System.out.println("v2.x = "+v2.x);
		System.out.println("v2.y = "+v2.y);
		System.out.println("v2 = "+v2);
		
		System.out.println("");
		
		System.out.println("v3.x = "+v3.x);
		System.out.println("v3.y = "+v3.y);
		System.out.println("v3 = "+v3);
		
		System.out.println("");
		
		System.out.println("length v1 = "+v1.length());
		System.out.println("length v2 = "+v2.length());
		System.out.println("length v3 = "+v3.length());
		
		System.out.println(v1.equals(v2));
}
	
}