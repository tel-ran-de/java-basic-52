package de.telrun.khakov.rustam.lesson6;

/**
 * @author Rustam Khakov
 */
public class Converter {
	// eur/usd = 1.02  -> 100eur = 102usd   -> 100 * 1.02
	// 100 usd -> 98.03 eur      =     100 / 1.02
	// из доллара в евро ->  toEur
	// из евро в доллар -> toUsd
	private double rate;

	public Converter(double rate) {
		this.rate = rate;
	}

	public double toEur(double usd){ //100
		return usd / this.rate; // ~98 eur
	}

	public double toUsd(double eur) {// 100
		return eur * this.rate;// 102 usd
	}


}
