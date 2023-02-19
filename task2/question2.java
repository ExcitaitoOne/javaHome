package task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.*;

//2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class question2 {
    public static void main(String[] args) throws IOException{
     
       

        ArrayList<Integer> arr = new ArrayList<>();
        int size = 10;
        arr = randoMize(arr,size);
        System.out.println(arr);
        arr = sort(arr);
        
        System.out.println(arr);
    }

    private static ArrayList<Integer> randoMize(ArrayList<Integer> arr, int size) {
     
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            arr.add(i, rnd.ints(0,100).findFirst().getAsInt()) ; 
        }
        return arr;
    } 
    private static ArrayList<Integer> sort(ArrayList<Integer> arr){
        Logger logg = Logger.getLogger(question2.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logg.addHandler(ch);
        logg.setLevel(Level.INFO);
        logg.addHandler (ch);
        SimpleFormatter sFormat = new SimpleFormatter ();
        ch.setFormatter (sFormat);
       
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
           
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i).compareTo(arr.get(i + 1)) > 0) {
                temp = arr.get(i);
                arr.set(i, arr.get(i + 1));
                arr.set(i + 1, temp);
                sorted = false;
        }     logg.info("логирование == " +arr.get(i) );

        }
    }
    return arr;
    }
    
}