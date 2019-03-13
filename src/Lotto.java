import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private List<Integer> numbers = new ArrayList<>();
    private static final int MAX_NUMBERS = 6;
    private static final int NO_OF_NUMBERS = 49;

    public Lotto(){
        generate();
    }

    private void generate(){
        for (int i = 1; i < NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    public void randomize(){
        Collections.shuffle(numbers);
    }

    public int checkResult(List<Integer> userNumbers){
        List<Integer>lottoResult = numbers.subList(0,6);

        System.out.println("Wyniki losowania");
        for (Integer num: lottoResult){
            System.out.print(num + " ");
        }
        System.out.println();
        int found = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (lottoResult.contains(userNumbers.get(i))){
                found++;
            }
        }
        return found;
    }
}
