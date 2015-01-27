
public class Box {
	public int x, y; //полета на класа
	public static final int BOX_SIZE = 20; //размерите на Box-а
	
	//конструктор - за да инициализираме стойностите на двете полета x, y
	public Box(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//дефинираме метод ToString, който позволява да виждаме нашия обект като стринг
	public String toString(){
		return "[x = " + x + ", y = " + y + "]";
	}
	
	//метод, който ни позволява да сравняваме два Box-a по стойност (а не по референция)
	public boolean equals(Object obj){
		if (obj instanceof Box) { //това сравнява дали типа на obj е от тип Box
			Box b = (Box) obj; //прави обекта b от тип Box като каства obj към Box
			return (this.x == b.x && this.y == b.y); //върни дали моят х на квадратчето дали съвпада с х на обекта който сравнявам; същото за у
		}
		return false; //ако обектите са от различен тип директно връща false
	}

}
