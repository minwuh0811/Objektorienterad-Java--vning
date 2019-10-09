import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class cmdGeneration {
    public Scanner scanner;

    cmdGeneration(Scanner scanner){
        this.scanner=scanner;
    }

    public static void main(String[] args) {
        cmdGeneration cmdgeneration=new cmdGeneration(new Scanner(System.in));
        ArrayList<Character> serialCharacter = new ArrayList<>();
        int charMax = 90;
        int charMin = 65;
        int intMax = 57;
        int intMin = 48;
        for (int i = intMin; i <= intMax; i++) {
            serialCharacter.add((char) (i));
        }
        for (int i = charMin; i <= charMax; i++) {
            serialCharacter.add((char) (i));
        }

        System.out.println("How many block you want in your serial number?");;
        int block=cmdgeneration.scanner.nextInt();
        System.out.println("How many character you want in each block?");
        int CNumber = cmdgeneration.scanner.nextInt();

        System.out.println(cmdGeneration(serialCharacter,block, CNumber));
    }
        public static String cmdGeneration(ArrayList<Character> serialCharacter,int userInput,int intSerialN) {
            Random random = new Random();
            String serial ="";
            for (int j=0; j<userInput; j++) {
                String temp="";
                for (int i = 0; i < intSerialN; i++) {
                    int rand = random.nextInt(serialCharacter.size());
                    temp += serialCharacter.get(rand);
                }
                temp +="-";
                serial+=temp;
            }
            String finalserials="";
            for (int i=0; i<serial.length()-1; i++){
                finalserials+=serial.charAt(i);
            }
            return finalserials;
        }

    }



