

import java.io.*;
import java.util.*;

public class Aloha2
{
    public static void main ( String[] args )
    {
        String[] data = new String[100];

        Dataman dm = new Dataman();
        Fileman fm = new Fileman();
        dm.inputData();
        dm.saveData(data);

        fm.writeData(dm.getData());

    }
}

class Dataman
{
    private String[] data;
    private int numOfData;

    public String[] getData()
    {
        return this.data;
    }

    public Dataman()
    {
        data = new String[100];
    }

    public void inputData()
    {
        System.out.print("何人のデータ >");
        this.numOfData = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
    }

    public void saveData(String[] data)
    {
        System.out.println("データを保存します⭐️");
        String name = "";
        String address = "";
        int age = 0;

        for (int i = 0; i < this.numOfData; i++) {
            System.out.print("名前:");
            name = new java.util.Scanner(System.in).nextLine();
            System.out.print("住所:");
            address = new java.util.Scanner(System.in).nextLine();
            System.out.print("年齢:");
            Scanner in = new Scanner (System.in) ;
            while (!in.hasNextInt()) {
                System.out.print("正しい年齢を入力してください:");
                in.next();
            }
            age = in.nextInt();
            // age = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
            this.data[i] = name+","+address+","+age;
        }
    }
}

class Fileman{

    public Fileman()
    {
        System.out.println("Fileman!");
    }

    public void writeData(String[] data)
    {
        System.out.println("ファイル保存しました!");
        PrintWriter pwrite = null;
        try {
            File outQuang = new File("data.txt");
            pwrite = new PrintWriter(new BufferedWriter(new FileWriter(outQuang, true)));

            for (int i = 0; i < data.length; i++ ) {
                 String msgQuang = data[i];
                 if (msgQuang != null) {
                     pwrite.println(msgQuang);
                    System.out.println(msgQuang);
                 }
            }
        } catch( IOException e) {
            System.out.println("エラーです。");
            e.printStackTrace();
        } finally {
            if (pwrite != null) {
                pwrite.close();
            }
        }
    }
}