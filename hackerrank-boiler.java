import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public Solution(int num){
      BufferedReader in = new BufferedReader(InputStreamReader(System.in));
      solution.readfile(in, num);
    }

    public static void main(String[] args) {
        //set number of lines to read, if ? then use 0
        Solution solution = new Solution(1);
    }

    private void readfile(BufferedReader testCase, int numOfLines){
        try(Stream<String> lines = testCase.lines(){
            printResults(lines, numOfLines);
        }
    }

    private void printResults(Steam<String> streamOfFileLines, int numOfLines){
      if(numOfLines == 1){
        
      }
        
    }
}
