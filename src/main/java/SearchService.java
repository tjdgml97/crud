import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SearchService {

    BufferedReader br;

    public void searchBy(List<Person> list, String keyword) throws IOException {

        if(keyword.equals("name")){
            System.out.println("검색할 이름 입력");
            br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();

            System.out.println("No Name 지각 미제출 Grade ");
            System.out.println("=======================");

            for( Person p : list ){
                if( p.getName().equals(name) ){
                    System.out.println(p.toString());
                }
            }
        }
    }


}
