import java.util.Scanner;

public class Generator {
    String temp = "";
    char[] serialNumber = new char[24];
    int selection;
    Scanner sc = new Scanner(System.in);


    public Generator() {
        System.out.println("System Online");
        String[] menuArray = new String[] {"Print x number of cd-keys", "Exit"};
        while (selection != menuArray.length) {
            System.out.println("["+1+"]"+menuArray[0]);
            System.out.println("["+2+"]"+menuArray[1]);
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Enter the number of cd-keys you want to create");
                    randomNumber(sc.nextInt());break;
                case 2:
                    System.out.println("Good bye");break;
            }
        }
    }



    public void randomNumber(int userInput) {
        String[] serialNumberArray = new String[userInput];
        int maxNum = 57;
        int minNum = 48;
        int maxCha = 90;
        int minCha = 65;
        int j, i;
        for (j=0; j < userInput; j++) {
            for (i = 0; i < serialNumber.length; i++) {
                if (i < 2 || i > 4 && i < 7 || i > 9 && i < 12 || i > 15 && i < 18 || i > 21 && i < 24) {
                    serialNumber[i] = (char) (Math.random() * (maxCha - minCha + 1) + minCha);
                } else if (i != 4 && i != 9 && i != 14 && i != 19) {
                    serialNumber[i] = (char) (Math.random() * (maxNum - minNum + 1) + minNum);
                } else {
                    serialNumber[i] = 45;
                }
                temp += serialNumber[i];
            }
            for (int k=0; k<serialNumberArray.length;k++)
                if (temp != serialNumberArray[k]) {
                    serialNumberArray[j] = temp;
                }

            temp = "";
            System.out.println(serialNumberArray[j]);
        }
    }
}
