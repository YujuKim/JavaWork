package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		Box<Cup> box2 = new Box<>();
		box1.put("안녕");
		System.out.println(box1.isEmpty());
		System.out.println("--------------------------");
		String msg = box1.take();
		System.out.println("msg: " + msg);
		System.out.println(box1.isEmpty());
		System.out.println("--------------------------");
		

	
		
		
	

	}

}
