package classpart;

public class Baesong_test {

	public static void main(String[] args) {
		Baesong baesong = new Baesong() ;
			
		baesong.orderNum = 201907210001L;
		baesong.orderId = "abd123";
		baesong.orderDay = "2019�� 07�� 21��";
		baesong.orderName = "ȫ���";
		baesong.orderpacNum = "PD0345-12";
		baesong.orderAddress ="����� �������� ���ǵ��� 20����";
			

		System.out.println("�ֹ���ȣ : " + baesong.orderNum);
		System.out.println("�ֹ��� ���̵� : " + baesong.orderId);
		System.out.println("�ֹ���¥ : " + baesong.orderDay);
		System.out.println("�ֹ��� �̸� : " + baesong.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + baesong.orderpacNum);
		System.out.println("��ۼ��� : " + baesong.orderAddress);
	}

}
