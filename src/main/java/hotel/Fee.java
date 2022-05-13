package hotel;
public class Fee {
    Hotel hotel;
    Double fee;

    public Fee(Hotel hotel, Double fee) {
        this.hotel = hotel;
        this.fee = fee;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Double getFee() {
        return fee;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
	public String toString() {
		return this.getHotel().getName() + ", price: " + this.getFee();
	}
}
