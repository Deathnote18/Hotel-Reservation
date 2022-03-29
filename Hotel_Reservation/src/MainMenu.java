import api.HotelResource;
import api.AdminResource;
import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;
import service.ReservationService;
import service.CustomerService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;


public class MainMenu {


    private static AdminResource adminResourceInstance = AdminResource.getInstance();
    private static HotelResource hotelResourceInstance = HotelResource.getInstance();
    private static Collection<Reservation> reservationHashSet = new HashSet<>();
    private static Collection<IRoom> roomNotOccupiedHashSet = new HashSet<>();
    private static Collection<Customer> customersHashset = new HashSet<>();


    private static MainMenu mainMenuInstance = null;
    private MainMenu() {}
    public static MainMenu getInstance(){
        if (null == mainMenuInstance){
            mainMenuInstance = new MainMenu();
        }
        return mainMenuInstance;
    }


    static Scanner mainMenuScanner = new Scanner(System.in);
//    String mainMenuScannerSwitch = mainMenuScanner.nextLine();


    public static void startMainMenu() {
       boolean keepRunning = true;


        while (keepRunning) {

            try {
                System.out.println("Welcome to the one of the WORLD GREATEST HOTEL \n Please choose one of the options below \n ====================================\n");
                System.out.println("1. Find & Reserve a room. ");
                System.out.println("2. See my reservations. ");
                System.out.println("3. Create an account. ");
                System.out.println("4. Admin. ");
                System.out.println("5. Exit. ");
                int selection = Integer.parseInt(mainMenuScanner.nextLine());


                switch (selection){
                    case 1:
                        findAndReservedRoom();
                        keepRunning = false;

                }
            }








        }
    }


    public static void findAndReservedRoom(){

    }



    public static void seeMyReservation(){


        String customerEmail = getEmail;
        reservationHashSet = hotelResourceInstance.getCustomerReservation(customerEmail);
        if (reservationHashSet.isEmpty()){
            System.out.println("Sorry, there are not reservation under this email: " + customerEmail);
        }else{
            for (Reservation customerReservation: reservationHashSet) {
                System.out.println(customerReservation);
            }
        }

    }


}
