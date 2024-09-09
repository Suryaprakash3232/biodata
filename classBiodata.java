import java.util.*;
public class classBiodata {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String name=in.nextLine();
        int age=in.nextInt();
        String dept=in.next();
        float hight=in.nextFloat();
        char gender=in.next().charAt(0);
        System.out.println("name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Department:"+dept);
        System.out.println("Hight:"+hight);
        System.out.println("Gender:"+gender);

    }



}
