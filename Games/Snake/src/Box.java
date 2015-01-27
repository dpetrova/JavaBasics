
public class Box {
	public int x, y; //������ �� �����
	public static final int BOX_SIZE = 20; //��������� �� Box-�
	
	//����������� - �� �� �������������� ����������� �� ����� ������ x, y
	public Box(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//���������� ����� ToString, ����� ��������� �� ������� ����� ����� ���� ������
	public String toString(){
		return "[x = " + x + ", y = " + y + "]";
	}
	
	//�����, ����� �� ��������� �� ���������� ��� Box-a �� �������� (� �� �� ����������)
	public boolean equals(Object obj){
		if (obj instanceof Box) { //���� �������� ���� ���� �� obj � �� ��� Box
			Box b = (Box) obj; //����� ������ b �� ��� Box ���� ������ obj ��� Box
			return (this.x == b.x && this.y == b.y); //����� ���� ���� � �� ����������� ���� ������� � � �� ������ ����� ���������; ������ �� �
		}
		return false; //��� �������� �� �� �������� ��� �������� ����� false
	}

}
