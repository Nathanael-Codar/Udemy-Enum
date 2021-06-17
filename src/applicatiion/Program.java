package applicatiion;

import java.util.Date;

import entities.entidades_princip;
import entities.enums.entities_e;

public class Program {

	public static void main(String[] args) {
		entidades_princip ent = new entidades_princip(1080, new Date(), entities_e.PROCESSING);
		
		System.out.println(ent);
		
		entities_e os1 = entities_e.DELIVERED;
		entities_e os2 = entities_e.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
