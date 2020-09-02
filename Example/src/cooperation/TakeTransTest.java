package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentK = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(100);
		Subway subwayGreen= new Subway(2);
		Subway subwayBlue= new Subway(4);
		
		
		studentK.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentK.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		
		subwayGreen.showSubwayInfo();

	}

}
