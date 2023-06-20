import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		ReservaHotel reserva1 = new Builder("Hotel Tambaú", "Josemo Júnior").setCheckIn(LocalDate.of(2023, 9, 5))
				.setCheckOut(LocalDate.of(2023, 9, 7)).setTipoQuarto("simples").setNumeroHospedes(2).build();

		ReservaHotel reserva2 = new Builder("Hotel Aruana", "Rayanne Clemente").setCheckIn(LocalDate.of(2023, 07, 07))
				.setCheckOut(LocalDate.of(2023, 07, 9)).setTipoQuarto("Presidencial").setNumeroHospedes(2).build();

		System.out.println(reserva1);
		System.out.println(reserva2);
	}
}

