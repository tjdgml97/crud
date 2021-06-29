import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class CrudService {

    BufferedReader br;

    public void readData(List<Person> list) {
        if( list.size() == 0 ){
            System.out.println("데이터가 존재하지 않습니다. ");
            return;
        }

        System.out.println("No Name 지각 미제출 Grade ");
        System.out.println("=======================");
        for (Person p: list) {
            System.out.println(p.toString());
        }
    }


    public Person createData(List<Person> list) throws IOException{
        int num;
        String name;
        int First;
        int Second;
        String grade;

        num = list.size();

        System.out.println("이름 입력");
        br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();

        System.out.println("지각횟수 입력");
        First = Integer.parseInt(br.readLine());

        System.out.println("미제출 과제 갯수 입력");
        Second = Integer.parseInt(br.readLine());


        grade = Person.calculateGrade(First, Second);

        Person p = new Person(num, name, First, Second, grade);

        return p;
    }


    public void updateData(ArrayList<Person> list) {
        if (list.size() == 0) {
            System.out.println("데이터가 존재하지 않음");
            return;
        }

        try {

            System.out.println("수정할 번호 입력");
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine())-1 ;
            if(CreditCalculator.valid(list, num)) {
                System.out.println("이름입력");
                list.get(num).setName(br.readLine());
                System.out.println("수정할 지각횟수 입력");
                list.get(num).setFirst(Integer.parseInt(br.readLine()));
                System.out.println("미제출한 과제 갯수 입력");
                list.get(num).setSecond(Integer.parseInt(br.readLine()));
                list.get(num).setGrade(Person.calculateGrade(list.get(num).getFirst(), list.get(num).getSecond()));
                System.out.println("수정완료");
            } else {
                updateData(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void deleteData(ArrayList<Person> list){

        if( list.size() == 0 ){
            System.out.println("데이터가 존재하지 않습니다.");
            return;
        }

        try {
            System.out.println("삭제할 번호 입력");
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine()) - 1;
            if(CreditCalculator.valid(list, num)) {
                list.remove(num);
                for(int i=0; i < list.size(); i++)
                    list.get(i).setNum(i);
                System.out.println("삭제되었습니다.");
            }else {
                deleteData(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}









////

/*
    public boolean menuChoose(String input) {
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

private void searchByName(){
        if(this.list.size() == 0) {
            System.out.println("데이터가 존재하지 않음");
            return;
        }

        System.out.println("검색할 이름을 입력하세요");
        br = new BufferedReader(new InputStreamReader (System.in));

        try {
            String name = br.readLine();
            boolean check = false;

            for (person p : list) {
                if (p.getName().equals(name)) {
                    if (!check) {
                        System.out.println("번호 이름 지각횟수 미제출 과제 갯수  수료여부 ");
                        System.out.println("---------------------");
                        check = true;
                    }
                    System.out.println(p.toString());
                }
            }


            if (!check)
                System.out.println("검색 결과가 없음");

        }catch (IOException e) {
            e.printStackTrace();
        }
}


 */






