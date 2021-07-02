import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileService {
   // String filename;

   // fileService(){
   //     두개 해주고
   // }


        public ArrayList<Person> readFile() {
            ArrayList<Person> list = new ArrayList<>();

            try {
                String path = Paths.get(".").toAbsolutePath().toString();
                String filename = path + "/data.txt";
                File file = new File(filename);

                //입력 스트림 생성
                FileReader filereader = new FileReader(file);
                //입력 버퍼 생성
                BufferedReader bufReader = new BufferedReader(filereader);

                int i=0;
                String line = "";
                while((line= bufReader.readLine()) != null ){

                    StringTokenizer st = new StringTokenizer(line, "/");


                    String name = st.nextToken().trim();
                    int First = Integer.parseInt(st.nextToken().trim());
                    int Second = Integer.parseInt(st.nextToken().trim());
                    String grade = Person.calculateGrade(First, Second );

                    list.add(new Person(i,name, First, Second, grade));
                    i++;

                }
                bufReader.close();
                //bufferedR

            }catch (FileNotFoundException e) {
                System.out.println("data.txt 파일이 존재하지 않음");
            }catch(IOException e) {
                System.out.println(e);
            }


            return list;


        }

        public void saveFile(ArrayList<Person> list) {
            try {

                String path = Paths.get(".").toAbsolutePath().toString();
                String filename = path + "/data.txt"; //왜 다시 선언?
                File file = new File(filename);
                FileUtils.write(file, "", false);
                for(Person p: list) {
                    FileUtils.write(file,p.getName() +" / "+p.getFirst()+" / "+p.getSecond()+"\n");
                }
            }catch(FileNotFoundException e){
                System.out.println("파일이 존재하지않습니다");
            }catch (IOException e) {
                System.out.println(e);
            }
        }


    }


