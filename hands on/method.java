class sum
{
  public int sum(int x,int y)// having the sum class in which we have have thetwo integer value has been given 
  {
    return x+y;
  }
  public int sum (int x, int y,int z)
  {
    return x+y+z;
  }
  public double sum(double x,double y)
  {
    return x+y;
  }
  public static void main(string[]args)
    sum R = new sum();// creating object for method calling
  system.out.print(R.sum(9,1));
  system.out.print(R.sum(10,20,24));
  system.out.print(R.sum(23.4,33.5));
}
  
                   
