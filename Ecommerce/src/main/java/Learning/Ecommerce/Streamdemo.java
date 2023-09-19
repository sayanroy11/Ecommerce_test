package Learning.Ecommerce;

import java.util.ArrayList;

public class Streamdemo {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Shyam");
		a.add("Jaya");
		a.add("Nemac");
		a.add("Soumi");
		a.stream().filter(s->s.length()>0).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//System.out.println(c);
	}

}
