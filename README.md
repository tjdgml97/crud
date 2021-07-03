- 주제 : 캠프 수료여부에 대해서 판단하는 기능 (create, update, read, delete ) +  파일에 저장하는 기능을 추가  
- 방법 : 

1. 새 프로젝트를 생성
2. fileservice class 생성
-  파일을 읽고 저장하는 기능을 추가 
-  파일 경로 설정 : String path = Paths.get(".").toAbsolutePath().toString();
                String filename = path + "/data.txt";
                File file = new File(filename);
                
- read 기능 : 
![image](https://user-images.githubusercontent.com/86584041/124345667-48e01100-dc15-11eb-885a-36409c4104f8.png)

- save 기능 : 
![image](https://user-images.githubusercontent.com/86584041/124345712-7af17300-dc15-11eb-9a9d-f254003e2149.png)
![image](https://user-images.githubusercontent.com/86584041/124345731-90669d00-dc15-11eb-910f-d8a54cb16919.png)



                
                
4. menu에 파일 저장기능을 추가 
![image](https://user-images.githubusercontent.com/86584041/124345614-fdc5fe00-dc14-11eb-9781-8b4a8f43e0f8.png)

