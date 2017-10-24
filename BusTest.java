import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("No. 30");
    person = new Person();
  }

  @Test
  public void hasRoute(){
    assertEquals("No. 30", bus.getRoute());
  }

  @Test
  public void passengersStartsOffEmpty(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void passengerCanBoard(){
    bus.board(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull(){
    for (int i=0; i < 10; i++){
      bus.board(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void cannotBoardIfFull(){
    for (int i=0; i < 20; i++){
      bus.board(person);
    }
    assertEquals(10, bus.passengerCount());
  }

  @Test
  public void busShouldEmptyAtEndOfTheLine(){
    bus.board(person);
    bus.endOfTheLine();
    assertEquals(0, bus.passengerCount());
  }

}
