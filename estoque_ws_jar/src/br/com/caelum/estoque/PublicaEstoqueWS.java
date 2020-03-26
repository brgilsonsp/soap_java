package br.com.caelum.estoque;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {

	public static void main(String[] args) {

		final EstoqueWS service = new EstoqueWS();
		final String address = "http://localhost/estoque_ws";
		Endpoint.publish(address, service);
	}

}
