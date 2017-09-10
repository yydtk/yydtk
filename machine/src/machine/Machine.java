package machine;

public class Machine {
	int price=80;
	int balance=f();
	int total;

	Machine(){
		total=0;
	}
	Machine(int price){
		this.price=price;
	}
	int f() {
		return 10;
	}
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	void insertMoney(int amount) {
		balance+=amount;
		showBalance();
	}
	
	void showBalance()
	{
		System.out.println(this.balance);
	}
	
	void getFood() {
		if(balance>=price) {
			System.out.println("here you are£¡");
			balance=balance-price;
			total+=price;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine vm=new Machine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		Machine vm1=new Machine(100);
		vm1.showBalance();
		vm1.insertMoney(100);
		vm1.getFood();
		vm1.showBalance();
	}

}
