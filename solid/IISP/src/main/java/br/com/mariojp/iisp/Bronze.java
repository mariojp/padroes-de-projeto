package br.com.mariojp.iisp;

public class Bronze extends Cliente{

	
	public double getDesconto(Double total) {
		return total * 0.05;
	}
}
