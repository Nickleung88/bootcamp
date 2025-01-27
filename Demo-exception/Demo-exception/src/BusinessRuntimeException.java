public class BusinessRuntimeException extends RuntimeException {
  // throw Busininss exception
  public static int calculate (int x, int y)
  {if (x<0 || y<0)
    throw new BusinessRuntimeException();
    return x+y;
      
  }
}
