import java.util.*;
import java.io.*;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Sorting{
   
   public int pivot;
   public static long quickCounter = 0;
   public static long mergeCounter= 0;
   public static long insertionCounter = 0;
   public static long exchangeCounter = 0;
   
   public static void fileWriter(String fileName, int size){
      try{   
         PrintWriter myPW = new PrintWriter(fileName);
         
         for (int i = 0; i <= size; i++) {
            int x = (int) (Math.random() * size);
            //System.out.println(x);
            
            myPW.println(x);
         }
         myPW.close();
      }   
      catch (FileNotFoundException e){
         System.out.println("ERROR: " + e);
      }
   }
   
   public static void fileWriterOrd(String fileName, int size){
      try{   
         PrintWriter myPW = new PrintWriter(fileName);
         
         for (int i = 0; i <= size; i++) {
            int x = i;
            //System.out.println(x);
            
            myPW.println(x);
         }
         myPW.close();
      }   
      catch (FileNotFoundException e){
         System.out.println("ERROR: " + e);
      }
   }
   
   public static void fileWriterRev(String fileName, int size){
      try{   
         PrintWriter myPW = new PrintWriter(fileName);
         
         for (int i = 0; i <= size; i++) {
            int x = size-i;
            //System.out.println(x);
            
            myPW.println(x);
         }
         myPW.close();
      }   
      catch (FileNotFoundException e){
         System.out.println("ERROR: " + e);
      }
   }
   
   public static void fileNameSize(){
      
      //I am embarrassed that i did not do a for loop.
      //Dumb.
      
      String file = "file10.txt";
      int size = 10;
      fileWriter(file, size);
      
      file = "file100.txt";
      size = 100;
      fileWriter(file,size);
      
      file = "file1000.txt";
      size = 1000;
      fileWriter(file,size);
      
      file = "file5000.txt";
      size = 5000;
      fileWriter(file,size);
      
      file = "file10000.txt";
      size = 10000;
      fileWriter(file,size);
      
      file = "file15000.txt";
      size = 15000;
      fileWriter(file,size);
      
      file = "file20000.txt";
      size = 20000;
      fileWriter(file,size);
      
      file = "file25000.txt";
      size = 25000;
      fileWriter(file,size);
      
      file = "file30000.txt";
      size = 30000;
      fileWriter(file,size);
      
      file = "file35000.txt";
      size = 35000;
      fileWriter(file,size);
      
      file = "file40000.txt";
      size = 40000;
      fileWriter(file,size);
      
      file = "file45000.txt";
      size = 45000;
      fileWriter(file,size);
      
      file = "file50000.txt";
      size = 50000;
      fileWriter(file,size);
      
      file = "file55000.txt";
      size = 55000;
      fileWriter(file,size);
      
      file = "file60000.txt";
      size = 60000;
      fileWriter(file,size);
      
      file = "file65000.txt";
      size = 65000;
      fileWriter(file,size);
      
      file = "file70000.txt";
      size = 70000;
      fileWriter(file,size);
      
      file = "file75000.txt";
      size = 75000;
      fileWriter(file,size);
      
      file = "file80000.txt";
      size = 80000;
      fileWriter(file,size);
      
      file = "file85000.txt";
      size = 85000;
      fileWriter(file,size);
      
      file = "file90000.txt";
      size = 90000;
      fileWriter(file,size);
      
      file = "file95000.txt";
      size = 95000;
      fileWriter(file,size);
      
      file = "file100000.txt";
      size = 100000;
      fileWriter(file,size);
      
      file = "file125000.txt";
      size = 125000;
      fileWriter(file,size);
      
      file = "file150000.txt";
      size = 150000;
      fileWriter(file,size);
      
      
      //ordered
      file = "Ordfile10.txt";
      size = 10;
      fileWriterOrd(file, size);
      
      file = "Ordfile100.txt";
      size = 100;
      fileWriterOrd(file,size);
      
      file = "Ordfile1000.txt";
      size = 1000;
      fileWriterOrd(file,size);
      
      file = "Ordfile5000.txt";
      size = 5000;
      fileWriterOrd(file,size);
      
      file = "Ordfile10000.txt";
      size = 10000;
      fileWriterOrd(file,size);
      
      file = "Ordfile15000.txt";
      size = 15000;
      fileWriterOrd(file,size);
      
      file = "Ordfile20000.txt";
      size = 20000;
      fileWriterOrd(file,size);
      
      file = "Ordfile25000.txt";
      size = 25000;
      fileWriterOrd(file,size);
      
      file = "Ordfile30000.txt";
      size = 30000;
      fileWriterOrd(file,size);
      
      file = "Ordfile35000.txt";
      size = 35000;
      fileWriterOrd(file,size);
      
      file = "Ordfile40000.txt";
      size = 40000;
      fileWriterOrd(file,size);
      
      file = "Ordfile45000.txt";
      size = 45000;
      fileWriterOrd(file,size);
      
      file = "Ordfile50000.txt";
      size = 50000;
      fileWriterOrd(file,size);
      
      file = "Ordfile55000.txt";
      size = 55000;
      fileWriterOrd(file,size);
      
      file = "Ordfile60000.txt";
      size = 60000;
      fileWriterOrd(file,size);
      
      file = "Ordfile65000.txt";
      size = 65000;
      fileWriterOrd(file,size);
      
      file = "Ordfile70000.txt";
      size = 70000;
      fileWriterOrd(file,size);
      
      file = "Ordfile75000.txt";
      size = 75000;
      fileWriterOrd(file,size);
      
      file = "Ordfile80000.txt";
      size = 80000;
      fileWriterOrd(file,size);
      
      file = "Ordfile85000.txt";
      size = 85000;
      fileWriterOrd(file,size);
      
      file = "Ordfile90000.txt";
      size = 90000;
      fileWriterOrd(file,size);
      
      file = "Ordfile95000.txt";
      size = 95000;
      fileWriterOrd(file,size);
      
      file = "Ordfile100000.txt";
      size = 100000;
      fileWriterOrd(file,size);
      
      file = "Ordfile125000.txt";
      size = 125000;
      fileWriterOrd(file,size);
      
      file = "Ordfile150000.txt";
      size = 150000;
      fileWriterOrd(file,size);
      
      //reverse ordered
      file = "Revfile10.txt";
      size = 10;
      fileWriterRev(file, size);
      
      file = "Revfile100.txt";
      size = 100;
      fileWriterRev(file,size);
      
      file = "Revfile1000.txt";
      size = 1000;
      fileWriterOrd(file,size);
      
      file = "Revfile5000.txt";
      size = 5000;
      fileWriterRev(file,size);
      
      file = "Revfile10000.txt";
      size = 10000;
      fileWriterRev(file,size);
      
      file = "Revfile15000.txt";
      size = 15000;
      fileWriterRev(file,size);
      
      file = "Revfile20000.txt";
      size = 20000;
      fileWriterRev(file,size);
      
      file = "Revfile25000.txt";
      size = 25000;
      fileWriterRev(file,size);
      
      file = "Revfile30000.txt";
      size = 30000;
      fileWriterRev(file,size);
      
      file = "Revfile35000.txt";
      size = 35000;
      fileWriterRev(file,size);
      
      file = "Revfile40000.txt";
      size = 40000;
      fileWriterRev(file,size);
      
      file = "Revfile45000.txt";
      size = 45000;
      fileWriterRev(file,size);
      
      file = "Revfile50000.txt";
      size = 50000;
      fileWriterRev(file,size);
      
      file = "Revfile55000.txt";
      size = 55000;
      fileWriterRev(file,size);
      
      file = "Revfile60000.txt";
      size = 60000;
      fileWriterRev(file,size);
      
      file = "Revfile65000.txt";
      size = 65000;
      fileWriterRev(file,size);
      
      file = "Revfile70000.txt";
      size = 70000;
      fileWriterRev(file,size);
      
      file = "Revfile75000.txt";
      size = 75000;
      fileWriterRev(file,size);
      
      file = "Revfile80000.txt";
      size = 80000;
      fileWriterRev(file,size);
      
      file = "Revfile85000.txt";
      size = 85000;
      fileWriterRev(file,size);
      
      file = "Revfile90000.txt";
      size = 90000;
      fileWriterRev(file,size);
      
      file = "Revfile95000.txt";
      size = 95000;
      fileWriterRev(file,size);
      
      file = "Revfile100000.txt";
      size = 100000;
      fileWriterRev(file,size);
      
      file = "Revfile125000.txt";
      size = 125000;
      fileWriterRev(file,size);
      
      file = "Revfile150000.txt";
      size = 150000;
      fileWriterRev(file,size);
      
   }
   
   public static int[] fileReader(String inputFilename){
      
      try{
         File inputFile = new File(inputFilename);
         Scanner myScanner = new Scanner(inputFile);
         int counter = 0;
         
         while(myScanner.hasNext()){
            counter++;
            String current = myScanner.next();
            //System.out.println(current);
            
         }
         
         int[] array = new int[counter];
         counter = 0;
         
         File inputFile2 = new File(inputFilename);
         Scanner myScanner2 = new Scanner(inputFile2);
         while(myScanner2.hasNext()){
            
            String current = myScanner2.next();
            int num = Integer.parseInt(current);
            array[counter] = num;
            counter++;
            
            
         }
         return array;
         
      }
      catch (FileNotFoundException e){
         System.out.println("ERROR: " + e);
      }
      return null;
      
      
   }
   
   public static int[] mergeSort(int[] array){
      //handle empty list
      if (array.length <= 1){
         return array;
      }
      int[] partA = new int[array.length/2];
      int[] partB = new int[array.length - partA.length];
      System.arraycopy(array, 0, partA, 0, partA.length);
      System.arraycopy(array, partA.length, partB, 0, partB.length);
      
      mergeSort(partA);
      mergeSort(partB);
      merge(partA, partB, array);
      return array;
      
   }
   
   public static void merge(int[] partA, int[] partB, int[] merged){
      int i = 0;
      int j = 0;
      int k = 0;
      
      while(i < partA.length && j < partB.length){
         if(partA[i] < partB[j]){
            merged[k] = partA[i];
            i++;
            mergeCounter++;
         }
         else{
            merged[k] = partB[j];
            j++;
            mergeCounter++;
         }
         k++;
      }
      System.arraycopy(partA, i, merged, k, partA.length - i);
      System.arraycopy(partB, j, merged, k, partB.length - j);
      
   }
   
   /*
    *Was not able to get mergeSort2 to run without Stackoverflow,
    *Need more time to analyze.
   public static void mergeSort2 (int[] S, int low, int high){
      int mid = 0;
      
      if (low<high){
         mid = ((low+high)/2);
         mergeSort2(S, low, high);
         mergeSort2(S, mid+1, high);
         merge2(S, low, mid, high);
      }
   }
   
   public static void merge2(int[] S, int low, int mid, int high){
      
      int[] U = new int[high - 1];
      
      int i = low;
      int j = mid+1;
      int k = low;
      
      while (i <= mid && j<= high){
         if(S[i]<S[j]){
            U[k] = S[i];
            i++;
         }
         else{
            U[k] = S[j];
            j++;
         }
         k++;
      }
      if (i>mid){
         System.arraycopy(S, j, U, k, (high-low));
      }
      else{
         System.arraycopy(S, i, U, k, (mid-i));
      }
      System.arraycopy(U, low, S, low, (high-low));
   }
   */
   
   public static void exchangeSort(int[] array){
   
      int temp;
      for(int i=0; i<=array.length-2; i++){
         for(int j=i+1; j<=array.length-1; j++){
            if(array[j] < array[i]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
               exchangeCounter++;
            }
            exchangeCounter++;
         }
      }
      //System.out.println(Arrays.toString(array));
         
   
   }
   
   
   public int[] quickSort(int[] array, int low, int high){
      
      if(high>low){
         partition(array, low, high);
         quickSort(array, low, pivot-1);
         quickSort(array, pivot+1, high);
      }
      return array;
   }
   
   public int[] partition(int[] array, int low, int high){
      int i = 0;
      int j = 0;
      
      int pivotitem = array[low];
      j = low;
      for (i=low+1; i<=high; i ++){
         if (array[i]<pivotitem){
            j++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            quickCounter++;
         }
      }
      pivot = j;
      int tempPoint = array[low];
      array[low] = array[pivot];
      array[pivot] = tempPoint;
      
      return array;
   }
   
   public static void insertionSort(int n, int[] S){
      int i;
      int j;
      int x;
      
      for (i = 1; i< n; i++){
         x = S[i];
         j = i - 1;
         while (j>=0 && S[j] > x){
            S[j+1] = S[j];
            j--;
            insertionCounter++;
         }
         S[j+1] = x;
         insertionCounter++;
      }
   }
   
   public static void main(String[] args){
      
      Sorting S = new Sorting();
      //fileNameSize();
      int[] A;
      int[] B;
      int[] C;
      int[] E;
      long startTime;
      long endTime;
      int length;
      String file;
      int fileSize = 0;
      String fileString;
      
      //size of data in file name
      

      
      for (int i = 0; i< 20; i++){

         quickCounter = 0;
         mergeCounter= 0;
         insertionCounter = 0;
         exchangeCounter = 0;
         
         B = null;
         A = null;
         C = null;
         E = null;
         
         
         fileSize += 5000;
         fileString = Integer.toString(fileSize);
         file = "Revfile" + fileString + ".txt";
         
         System.out.println("Random List of " + fileString + ":");
         
         B = fileReader(file);
         startTime = System.currentTimeMillis();
         length = B.length;
         //B = S.quickSort(B, 0, length-1);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for QuickSort: " + (endTime - startTime) );

         
         C = fileReader(file);
         startTime = System.currentTimeMillis();
         mergeSort(C);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for MergeSort: " + (endTime - startTime) );
         
         
         //int[] D = fileReader(file);
         //mergeSort2(D, 0, D.length-1);
         
         
         E = fileReader(file);
         length = E.length;
         startTime = System.currentTimeMillis();
         insertionSort(length, E);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for InsertionSort: " + (endTime - startTime) );
         
         
         A = fileReader(file);
         startTime = System.currentTimeMillis();
         exchangeSort(A);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for Exchange Sort: " + (endTime - startTime) );
         
         
         System.out.println("Number Comparisons for Quicksort: " + quickCounter);
         System.out.println("Number Comparisons for Mergesort: " + mergeCounter);
         System.out.println("Number Comparisons for InsertionSort: " + insertionCounter);
         System.out.println("Number Comparisons for Exchangesort: " + exchangeCounter);
         
         System.out.println(quickCounter + "\t" + mergeCounter + "\t" + insertionCounter + "\t" + exchangeCounter);
      }
      
      fileSize = 100000;
      for (int i = 0; i< 2; i++){
         quickCounter = 0;
         mergeCounter= 0;
         insertionCounter = 0;
         exchangeCounter = 0;
         
         B = null;
         A = null;
         C = null;
         E = null;
         
         fileSize += 25000;
         fileString = Integer.toString(fileSize);
         file = "Revfile" + fileString + ".txt";
         
         System.out.println("Random List of " + fileString + ":");
         
         B = fileReader(file);
         startTime = System.currentTimeMillis();
         length = B.length;
         //B = S.quickSort(B, 0, length-1);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for QuickSort: " + (endTime - startTime) );
         System.out.println("Number Comparisons for Quicksort: " + quickCounter);
         
         C = fileReader(file);
         startTime = System.currentTimeMillis();
         mergeSort(C);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for MergeSort: " + (endTime - startTime) );
         System.out.println("Number Comparisons for Mergesort: " + mergeCounter);
         
         
         //int[] D = fileReader(file);
         //mergeSort2(D, 0, D.length-1);
         
         
         E = fileReader(file);
         length = E.length;
         startTime = System.currentTimeMillis();
         insertionSort(length, E);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for InsertionSort: " + (endTime - startTime) );
         System.out.println("Number Comparisons for Insertionsort: " + insertionCounter);
         
         A = fileReader(file);
         startTime = System.currentTimeMillis();
         exchangeSort(A);
         endTime = System.currentTimeMillis();
         System.out.println("Total execution time for Exchange Sort: " + (endTime - startTime) );
         System.out.println("Number Comparisons for Exchangesort: " + exchangeCounter);
         
         System.out.println(quickCounter + "\t" + mergeCounter + "\t" + insertionCounter + "\t" + exchangeCounter);
      }
      
      
   }

}