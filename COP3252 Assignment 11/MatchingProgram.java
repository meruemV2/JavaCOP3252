import java.io.IOException;

public class MatchingProgram {
    public static void main(String[] args) throws IOException
    {
        CreateTextFiles.createMaster();
        CreateTextFiles.createTrans();
        FileMatch.testMatch();
    }
}