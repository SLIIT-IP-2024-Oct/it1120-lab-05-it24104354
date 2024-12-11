import java.util.Scanner;
public class IT24204354Lab5Q2{
  
    public static void main(String[] args){
		
		int numMember;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the new numbers :");
		numMember = input.nextInt();
		
		switch(numMember){
			
			    case 0:
			System.out.println();
			System.out.print("No prize");
			
			    break;
				
				case 1:
			System.out.println();
            System.out.print("pen");
                break;
                case 2:
			System.out.println();
            System.out.print("Umbrella");
 
                break;
                case 3:
			System.out.println();
            System.out.print("Bag");
                break;
                case 4:
			System.out.println();
            System.out.print("Travelling Chair");	
                break;
                default:
            if(numMember>=5){
        System.out.println();
			System.out.println("prize is a : Headphone");  }
            else
        
        System.out.print("input must be a number 0 or greater");	
     		
		input.close();
		}
          }
   }