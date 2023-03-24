import java.util.Scanner;

public class Bad {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
	    String sentence;
		String[] bad_words = {"fuck", "daug", "nigga", "motherfucker", "bitch"};
        System.out.print("Type a sentence: ");
		sentence = scan.nextLine();

        int num_bad = 0;
        for (int i = 0; i < bad_words.length; i++){
            if (sentence.toLowerCase().contains(bad_words[i].toLowerCase())){
                num_bad++;
            }
        }
        if (num_bad != 0){
            System.out.println("There are " + num_bad + " number of bad words in the sentence");
        }
        else{
            System.out.println("There are no bad words in the sentence.");
        }
    
    
    }
}
