import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DWTesters {

  @Test
  // test the getYear for the first 5 sets of car data
  public void Tester1() throws FileNotFoundException {

    CarReaderDW reader = new CarReaderDW();
    List<CarInventoryInterfaceDW> inventory = reader.readPostsFromFile("CarInventory.txt");


    // junit test
    Assertions.assertEquals("2010", inventory.get(0).getYear());
    Assertions.assertEquals("2011", inventory.get(1).getYear());
    Assertions.assertEquals("2006", inventory.get(2).getYear());
    Assertions.assertEquals("2011", inventory.get(3).getYear());
    Assertions.assertEquals("2014", inventory.get(4).getYear());
  }

  @Test
  // test the getYear for the first 5 sets of car data
  public void Tester2() throws FileNotFoundException {

    CarReaderDW reader = new CarReaderDW();
    List<CarInventoryInterfaceDW> inventory = reader.readPostsFromFile("CarInventory.txt");



    // junit test
    Assertions.assertEquals("13328", inventory.get(0).getPrice());
    Assertions.assertEquals("16621", inventory.get(1).getPrice());
    Assertions.assertEquals("8467", inventory.get(2).getPrice());
    Assertions.assertEquals("3607", inventory.get(3).getPrice());
    Assertions.assertEquals("11726", inventory.get(4).getPrice());
  }

  @Test
  // test the getYear for the first 5 sets of car data
  public void Tester3() throws FileNotFoundException {

    CarReaderDW reader = new CarReaderDW();
    List<CarInventoryInterfaceDW> inventory = reader.readPostsFromFile("CarInventory.txt");



    // junit test
    Assertions.assertEquals("RX 450", inventory.get(0).getModel());
    Assertions.assertEquals("Equinox", inventory.get(1).getModel());
    Assertions.assertEquals("FIT", inventory.get(2).getModel());
    Assertions.assertEquals("Escape", inventory.get(3).getModel());
    Assertions.assertEquals("FIT", inventory.get(4).getModel());
  }

  @Test
  // test the getYear for the first 5 sets of car data
  public void Tester4() throws FileNotFoundException {

    CarReaderDW reader = new CarReaderDW();
    List<CarInventoryInterfaceDW> inventory = reader.readPostsFromFile("CarInventory.txt");

    System.out.println(inventory.get(0).getBrand());

    // junit test
    Assertions.assertEquals("LEXUS", inventory.get(0).getBrand());

  }

}
