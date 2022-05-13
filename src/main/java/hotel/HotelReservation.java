package hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class HotelReservation {
    
    public void main(String[] args) {
        String inputClient = getCheapestHotel("Em qual perfil de cliente você se encaixa? (Regular/Vip)");
		String inputStartDate = getCheapestHotel("Quando você iniciará a estadia? (DD/MM/YYYY)");
		String inputEndDate = getCheapestHotel("Até quando pretende ficar? (DD/MM/YYYY)");
		
		Client.valueOf(inputClient);
				
		Dates controller = new Dates();
		Date startDate = controller.toDate(inputStartDate);
		Date endDate = controller.toDate(inputEndDate);
		controller.getDate(startDate, endDate);

        ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
		hoteis.add(new Hotel("Lakewood", 3, 110, 90, 80, 80));
		hoteis.add(new Hotel("Bridgewood", 4, 160, 60, 110, 50));
		hoteis.add(new Hotel("Ridgewood", 5, 220, 150, 100, 40));
        
    }

    public String getCheapestHotel (String input) {
        System.out.print(input + " ");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
    }
}
