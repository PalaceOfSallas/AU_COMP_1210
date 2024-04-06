import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * Ice cream cone list menu app class.
 *
 * Project 06
 * Stephen Sallas COMP 1210-005
 * 10/14/19
 */
public class IceCreamConeListMenuApp
{
   /**
    * Main method in driver class.
    * @param args Command line arguments - not used.
    * @throws FileNotFoundException = Catches if file is not found.
    */
   public static void main(String[] args) throws FileNotFoundException
   {
      // Creating Empty IceCreamConeList
      String x = "*** no list name assigned ***";
      ArrayList<IceCreamCone> y = new ArrayList<IceCreamCone>();
      IceCreamConeList appList = new IceCreamConeList(x, y);
      
      // Scanner
      Scanner userInput = new Scanner(System.in);
         
      // Outputting Menu
      System.out.println("IceCreamCone List System Menu\n"
            + "R - Read File and Create IceCreamCone List\n"
            + "P - Print IceCreamCone List\n"
            + "S - Print Summary\n"
            + "A - Add IceCreamCone\n"
            + "D - Delete IceCreamCone\n"
            + "F - Find IceCreamCone\n"
            + "E - Edit IceCreamCone\n"
            + "Q - Quit");
      
      // Variables
      String selection = "";
      String file = "";
      String label = "";
      double radius, height;
      
      // Do While Loop
      do 
      {
         // Options
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
      
         // Inputting Selection
         selection = userInput.nextLine();
         if (selection.length() == 0) {
            continue;
         }
         selection = selection.toUpperCase();
         
         // Converting to Character
         char selectionChar = selection.charAt(0);
         
         // Switch Statement
         switch (selectionChar)
         {
            case 'R':
               System.out.print("\tFile Name: ");
               file = userInput.nextLine();
               appList = appList.readFile(file);
               System.out.println("\tFile read in and IceCreamCone List"
                     + " created\n");
               break;
               
            case 'P':
               System.out.print(appList);
               break;
               
            case 'S':
               System.out.print("\n" + appList.summaryInfo() + "\n\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius: ");
               radius = userInput.nextDouble();
               System.out.print("\tHeight: ");
               height = userInput.nextDouble();
               appList.addIceCreamCone(label, radius, height);
               System.out.println("\t*** IceCreamCone added ***\n");
               break;
                
            case 'D':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               IceCreamCone delete = appList.deleteIceCreamCone(label);
               if (delete != null)
               {
                  System.out.println("\t\"" + delete.getLabel() + "\""
                        + " deleted\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               if (appList.findIceCreamCone(label) == null)
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else
               {
                  System.out.println(appList.findIceCreamCone(label) + "\n");
               }
               break;
            
            case 'E':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius: ");
               radius = userInput.nextDouble();
               System.out.print("\tHeight: ");
               height = userInput.nextDouble();
               if (appList.editIceCreamCone(label, radius, height))
               {
                  System.out.println("\t\"" + label + "\" successfully" 
                        + " edited\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
               break;     
         }
               
         // Ending Do While Loop
      } while (!(selection.equalsIgnoreCase("Q")));
   }
}

