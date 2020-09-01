package classexam;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.ordernum="201907210001";
		order.id="abc123";
		order.date="2019년 7월 21일";
		order.name="홍길순";
		order.monoorder="PD0345-12";
		order.Adress="서울시 영등포구 여의도동 20번지";
		
		System.out.println(order.ordernum);
	}

}
