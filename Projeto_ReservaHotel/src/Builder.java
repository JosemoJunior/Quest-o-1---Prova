import java.time.LocalDate;

public class Builder {
	private ReservaHotel reserva;

	public Builder(String hotel, String hospede) {
		reserva = new ReservaHotel(hotel, hospede);
	}

	public Builder setCheckIn(LocalDate checkIn) {
		reserva.setCheckIn(checkIn);
		return this;
	}

	public Builder setCheckOut(LocalDate checkOut) {
		reserva.setCheckOut(checkOut);
		return this;
	}

	public Builder setTipoQuarto(String tipoQuarto) {
		reserva.setTipoQuarto(tipoQuarto);
		return this;
	}

	public Builder setNumeroHospedes(int numeroHospedes) {
		reserva.setNumeroHospedes(numeroHospedes);
		return this;
	}

	public ReservaHotel build() {
		return reserva;
	}
}