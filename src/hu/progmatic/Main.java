package hu.progmatic;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /// Arat, es nevet adni nekik.

        premises kitchen = new premises("Konyha");
        premises laundry = new premises("Mosoda");
        premises bathroom = new premises("Közös furdőszoba");
        // premises room = new premises("Room");
        premises generalRoom = new premises(15000, "Normál szoba");
        premises deluxeRoom = new premises(30000, "Első osztály szoba");
        premises presidentRoom = new premises(80000, "Elnöki lakosztály");
        premises honeymoonRoom = new premises(100000, "Nászutas lakosztály");

        // Elso osztalyu szoba:

        deluxeRoom.setTools(new Tool[]{
                new roomTool("Olvasólámpa", 8000, 10, true, true, false, false, false, false, false, false, false, false, true),
                new roomTool("Toll és papir", 200, 10, false, true, false, false, false, false, false, false, false, false, false),
                new roomTool("Asztal", 20000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Éjjeliszekreny", 40000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Kávéfőző, cukorral, tejjel.", 2000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Ingyen reggeli", 0, 10, false, false, false, false, false, false, false, false, false, false, true),
                new roomTool("Egyszemélyes ágy", 180000, 10, false, true, false, true, false, false, false, false, false, false, true),
                new roomTool("Televizió", 120000, 10, true, true, false, true, false, false, false, false, false, false, true),
                new roomTool("Kanapé", 180000, 10, false, false, false, true, false, false, false, false, false, false, true),
                new roomTool("Irodai szék", 80000, 10, false, false, false, true, false, false, false, false, false, false, true)});

        ///Elnoki lakosztaly:

        presidentRoom.setTools(new Tool[]{
                new roomTool("Olvasólámpa", 8000, 10, true, true, false, false, false, false, false, false, false, false, true),
                new roomTool("Toll és papir", 200, 10, false, true, false, false, false, false, false, false, false, false, false),
                new roomTool("Asztal", 20000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Éjjeliszekreny", 40000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Kávéfőző, cukorral, tejjel.", 2000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Ingyen reggeli", 0, 10, false, false, false, false, false, false, false, false, false, false, true),
                new roomTool("Kétszemélyes ágy", 180000, 10, false, true, false, true, false, false, false, false, false, false, true),
                new roomTool("Televizió", 120000, 10, true, true, false, true, false, false, false, false, false, false, true),
                new roomTool("Kanapé", 180000, 10, false, false, false, true, false, false, false, false, false, false, true),
                new roomTool("Irodai szék", 80000, 10, false, false, false, true, false, false, false, false, false, false, false),
                new roomTool("Ingyenes sofőrszolgálat", 0, 10, false, true, false, false, false, false, false, false, false, true, true),
                new roomTool("Ingyenes mosoda", 0, 10, false, true, false, false, false, false, false, false, true, false, true),
                new roomTool("Gyümölcskosár", 0, 10, true, true, false, false, false, true, false, false, false, false, true),
                new roomTool("Pezsgő", 0, 10, false, true, false, false, true, false, false, false, false, false, true),
                new roomTool("Játékkonzol", 185000, 10, true, true, false, true, false, false, false, false, false, false, true),
                new roomTool("Teljesen felszerelt ingyenes minibár", 0, 10, true, true, false, false, false, false, false, false, false, false, true),});

        ///Naszutas lakosztaly:

        honeymoonRoom.setTools(new Tool[]{
                new roomTool("Olvasólámpa", 8000, 10, true, true, false, false, false, true, true, true, true, false, true),
                new roomTool("Toll és papir", 200, 10, false, true, false, false, false, false, false, false, false, false, false),
                new roomTool("Asztal", 20000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Éjjeliszekreny", 40000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Kávéfőző, cukorral, tejjel.", 2000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Ingyen reggeli", 0, 10, false, false, false, false, false, false, false, false, false, false, true),
                new roomTool("Kétszemélyes ágy", 180000, 10, false, true, false, true, false, false, false, false, false, false, true),
                new roomTool("Televizió", 120000, 10, true, true, false, true, false, false, false, false, false, false, true),
                new roomTool("Kanapé", 180000, 10, false, false, false, true, false, false, false, false, false, false, true),
                new roomTool("Virágszirom", 0, 10, false, false, false, false, false, true, true, true, true, false, true),
                new roomTool("Epres csokoládé", 0, 10, true, true, false, false, false, true, true, true, true, false, true),
                new roomTool("Pezsgő", 0, 10, false, false, false, false, false, true, true, true, true, false, true),
                new roomTool("Gyümolcskosár", 0, 10, false, true, false, false, false, true, true, true, true, false, true),});

        /// Atlagos szoba:

        generalRoom.setTools(new Tool[]{
                new roomTool("Olvasólámpa", 8000, 10, true, true, false, false, false, false, false, false, false, false, false),
                new roomTool("Toll és papir", 200, 10, false, true, false, false, false, false, false, false, false, false, false),
                new roomTool("Asztal", 20000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Éjjeliszekreny", 40000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Kávéfőző, cukorral, tejjel.", 2000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new roomTool("Irodaiszék", 80000, 10, false, false, false, false, false, false, false, false, false, false, true),
                new roomTool("Egyszemélyes ágy", 180000, 10, false, true, false, true, false, false, false, false, false, false, true)});

        kitchen.setTools(new Tool[]{
                new kitchenTool("Kés", 10, 10, false, true, false, false, false, false, false, false, false, false, false),
                new kitchenTool("Villa", 10, 10, false, true, false, false, false, false, false, false, false, false, false),
                new kitchenTool("Kanál", 10, 10, false, true, false, false, false, false, false, false, false, false, false),
                new kitchenTool("Tányér", 10, 10, false, true, false, false, false, false, false, false, false, false, false),
                new kitchenTool("Mosogató", 100000, 10, false, true, false, false, false, false, false, false, false, false, false),
                new kitchenTool("Mikrohullámú sütő", 10, 10, false, true, false, false, false, false, false, false, false, false, false),
                new kitchenTool("Kávéfőző", 100000, 10, false, true, false, false, false, false, false, false, false, false, false)});

        bathroom.setTools(new Tool[]{
                new bathroomTool("Szappan", 100, 10, false, true, false, false, false, false, false, false, false, false, false),
                new bathroomTool("Wc papir", 100, 10, false, true, false, false, false, false, false, false, false, false, false),
                new bathroomTool("Kéztörlő", 1000, 10, false, true, false, false, false, false, false, false, false, false, false),
                new bathroomTool("Nagy törölköző", 2000, 10, false, true, false, false, false, false, false, false, false, false, false),
                new bathroomTool("Sampon", 100, 10, false, true, false, false, false, false, false, false, false, false, false),
                new bathroomTool("Kondicionáló", 100, 10, false, true, false, false, false, false, false, false, false, false, false),
                new bathroomTool("Hajszáritó", 10000, 10, true, true, false, false, false, false, false, false, false, false, false),});

        laundry.setTools(new Tool[]{
                new laundryTool("Mosógép", 100000, 10, true, true, false, true, false, false, false, false, false, false, false),
                new laundryTool("Mosószer", 1000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new laundryTool("Hajtogató asztal", 10000, 10, false, true, false, true, false, false, false, false, false, false, false),
                new laundryTool("Szennyes tároló", 50000, 10, false, true, false, false, false, false, false, false, false, false, false),});

        // Szobak: 20 Atlagos szoba 20 , Elso osztalyu szoba , 2 elnoki lakosztaly , 4 naszutas lakosztaly.

        premises[] rooms = new premises[]{
                generalRoom, generalRoom, generalRoom, generalRoom, generalRoom, generalRoom, generalRoom, generalRoom,
                generalRoom, generalRoom, generalRoom, generalRoom, generalRoom, generalRoom, generalRoom, generalRoom,
                generalRoom, generalRoom, generalRoom, generalRoom,
                deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom,
                deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom, deluxeRoom,
                deluxeRoom, deluxeRoom,
                presidentRoom, presidentRoom,
                honeymoonRoom, honeymoonRoom, honeymoonRoom, honeymoonRoom
        };


        myHotel hotel = new myHotel(rooms, kitchen, laundry, bathroom);

        /// Program:
        System.out.println();
        System.out.println("Üdvözöljük a Mi kis hotelünkben!");
        System.out.println();
        System.out.println("Nálunk található, többfajta szoba, közös mosoda, konyha, és vendég mosdó.");
        System.out.println();


        Scanner enter = new Scanner(System.in);
        System.out.println("Szeretne megszállni? (igen/nem)");
        String stay = enter.nextLine();
        if (stay.equalsIgnoreCase("igen")) {
            System.out.println("Köszönöm.");
        } else {
            System.out.println("Köszönjük érdeklődését, viszontlátásra.");
        }

            System.out.println("Hány éjszakát szeretne? ");
            Scanner scanner = new Scanner(System.in);
            int nights = scanner.nextInt();

            System.out.println("A szoba tipusok:" + '\n' + "1, Normál szoba." + '\n' + "2, Első osztály" + '\n' + "3, Elnöki lakosztály" + '\n' + "4, Nászuitas lakosztály");


            System.out.println("Kérem válasszon szobatipust:");
            Scanner type = new Scanner(System.in);
            int roomType = type.nextInt();

            // Kiszamolni a teljes tartozkodast:

            int stayDeluxe = deluxeRoom.getPrice() * nights;
            int stayPresident = presidentRoom.getPrice() * nights;
            int stayHoneymoon = honeymoonRoom.getPrice() * nights;
            int stayGeneral = generalRoom.getPrice() * nights;


            switch (roomType) {
                case 1 -> {
                    System.out.println("A Normál szobát választottad.");
                    System.out.println("Egy éjszaka " + generalRoom.getPrice() + " Ft-ba kerul.");
                    System.out.println();
                    System.out.println("A teljes tartózkodás " + stayGeneral + " Ft-ba fog kerülni.");
                }
                case 2 -> {
                    System.out.println("Az Első osztályú szobát választottad.");
                    System.out.println("Egy éjszaka " + deluxeRoom.getPrice() + " Ft-ba kerul.");
                    System.out.println();
                    System.out.println("A teljes tartózkodás " + stayDeluxe + " Ft-ba fog kerülni.");
                }
                case 3 -> {
                    System.out.println("Az elnöki lakosztályt választottad.");
                    System.out.println("Egy éjszaka " + presidentRoom.getPrice() + " Ft ba kerul.");
                    System.out.println();
                    System.out.println("A teljes tartózkodás " + stayPresident + " Ft ba fog kerülni.");
                }
                case 4 -> {
                    System.out.println("A Nászutas lakosztályt választottad");
                    System.out.println("Egy éjszaka " + honeymoonRoom.getPrice() + " Ft ba kerul.");
                    System.out.println();
                    System.out.println("A teljes tartózkodás " + stayHoneymoon + " Ft ba fog kerülni.");
                }
                default -> System.out.println("Nincs ilyen szoba.");
            }


        }
    }


