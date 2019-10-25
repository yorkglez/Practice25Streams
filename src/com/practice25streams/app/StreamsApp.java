package com.practice25streams.app;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StreamsApp
{
    public static void main(String[] args)
    {
        //Objects declaration
        File myFile  = null;
        FileReader myReader = null;
        BufferedReader myBuffer = null;

        //Variables declaration
        String line = "";

        try
        {
            //Open path
             myFile = new File("C:\\a\\a.txt");
             //Read file
             myReader = new FileReader(myFile);
             //
             myBuffer = new BufferedReader(myReader);

             //Get lines of buffer
             while((line = myBuffer.readLine()) != null)
             {
                 //Convert srring to upper case
                 line = line.toUpperCase();
                 //Renplace letters
                 line = line.replace("O","W");
                 System.out.println(line);
             }
        }
        catch (IOException e )
        {
            e.printStackTrace();
        }

        finally {
            try {
                myBuffer.close();
                myReader.close();
                myFile = null;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
