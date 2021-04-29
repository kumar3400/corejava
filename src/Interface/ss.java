package Interface;

public class ss implements Sai{
	
	
	public void sai() {
		
		System.out.println("name is sai");
	}

	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("adding");
	}

	@Override
	public void kumar() {
		// TODO Auto-generated method stub
		System.out.println("kumar sai");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ss ob = new ss();
		ob.add();
		ob.kumar();
		
		Sai ob1 = new ss();
		
		//ob1.sai();
		
	}

}
