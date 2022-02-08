import java.io.IOException;

public class MatchingProgramXML {
    public static void main(String[] args) throws IOException 
    {
        CreateSequentialFile.createMaster();
        CreateSequentialFile.createTrans();
        FileMatch.Match();
    }
}