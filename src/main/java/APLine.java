public class APLine
{
  private int a, b, c;
  public APLine(int d, int e, int f){
    a=d;
    b=e;
    c=f;
  }

  public double getSlope(){
    return -(double)a/(double)b;
  }

  public boolean isOnLine(int x, int y){
    int z = (a*x) + (b*y) + c
    return z == 0;
  }
}
