package Bankexample;



public class Bank {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//creating instance of the encapsulated class 
			Bank1 obj=new Bank1();
			
			//setting value in the accounted_name member
			obj.setAcconted_name("Aarti Dalvi");
			
			//getting value of the accounted_name member
			System.out.println("Name of account holder:"+obj.getAcconted_name());
			
			//setting value in the accounte_balance member
			obj.setAccount_balance(50000);
			
			
			//getting value of the accounte_balance member
			System.out.println("Bank balance:"+obj.getAccount_balance());
			
			//calling deposite() method of Bank1 class
			obj.deposite();
			
			//calling withdraw() method of Bank1 class 
			obj.withdraw();

		}

	}



