package package9;
//java 中的流（Stream）、文件（File）和 IO（输入输出）是处理数据读取和写入的基础设施，它们允许程序与外部数据（如文件、网络、系统输入等）进行交互。
//
//java.io 包是 Java 标准库中的一个核心包，提供了用于系统输入和输出的类，它包含了处理数据流（字节流和字符流）、文件读写、序列化以及数据格式化的工具。
//
//java.io 是处理文件操作、流操作以及低级别 IO 操作的基础包。
//
//java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。
//
//一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
import java.io.*;

//io里有一个BufferedReader对象，用来在控制台读取字符
public class stream_file_io {
    public static void main(String[] args) throws IOException {//输入流
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//BufferedReader 是 Java 中用于高效读取字符输入流的类，它通过缓冲机制减少底层 I/O 操作的次数，提高性能。InputStreamReader 是将字节输入流（如 System.in）转换为字符输入流的桥接类。
        System.out.println("输入字符，按下q退出");
        //读取字符
        do{
            c = (char)br.read();
            System.out.println(c);
        }while(c!='p');
    }
}

