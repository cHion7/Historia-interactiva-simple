package examen2;

import java.util.Scanner;

public class Historia2 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int dia = 1;
		int monedasPlata = 10;
		int monedasBroce = 80;
		int contador = 0;
		boolean ayudarMercader = false;
		boolean repeticion = true;
		System.err.println("Los cambios que cambien tu destino se mostraran en rojo");
		System.out.println("");
		System.out.println("Había una vez un intrépido aventurero llamado Eirik, cuya vida tomó un giro inesperado. ");
		System.out
				.println("L enfrentarse a un dragón furioso en las profundidades de un bosque oscuro, Eirik cayó ");
		System.out.println("sintiendo cómo la oscuridad lo envolvía.");
		System.out.println("Sin embargo, en ese momento de desesperación,");
		System.out
				.println("la diosa Freiren intervino. Con un destello de luz divina, Eirik volvió a abrir los ojos, ");
		System.out.println("pero no sin condiciones.");
		System.out.println("Freiren le encomendó una misión:");
		System.out.println(
				"1: recuperar un antiguo tesoro quele pertenecía y que yacía perdido en algún rincón del mundo");
		System.out.println("2: Y que su cuerpo seria controlado por un ser del mas alla");

		System.out.println("");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		while (repeticion == true) {
			System.out.println("DESPIERTA");
			System.out.println("ESTO ES UNA MENTERIA");
			System.out.println("DIA:1");

			System.out.println(
					" Abres los ojos y te encuentras en la ciudad Santa donde veneran a los 4 heroes legendarios,");
			System.out.println(
					"para poder pasar tu avantura tendras que venerar a uno de los heroes debido a la religion del continente");
			System.err.println(
					"Cual eliges 1:Heroe de la Espada, 2:Heroe del Arco, 3:Heroe de la lanza, 4:Heroe del Escudo ");
			int heroes = S.nextInt();
			switch (heroes) {
			case 1:
				System.out.println(
						"Al elegir al heroe de la espada se te otorgo una espada de bronce y unas pocimas de mana");
				System.out.println("No paso nada mas");
				String espada = "Espada";
				break;
			case 2:
				System.out.println(
						"Al elegir al heroe de la espada se te otorgo una arco de bronce y unas pocimas de mana");
				System.out.println("No paso nada mas");
				String arco = "Arco";
				break;
			case 3:
				System.out.println(
						"Al elegir al heroe de la lanza se te otorgo una lanza  de bronce y unas pocimas de curacion");
				System.out.println("No paso nada mas");
				String lanza = "Lanza";
				break;
			case 4:
				System.out.println("Al elegir al heroe de la espada se te otorgo un escudo.");
				System.out.println("Sientes una presencia, pero no sabes que es");
				String escudo = "Escudo";
				break;
			}

			System.out.println(
					"Al salir de la cuidad marcas tu rumbo a donde te dicto la diosa, a las regiones olvidadas del norte,");
			System.out.println("las cuales llevan desavitadas, desde el gran cataclismo, lo que provoco su estado.");
			System.out.println("Tienes 10 monedas de plata y 80 de bronce");
			System.out.println("");
			System.err.println("Alquilamos un carruage para llegar mas rapido por 8 monedas de plata SI/NO");
			String Carruage = S.next();

			if (Carruage.equals("SI")) {
				System.out.println("Era un timo y no viene nadie ademas de que pierdes la 8 monedas");
				monedasPlata -= 8;

			} else {
				System.out.println("Vas andando como todo un machote");

			}
			System.out.println("Mientras vas andando te encuntras un mercader que esta siendo atacado");
			System.out.println("Al no querer mas problemas intentas irte");
			System.out.println("Te alejas pero un palabra empieza a pasar por la cabaza hasta el punto que duele");
			System.out.println("Ayudale");
			do {
				System.err.println("¿Vas a ayudarle?");
				System.err.println("SI=1/NO=2");
				int ayudar = S.nextInt();

				if (ayudar == 1) {
					ayudarMercader = true;
				} else {
					System.out.println("Te duele más la cabeza");
				}

			} while (ayudarMercader != true);
			System.out.println("");
			System.out.println("Inesperadamente consiges salvarle ");
			System.out.println("Este te propone que lo protejas hasta que llege a la proxima ciudad");
			System.out.println("Tu aceptas a cambio de algo de oro");

			for (dia = 2; dia <= 17; dia++) {
				System.out.println("Dia " + dia);

			}

			System.out.println("Con el viaje perdiste 17 dias, te sientes cansado");
			System.out.println("Lo unico que piensases en dejar la aventura ");
			System.out.println("OLamentablemente la diosa se aburrio y ya no hace que continues tu aventura ");
			System.out.println("Una vez aventura termino recuerdas todas las cosas que has pasado");
			System.out.println("Se  el dinero que te queda "+monedasPlata+"monedas de plata y las de bronce no hace falata contarlas son muchas");
			System.out.println("Es un adios, cierras los ojos");
			System.err.println(" Unas ultimas palabras");
			String cerrar =S.next();
			if (cerrar.equals("CLOUSE")) {
				repeticion =false;
			}
		}
		System.out.println("Felicidades");
		System.out.println("Saliste de la simulacion");
	}
}