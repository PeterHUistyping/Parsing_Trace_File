import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class parsing{
    public static void main(String[] args) throws IOException {
        Set<String> api=new HashSet<>();
        try {
          String filename = "ty";
          File myObj = new File(filename+".txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            // char[] API=new char[100];
            char[] dataC= data.toCharArray();
            int i=0;
            for(char ch:dataC){
                i++;
                if(ch=='('){
                  
                    break;
                }
                // System.out.println(ch);
            
                // API[i++]=ch;
            }
            // API[i++]='\0';
            // String apii=API.toString();
            // System.out.println(data.substring(0,i-1));
            api.add(data.substring(0,i-1));
          }
          List<String> sortedList = new ArrayList<>(api);
          Collections.sort(sortedList);
          for (String apii:sortedList){
            System.out.println(apii);
          }
          System.out.println("\n\n\n");
          
          System.out.println("Total API size:");

          System.out.println(sortedList.size());

          System.out.println("\n\n\n");

          FileWriter fileWriter = new FileWriter(filename+"UniqueAPI.txt");
          PrintWriter printWriter = new PrintWriter(fileWriter);
          for (String apii:sortedList){
            printWriter.print(apii+'\n');
          }

          printWriter.close();
          myReader.close();

        

        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
}