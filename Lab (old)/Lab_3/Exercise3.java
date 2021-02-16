import java.util.Scanner;

class Exercise3 {
    String alterString(String s){
        String finalString = "";
        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);

            if(c == "A" || c == "E" || c =="I" || c =="O" || c=="U"){
                finalString += c;
            }
            else {
                finalString +=
            }

        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();


    }
}