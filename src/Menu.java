import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> choices;
    
    public Menu() {}
    
    public Menu(String title, String choices[]){
        this.title = title;
        this.choices = new ArrayList<>();
        for (String s : choices) this.choices.add((T) s);
    }
    
    public void display(){
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i+1) + "." + choices.get(i));
        }
        System.out.println("--------------------------------");
    }
    
    public int getSelected(){
        display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lua chon:");
        return sc.nextInt();
    }
    
    public abstract void execute(int n);
    
    public void run() {
        while (true) {
            int n = getSelected();
            if (n > choices.size()) break;
            execute(n);
        }
    }  
}