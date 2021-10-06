import java.util.Scanner;
import java.util.*;
import java.io.*;

class Main {

  //sort the list using selection array
  //Time Complexity: O(n2) as there are two nested loops.
  void selectionSort(int arrlist[])
    {
        int n = arrlist.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minNum = i;
            for (int j = i+1; j < n; j++)
                if (arrlist[j] < arrlist[minNum])
                    minNum = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arrlist[minNum];
            arrlist[minNum] = arrlist[i];
            arrlist[i] = temp;
        }
    }

    //Function to sort array using insertion sort
    void insertionSort(int arrlist[])
    {
        int n = arrlist.length;
        for (int i = 1; i < n; ++i) {
            int key = arrlist[i];
            int j = i - 1;
 
            /* Move elements of arrlist[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arrlist[j] > key) {
                arrlist[j + 1] = arrlist[j];
                j = j - 1;
            }
            arrlist[j + 1] = key;
        }
    }

    //Function to sort array using shell sort
    int shellSort(int arrlist[])
    {
        int n = arrlist.length;
 
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arrlist[i];
 
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arrlist[j - gap] > temp; j -= gap)
                    arrlist[j] = arrlist[j - gap];
 
                // put temp (the original a[i]) in its correct
                // location
                arrlist[j] = temp;
            }
        }
        return 0;
    }



    // prints the list sorted
    void printArray(int arrlist[])
    {
        int n = arrlist.length;
        for (int i=0; i<n; ++i)
            System.out.print(arrlist[i]+" ");
        System.out.println();
    }

  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);
    Main myOb = new Main();

    System.out.println("This program only allows a list of 5 Elements");

    

    // Declaring the ArrayList with
    // initial size numList
    //ArrayList<Integer> arrli = new ArrayList<Integer>();

    
    System.out.println("Enter elements in array list");

    int ele1 = myObj.nextInt();
    int ele2 = myObj.nextInt();
    int ele3 = myObj.nextInt();
    int ele4 = myObj.nextInt();
    int ele5 = myObj.nextInt();
    //int ele6 = myObj.nextInt();
    //int ele7 = myObj.nextInt();
    //int ele8 = myObj.nextInt();
    //int ele9 = myObj.nextInt();
    //int ele10 = myObj.nextInt();

    


    

    

    //create an arraylist
    int arrlist[] = {ele1, ele2, ele3, ele4, ele5};

    // Printing elements
    System.out.println("This is the unsorted list typed in: ");
    myOb.printArray(arrlist);

    System.out.println("Type 1 for Selection Sort");
    System.out.println("Type 2 for Insertion Sort");
    System.out.println("Type any other NUMBER for Shell Sort");

    int selection = myObj.nextInt();

    if(selection == 1){
      //sort the list using selection sort
      myOb.selectionSort(arrlist);

      System.out.println("The list has been sorted using Selection Sort: ");
      myOb.printArray(arrlist);

    } 
    
    else if(selection == 2){
      //sort the list using insertion sort
      myOb.insertionSort(arrlist);

      System.out.println("The list has been sorted using Insertion Sort: ");
      myOb.printArray(arrlist);

    }

    else{
      //sort the list using insertion sort
      myOb.shellSort(arrlist);

      System.out.println("The list has been sorted using Shell Sort: ");
      myOb.printArray(arrlist);

    }


    

    

    
    

    
  }


}