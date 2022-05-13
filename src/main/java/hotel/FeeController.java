package hotel;

import static hotel.Client.Regular;
import static hotel.Client.Rewards;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeeController {
    
    public Fee getBestFee(Client client, List<Date> dateList, List<Hotel> hotelList) {

        List<Fee> listFee = new ArrayList<Fee>();
        for(Hotel hotel : hotelList) {
			Fee fee = calculateFee(client, dateList, hotel);
			listFee.add(fee);
		}

		Fee lowestFee = calculateLowestFee(listFee);
		return lowestFee;
    }

    private Fee calculateFee(Client client, List<Date> dateList, Hotel hotel) {

		Dates date = new Dates();
		Double price = 0d;
		for (Date data : dateList) {
			if (client == Regular) {
				if (date.isWeekend(data)) {
					price += hotel.getRegularWeekendFee();
				} else {
					price += hotel.getRegularDailyFee();
				}
			} else if (client == Rewards) {
				if (date.isWeekend(data)) {
					price += hotel.getRewardsWeekendFee();
				} else {
					price += hotel.getRewardsDailyFee();
				}
			}
		}

		Fee fee = new Fee(hotel, price);

		return fee;
	}

	private Fee calculateLowestFee(List<Fee> listFee) {
		int auxLowestFee;
		int auxFee;
		Fee lowestFee = null;

		for (Fee fee : listFee) {
			auxFee = fee.getHotel().getClassification();
			auxLowestFee = lowestFee.getHotel().getClassification();
			if (lowestFee == null || fee.getFee() < lowestFee.getFee()) {
				lowestFee = fee;
				
			} else if (fee.getFee().equals(lowestFee.getFee()) && auxFee > auxLowestFee) {
				lowestFee = fee;
			}
		}
		return lowestFee;
	}

    private static Hotel getHotelName(String name, ArrayList<Hotel> hotels) {
        for (Hotel hotel: hotels) {
            if (hotel.getName().equals(name)) {
                return hotel;
            }
        }
        return null;
    }
}
