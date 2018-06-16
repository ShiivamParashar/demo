package bankmanagment;

/*interface Acc{
	String name,acc_type;
    int Acc_num,Acc_Balance;
	
}*/

public class Account{
	String name,acc_type;
    int Acc_num,Acc_Balance;
    Account(){
      
    }
        Account(String n,int acc_num,int b,String a_t){
            name=n;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
        }

}
