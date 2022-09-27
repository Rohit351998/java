class Animal{
  void eat()// methods of class animals eat
  {
    system.out.println(" i am omnivorus");
  }
  class mammel extends Animals {// this line shows the extends class of mammel
    void nature()
    {
      system.out.print("I am mammel");
    }
    class Dog extends Mammel{
      void sound ()
      {
        system.out.println("I am Bark");
      }
      class  main{
        print static void main(string[]args)
          Dog D1 = new dog// calling the methods 
          D1.sound();
          D1.nature();
          D1.eat();
      }
