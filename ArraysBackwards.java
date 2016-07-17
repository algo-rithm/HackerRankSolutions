import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution{

    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try(Stream<String> lines = in.lines().limit(2);){
                Optional<String> op = lines.skip(1).findFirst();
                op.ifPresent((z)->{
                    List<String> list = new ArrayList<>(Arrays.asList(z.split("([ ])")));
                    Collections.reverse(list);
                    String join = list.stream().collect(Collectors.joining(" "));
                    System.out.println(join);
                });
            }
    }
}
