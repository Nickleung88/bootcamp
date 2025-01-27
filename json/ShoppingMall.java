import java.time.LocalDate;

public class ShoppingMall {
  private String name;
  private int area;
  private Cinema cinema;
  private String[] shopCategory; // List<String> shopCategory

  public static class Cinema {
    private String name;
    private LocalDate openDate;
    private Flim[] releasedFilms;

    public static class Flim {
      private String name;
      private LocalDate releaseDate;
    }
  }
}