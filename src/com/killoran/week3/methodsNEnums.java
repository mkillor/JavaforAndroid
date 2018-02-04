package com.killoran.week3;
import java.util.*;


/**
 * Created by MK on 1/31/2018.
 *
 * Talk about methods ex.
 * just running a basic void String hello world method with no parameters
 * addingNumbers() method. It is still a method just doesn't seem very useful.
 *
 *
 */


public class methodsNEnums {


    static List<Integer> addEntries(int number, List<Integer> list){
        for (int i = 0; i < number; i++)
            list.add(i);
        return list;
    }

    static long benchmarkAddList(int entries, List<Integer> testList) {
        long startTime = System.currentTimeMillis();
        addEntries(entries, testList);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    static long benchmarkIterateList(int entries, List<Integer> testList) {
        addEntries(entries, testList);
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (int entry: testList) {
            sum += entry;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    static void benchmark() {
        int testEntries = 1000000;  //1 million
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long arrayAddTime = benchmarkAddList(testEntries, arrayList);
        long linkedAddTime = benchmarkAddList(testEntries, linkedList);

        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();

        long arrayIterateTime = benchmarkIterateList(testEntries, arrayList);
        long linkedIterateTime = benchmarkIterateList(testEntries, linkedList);

        System.out.println("Time (ms) to add to ArrayList: " + arrayAddTime);
        System.out.println("Time (ms) to add to LinkedList: " + linkedAddTime);
        System.out.println("Time (ms) to iterate ArrayList: " + arrayIterateTime);
        System.out.println("Time (ms) to iterate LinkedList: " + linkedIterateTime);

    }
    public static void main(String[] args) {
        /* ........... Normal Array............. */
        // Need to specify the size for array
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // We cannot add more elements to array arr[]

        /*............ArrayList..............*/
        // Need not to specify size
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(4);
        arrL.indexOf(2);
        // We can add more elements to arrL

        System.out.println(arrL);
        System.out.println(Arrays.toString(arr));
        benchmark();
    }

    static void helloWorld(){     //mention no values are being passed in and no values are being returned!no semicolon.
        System.out.println("Hello World");
    }

    static void helloName(String name){//mention passing a value into the method.
        System.out.println("Hello, " + name);
    }
    static void addingNumbers(){ //talk about adding numbers method again void and no parameters or values being passed.
        int a = 10;                 //also mention again there are no return values.
        int b = 20;                 //mention scope and demonstrate what would happen if you moved a and b outside
                                    // the method it would not run
        System.out.println(a + b);  //the scope deals with where the variable is declared not initialized.
                                    //go ahead and try to declare a variable at the top of page
                                    //global or class variables can be used at the top outside the method but need
                                    //static keyword ex:static int a
    }

    static void add(int a, int b){  //lets do something more useful and pass values into a method. Still no return type
        System.out.println(a + b);  //note the signature is very important. add int a int b. change a to "t" and see
                                    //the result. IntelliSense will show there is an error
    }

    static void add(int a, int b, int c){//talk about overloading methods and how the computer looks at the name and
                                    //data types to determine which method to run. Still no return type.
        System.out.println(a + b + c);
    }

    static int square(int a){
                                    //Notice that when this value returns it does not display to the user!Ean
                                    //A variable need to be stored in the main and then you can view it ina sys out.
        return a * a;
    }


    //explain enums like an array of constant values. similar to a class with how it is declared.


    enum DIRECTION {NORTH, WEST, EAST, SOUTH};              //here we have the array of constants situation.

    static void describeWind(DIRECTION windDirection) {
        switch (windDirection) {
            case NORTH:
                System.out.println("The wind is blowing from the north.");
                break;
            case WEST:
                System.out.println("The wind is blowing from the west.");
                break;
            case EAST:
                System.out.println("The wind is blowing from the east.");
                break;
            case SOUTH:
                System.out.println("The wind is blowing from the south.");
                break;
        }
    }








}


