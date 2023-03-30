import java.io.FileNotFoundException;
import java.util.List;

public interface CarInventoryReaderInterfaceDW {

  public List<CarInventoryInterfaceDW> readPostsFromFile(String filename)
      throws FileNotFoundException;
}

