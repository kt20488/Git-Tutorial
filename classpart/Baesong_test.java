package classpart;

public class Baesong_test {

	public static void main(String[] args) {
		Baesong baesong = new Baesong() ;
			
		baesong.orderNum = 201907210001L;
		baesong.orderId = "abd123";
		baesong.orderDay = "2019년 07월 21일";
		baesong.orderName = "홍길순";
		baesong.orderpacNum = "PD0345-12";
		baesong.orderAddress ="서울시 영등포구 여의도동 20번지";
			

		System.out.println("주문번호 : " + baesong.orderNum);
		System.out.println("주문자 아이디 : " + baesong.orderId);
		System.out.println("주문날짜 : " + baesong.orderDay);
		System.out.println("주문자 이름 : " + baesong.orderName);
		System.out.println("주문 상품 번호 : " + baesong.orderpacNum);
		System.out.println("배송수조 : " + baesong.orderAddress);
	}

}
