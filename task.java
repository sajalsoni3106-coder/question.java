
import java.util.*;
public class task {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String userMessage = """
                Enter "add" to add task
                Enter "show" to show task
                Enter "update" to update task
                Enter "delete" to delete task
                Enter "quit" to delete tesk
                """;
                String userInput;
                
                List<String>tasks = new ArrayList<>();

                do{
                    System.out.println(userMessage);
                    userInput = sc.nextLine();
                    switch(userInput)
                    {
                     case "add" :
                        System.out.println("adding.....");
                        String newTask;
                        System.out.println("enter a new task : ");
                        newTask = sc.nextLine();

                        tasks.add(newTask);
                        System.out.println("TASK ADDED SUCCESFULLY 🙏");
                        break;
                    
                    case "delete" :
                        System.out.println("delete.....");
                        int index;
                        System.out.println("enter a task that deleted : ");
                        index = sc.nextInt()-1;
                        sc.nextLine();
                        System.out.println("TASK DELETED SUCCESFULLY !!!!!");
                        break;

                    case "show" :
                        System.out.println("showing.....");
                        int count = 1;

                        for(String task : tasks){
                            System.out.println(count + "." + task);
                            count++;
                        }
                        System.out.println("TASKS ARE SHOW SUCCESFULLY !!");
                        break;

                    case "update" :
                        System.out.println("updating.....");
                        int indexUpdate;
                        System.out.println("enter a task that update : ");
                        indexUpdate = sc.nextInt()-1;
                        sc.nextLine();
                        String taskUpdate;
                        System.out.println("enter a update new task : ");
                        taskUpdate = sc.nextLine();

                        tasks.set(indexUpdate, taskUpdate);
                        System.out.println("TASKS UPDATE SUCCESFULLY !!");
                        break;

                    case "quit" :
                        System.out.println("thanks for using our task app.....");
                        break;

                     default:
                        System.out.println("INVALID INPUT! TRY AGAIN.....");
                        
                    }
                }while (!userInput.equals("quit"));
            

                
    }
}
