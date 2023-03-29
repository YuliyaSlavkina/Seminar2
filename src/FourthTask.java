import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FourthTask {

    public StringBuilder generateString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100 ; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public void writer() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\julia\\IdeaProjects\\fourthTask.txt");  //создался файл
        fileOutputStream.write(generateString().toString().getBytes());  //записываем,  getBytes() кодирует данную строку в последовательность байтов
        fileOutputStream.close();
    }


}
