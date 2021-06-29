import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Menu {
    BufferedReader br;


    public String printMenu() throws IOException {
        System.out.println("-----MENU------");
        System.out.println("1.조회");
        System.out.println("2.추가");
        System.out.println("3.수정");
        System.out.println("4.삭제");
        System.out.println("5.이름검색");
        System.out.println("0.종료");
        System.out.println("--------------");

        br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();

    }

}

  /*  public boolean menuChoose(String input) {
        switch (input) {
            case "1":
                readData();
                break;
            case "2":
                createData();
            case "3":
                updateData();
            case "4":
                searchByName();
            case "0":
                System.out.println("종료");
                return false;
            default:
                System.out.println("잘못선택함");
        }
        return true;
    }


   */


