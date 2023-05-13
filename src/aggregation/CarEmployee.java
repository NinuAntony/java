package aggregation;

public class CarEmployee {
String employeename;
int id;
Car car;

public CarEmployee(String employeename, int id, Car car) {
	super();
	this.employeename = employeename;
	this.id = id;
	this.car = car;
	System.out.println(employeename+" "+id);
	System.out.println(car.carcolour+" "+car.carname+" "+car.carregno);
}

public static void main(String[] args) {
		Car car1=new Car("white","Nexon","KL08BW5586");
		CarEmployee owner=new CarEmployee("ninu",7777,car1);
		

	}

}
