public class Artwork {
   // TODO: Declare private fields - title, yearCreated
   private String title;
   private int yearCreated;
   
   // TODO: Declare private field artist of type Artist 
   private Artist artist = new Artist();
   // TODO: Define default constructor
   public Artwork() {
      title = "None";
      yearCreated = 0;
      }
      
   // TODO: Define get methods: getTitle(), getYearCreated()
   public String getTitle() {
      return title;
      }
      
   public int getYearCreated() {
      return yearCreated;
      }
      
   // TODO: Define second constructor to initialize 
   //       private fields (title, yearCreated, artist)
   public Artwork(String userTitle, int userYearCreated, Artist userArtist) {
      title = userTitle;
      yearCreated = userYearCreated;
      artist = userArtist;
      }
   // TODO: Define printInfo() method                                                                                             
   public void printInfo() {
      this.artist.printInfo();
      System.out.println("Title: " + title + ", " + yearCreated);
         }
   }
