package bankmanagment;

interface Acc{
	void display_details();
}
public class create_account extends Account implements Acc {
		create_account(String n,int acc_num,int b,String a_t){ 
			name=n;
			Acc_num=acc_num;
			Acc_Balance=b;
			acc_type=a_t;
		}
		create_account(){
			super();
		}
    
		void insert(String n,int acc_num,String a_t){  
			name=n;
			acc_type=a_t;
			Acc_num=acc_num; // generate random number using math function
			Acc_Balance=0;
		}

		public void display_details(){
			System.out.println("Depositor Name :" +name);
			System.out.println("Account Number : "+Acc_num);
			System.out.println("Account Balance : "+Acc_Balance);
			System.out.println("Account Type : "+acc_type);
		}

		void deposite(int acc_num,int money){  
			
            Acc_Balance=money;
			
		}
    
		int withdraw(int withd){
			if(withd > 30000)
			{
				System.out.println("Withdrawing Amount Should be less than 30000");
			}
			else
            Acc_Balance=Acc_Balance-withd;
            return Acc_Balance;
    
	}
}
		


