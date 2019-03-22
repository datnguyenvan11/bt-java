package entity;
import controller.FoodController;

import java.util.Scanner;


public class Menu {

    public void createMenu(){
        FoodController controller = new FoodController();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("————————FoodMenu——————— \n 1. " +
                    "Thêm món ăn.\n 2. " +
                    "Hiển thị danh sách món ăn.\n " +
                    "3. Thoát chương trình." +
                    "\n ——————————————————— \n"+
                    " nhập Lựa chọn của bạn  ");


            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    controller.addFood();
                    break;
                case 2:
                    controller.printList();
                    break;
                case 3:
                    System.out.println("Hẹn gặp lại ...;.");
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }
}
