import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution{
    
    public Solution(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        readFile(in);
    }
    
    public static void main(String[] args){
        Solution solution = new Solution();
    }
    
    private void readFile(BufferedReader testCase){
        try(Stream<String> lines = testCase.lines().limit(2);){
            printResults(lines);
        }
    }
    
    private void printResults(Stream<String> streamOfFileLines){
        Optional<String> op = streamOfFileLines.skip(1).findFirst();
        op.ifPresent((z)->{
            List<String> list = new ArrayList<>(Arrays.asList(z.split("([ ])")));
            Collections.reverse(list);
            String join = list.stream().collect(Collectors.joining(" "));
            System.out.println(join);
        });
    }
}
