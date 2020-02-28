package org.tajetas.cliente.TarjetasClientes;

import java.util.List;

import org.tarjeta.digital.service.MarcaEnum;
import org.tarjeta.digital.service.Tarjeta;

/**
 * Hello world!
 * 
 * wsimport -keep -verbose
 * http://tarjetas-digitales.herokuapp.com/TarjetaService\?wsdl
 *
 */
public class App {

	public static void main(String[] args) {
		ClienteTarjetaDigitales cliente = new ClienteTarjetaDigitales();

		if (args[0].equals("--help")) {
			System.out.println("java -jar TarjetasClientes [crear] nombreTitular, nombreEntidad, numeroTarjeta, marca[VISA, MASTERCARD], fechaCaudicidad, cvv");
			System.out.println("java -jar TarjetasClientes [obtenerTarjeta] numeroTarjeta ");
			System.out.println("java -jar TarjetasClientes [eliminarTarjeta] numeroTarjeta");
			System.out.println("java -jar TarjetasClientes [obtenerTodas] ");
		} else if (args[0].equals("crear")) {
			Tarjeta tarjeta = new Tarjeta();

			tarjeta.setNombreTitular(args[1]);
			tarjeta.setNombreEntidad(args[2]);
			tarjeta.setNumeroTarjeta(args[3]);
			tarjeta.setMarca(args[4].equals(MarcaEnum.VISA.toString()) ? MarcaEnum.VISA : MarcaEnum.MASTERCARD);
			tarjeta.setFechaCaudicidad(args[5]);
			tarjeta.setCvv(args[6]);

			cliente.crearTarjeta(tarjeta);

		} else if (args[0].equals("obtenerTarjeta")) {
			Tarjeta tarjeta = cliente.obtenerTarjeta(args[1]);
			System.out.println(tarjeta);

		} else if (args[1].equals("eliminarTarjeta")) {
			cliente.eliminarTarjeta(args[1]);
		} else if (args[1].equals("obtenerTodas")) {
			List<Tarjeta> todas = cliente.obtenerTodas();
			for (Tarjeta tarjeta : todas) {
				System.out.println("Tarjeta: " + tarjeta);
			}
		} else {
			System.out.println("java -jar TarjetasClientes --help");
		}

	}
}
