import java.time.LocalDate;

public class ReservaHotel {
	private String hotel;
	private String hospede;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private String tipoQuarto;
	private int numHospedes;

	public ReservaHotel(String hotel, String hospede) {
		this.hotel = hotel;
		this.hospede = hospede;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public void setNumeroHospedes(int numeroHospedes) {
		this.numHospedes = numeroHospedes;
	}

	@Override
	public String toString() {
		return "Reserva{" + "hotel='" + hotel + '\'' + ", hospede='" + hospede + '\'' + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + ", tipoQuarto='" + tipoQuarto + '\'' + ", numeroHospedes=" + numHospedes
				+ '}';
	}
}