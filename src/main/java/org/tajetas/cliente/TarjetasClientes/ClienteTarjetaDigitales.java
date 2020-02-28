package org.tajetas.cliente.TarjetasClientes;

import java.util.List;

import org.tarjeta.digital.service.Tarjeta;
import org.tarjeta.digital.service.TarjetaService;
import org.tarjeta.digital.service.TarjetaServiceImplService;

public class ClienteTarjetaDigitales {
	
	
	private TarjetaService tarjetaService;
	
	
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		tarjetaService = new TarjetaServiceImplService().getTarjetaServiceImplPort();
		System.out.println("Tarjeta creada con exito: ");
		return tarjetaService.creartargeta(tarjeta);
	}
	
	public List<Tarjeta> obtenerTodas() {
		tarjetaService = new TarjetaServiceImplService().getTarjetaServiceImplPort();
		return tarjetaService.obtenerTodas();
	}
	
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		tarjetaService = new TarjetaServiceImplService().getTarjetaServiceImplPort();
		return tarjetaService.obtenerTarjeta(numeroTarjeta);
	}
	
	public void eliminarTarjeta(String numeroTarjeta) {
		tarjetaService = new TarjetaServiceImplService().getTarjetaServiceImplPort();
		tarjetaService.eliminarTarjeta(numeroTarjeta);
		System.out.println("Tarjeta eliminada");
	}
	
	

}
