import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i;
      int[] jerseyNums = new int[5];
      int[] ratings = new int[5];
      int rating;
      int jersey;
      char option;
      boolean exists = false;


      for(i = 0; i < jerseyNums.length; i++){
         System.out.println("Enter player " + (i + 1) + "'s jersey number:");
         jerseyNums[i] = scnr.nextInt();
         System.out.println("Enter player " + (i + 1) + "'s rating:");
         ratings[i] = scnr.nextInt();   
      }

      System.out.println("ROSTER");

      for(i = 0; i < jerseyNums.length; i++){
         System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratings[i]);
      }

      do{
         ShowMenu();
         option = scnr.next().charAt(0);
         switch(option){
            case 'q':
               break;
            case 'o':
               System.out.println("\n\nROSTER\n");
               for(i = 0; i < jerseyNums.length; i++){
                  System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratings[i]);
               }
               break;
            case 'u':
               System.out.println("Enter a jersey number:");
               jersey = scnr.nextInt();
               System.out.println("Enter a new rating for player:");
               rating = scnr.nextInt();
               for(i = 0; i < jerseyNums.length; i++){
                  if(jerseyNums[i] == jersey){
                     ratings[i] = rating;
                  }
               }
               break;
            case 'a':
               System.out.println("Enter a rating:");
               rating = scnr.nextInt();
               System.out.println("\n\nABOVE " + rating);
               
               for(i = 0; i < jerseyNums.length; i++){
                  if(ratings[i] > rating){
                     System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratings[i]);
                  }
               }
               break;
            case 'r':
               int tempJersey;
               System.out.println("Enter a jersey number:");
               jersey = scnr.nextInt();
               for(i = 0; i < jerseyNums.length; i++){
                  if(jerseyNums[i] == jersey){
                     exists = true;
                     break;
                  }
               }
               if(exists){
                  System.out.println("Enter a new jersey number:");
                  tempJersey = scnr.nextInt();
                  System.out.println("Enter a rating for the new player:");
                  rating = scnr.nextInt();
   
                  for(i = 0; i < jerseyNums.length; i++){
                     if(jerseyNums[i] == jersey){
                        jerseyNums[i] = tempJersey;
                        ratings[i] = rating;
                     }
                  }
               } else {
                  System.out.println("The jersey number you entered does not exist");
               }
               break;
         }
         if(option != 'o' && option != 'a' && option != 'q'){
            if(option == 'r' && exists){
               System.out.println("\n\nRoster");
               for(i = 0; i < jerseyNums.length; i++){
                  System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratings[i]);
               }
            } else if(option != 'r'){
               System.out.println("\n\nRoster");
               for(i = 0; i < jerseyNums.length; i++){
                  System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratings[i]);
               }
            }
         }
      } while(option != 'q');
   }

   // helpers
   static void ShowMenu(){
      System.out.println("\n\n\nMENU\nu - Update player rating\na - Output players above rating\nr - Replace player\no - Output roster\nq - Quit\n\nChoose an option:");
   }
}