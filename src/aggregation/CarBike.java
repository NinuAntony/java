package aggregation;

public class CarBike {
	String employeename;
	int id;
	Car car;
	Bike bike;

	public CarBike(String employeename, int id, Car car, Bike bike) {
		super();
		this.employeename = employeename;
		this.id = id;
		this.car = car;
		this.bike = bike;
		System.out.println(employeename+" "+id);
		System.out.println(car.carcolour+" "+car.carname+" "+car.carregno);
		System.out.println(bike.bikename+" "+bike.bikeregno);
		
		
	}

	public static void main(String[] args) {
		Car car1=new Car("white","Nexon","KL08BW5586");
		Bike bike1=new Bike("yamaha fz","KL088836");
		CarBike owner=new CarBike("ninu",7777,car1,bike1);
		
	}

}
