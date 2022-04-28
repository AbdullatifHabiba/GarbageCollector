
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        String heapPath = args[0];
        String pointersPath =args[1];
        String rootPath = args[2];
        String new_heapPath = args[3];
        System.out.println(heapPath+pointersPath+rootPath+new_heapPath);

        MarkAndCompact markAndCompact=new MarkAndCompact(heapPath,pointersPath,rootPath,new_heapPath);
    }



}