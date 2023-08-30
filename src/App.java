import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      int y;
      
      tree tree = new tree(); 
      
      Scanner x = new Scanner(System.in);
        do{
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            
            y = x.nextInt();
            
            if(y==1){
                System.out.println("Enter the number you want to insert: ");
                int z = x.nextInt();
                tree.insert(z);
            }
            if(y==2){
                System.out.println("Enter the number you want to search: ");
                int z = x.nextInt();
                if(tree.search(z)){
                    System.out.println("Found");
                }else{
                    System.out.println("Not Found");
                }
            }
            if(y==3){
                tree.printTree(tree.getRoot());
            }
            
        }while(y != 4);    



        x.close();
    }

}
