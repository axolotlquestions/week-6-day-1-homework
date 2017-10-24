public class Bus{

  private String route;
  private Person[] passengers;

  public Bus(String route){
    this.route = route;
    this.passengers = new Person[10];
  }

  public String getRoute(){
    return this.route;
  }

  public int passengerCount(){
    int counter = 0;
    for (Person person : this.passengers){
      if (person != null){
        counter++;
      }
    }
    return counter;
  }

  public void board(Person person){
    if (!isBusFull()){
      int passengerCount = passengerCount();
      this.passengers[passengerCount] = person;
    }
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

  public void endOfTheLine(){
    for (int i=0; i < passengerCount(); i++){
      this.passengers[i] = null;
    }
  }


}
