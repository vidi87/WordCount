import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class FileProcessorTest {
    private static FileProcessor processor = new FileProcessor();


    @Test
    public void emptyFileTest(){
        String fileName = "target/classes/test1.txt";
        Map<String,Long> map = processor.getWordsCount(fileName);
        Assert.assertEquals(map.size(), 0);
    }

    @Test
    public void simpleFileTest(){
        String fileName = "target/classes/test2.txt";
        Map<String,Long> map = processor.getWordsCount(fileName);
        Assert.assertEquals(map.size(), 3);
    }

}
