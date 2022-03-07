import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Range range = new Range();
        int n = 256000000; // Enter different n^th values 
        int[] testArr = new int[n];
        for(int x = 0; x < n; x++){
            testArr[x] = (int)((Math.random()*100)+1);
        }

        long startOne = System.currentTimeMillis();
        range.rangeOne(testArr);
        long endOne = System.currentTimeMillis();
        //System.out.println("Elapsed Time in milli seconds: "+ (endOne-startOne));
        System.out.printf("VersionOne at n = %d: %d Milliseconds\n", n, (endOne-startOne));

        long startTwo = System.currentTimeMillis();
        range.rangeTwo(testArr);
        long endTwo = System.currentTimeMillis();
        //System.out.println("Elapsed Time in milli seconds: "+ (endTwo-startTwo));
        System.out.printf("VersionTwo at n = %d: %d Milliseconds\n", n, (endTwo-startTwo));

        long startThree = System.currentTimeMillis();
        range.rangeThree(testArr);
        long endThree = System.currentTimeMillis();
        System.out.printf("VersionThree at n = %d: %d Milliseconds\n", n, (endThree-startThree));

    }
}
