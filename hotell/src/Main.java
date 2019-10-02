import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    private ArrayList<SingleRoom> singleRooms=new ArrayList<>();
    private ArrayList<DoubleRoom> doubleRooms=new ArrayList<>();


    public Main(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Main main=new Main(new Scanner(System.in));
        while (true) {
            System.out.println("Are you are Customer or Administrator? Press 1, Customer; Press 2 Administrator; Press 3 Exist");
            int Choice = Integer.parseInt(main.getLine());
            switch (Choice) {
                case 1:
                    System.out.println("Which type of room you want to book? Press 1, Single Room; Press 2, Double Room");
                    int roomChoice = Integer.parseInt(main.getLine());
                    switch (roomChoice) {
                        case 1:
                            if (main.singleRooms.size()>0) {
                                for (SingleRoom room : main.singleRooms) {
                                    if (room.isStates()) {
                                        room.printRoom();
                                    }
                                }
                                System.out.println("Choose one room.");
                                String roomChoose = main.getLine();
                                for (SingleRoom room : main.singleRooms) {
                                    if (room.getName().equals(roomChoose)) {
                                        System.out.println("The room below is choosen: ");
                                        room.setStates(false);
                                        room.printRoom();
                                    }
                                }
                            } else {
                                System.out.println("no single room available now");
                            }
                            break;
                        case 2:
                            if (main.singleRooms.size()>0) {
                            for (DoubleRoom room: main.doubleRooms) {
                                if (room.isStates()){
                                    room.printRoom();
                                }
                            }
                            System.out.println("Choose one room.");
                            String roomChoose=main.getLine();
                            for (DoubleRoom room:main.doubleRooms){
                                if (room.getName().equals(roomChoose)) {
                                    System.out.println("The room below is choosen: ");
                                    room.setStates(false);
                                    room.printRoom();
                                }
                            }} else {
                                System.out.println("there is no double room available.");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("What do you want to do? press 1, add room, press 2, list room");
                    int adminChoice = Integer.parseInt(main.getLine());
                    switch (adminChoice) {
                        case 1:
                            System.out.println("Name of the room.");
                            String roomName = main.getLine();
                            System.out.println("Price for the room");
                            int roomPrice = Integer.parseInt(main.getLine());
                            System.out.println("Possible to add bad for child. press 1 yes, press 2 no");
                            int badAddChoice = Integer.parseInt(main.getLine());
                            boolean badForKid = true;
                            if (badAddChoice == 1) {
                                badForKid = true;
                            } else if (badAddChoice == 2) {
                                badForKid = false;
                            }
                            System.out.println("Press 1, Single room and Press 2 Double room");
                            int roomSize = Integer.parseInt(main.getLine());
                            if (roomSize == 1) {
                                SingleRoom singleRoom = new SingleRoom(roomPrice, badForKid, roomName);
                                main.singleRooms.add(singleRoom);
                            } else if (roomSize == 2) {
                                DoubleRoom doubleRoom = new DoubleRoom(roomPrice, badForKid, roomName);
                                main.doubleRooms.add(doubleRoom);
                            }
                            break;
                        case 2:
                            for (DoubleRoom room : main.doubleRooms) {
                                room.printRoom();
                            }
                            for (SingleRoom room:main.singleRooms)
                                room.printRoom();
                            break;
                    }
                    break;

                case 3:
                    return;
                default:
                    System.out.println("Not valid Input!!");
            }
        }


    }

    public String getLine(){
        return scanner.nextLine();
    }



}
