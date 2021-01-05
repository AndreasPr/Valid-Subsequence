import java.util.Arrays;
import java.util.List;

/**
 * Created on 05/Jan/2021 to ValidateSubsequence
 */
public class ValidSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int arrayLength = array.size();
        int sequenceLength = sequence.size();
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while( arrayIndex < arrayLength && sequenceIndex < sequenceLength){
            if(array.get(arrayIndex).equals(sequence.get(sequenceIndex))){
                sequenceIndex++;
            }
            arrayIndex++;
        }
        //if all characters of sequence were found
        return sequenceIndex == sequenceLength;
    }

    public static void main(String[] args){
        Integer arrayFirst[] = {1,2,3,4,5,6,7};
        Integer sequenceFirst[] = {1,2,3};

        List<Integer> array = Arrays.asList(arrayFirst);
        List<Integer> sequence = Arrays.asList(sequenceFirst);
        boolean res = isValidSubsequence(array, sequence);
        if(res){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
