package entities;

public class CurrencyConverter {

	public static double totalPrice(double dolarCotation, double dolarQuantity) {
		return (dolarCotation * dolarQuantity) + ((dolarQuantity * 0.06) * dolarCotation);
	}
}
