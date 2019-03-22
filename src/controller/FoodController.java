package controller;

import entity.Food;

import java.util.ArrayList;
import java.util.Scanner;


public class FoodController {
    private ArrayList<Food> foodArrayList = new ArrayList<>();

    public  void addFood(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã cho món ăn:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên cho món ăn:");
        String name = scanner.nextLine();
        System.out.println("Nhập thông tin món ăn:");
        String description = scanner.nextLine();
        System.out.println("Nhập giá món ăn:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập ngày tạo món ăn:");
        String createdAt = scanner.nextLine();

        foodArrayList.add(new Food(id, name, description, price, createdAt));

        System.out.println("Thêm thành công món ăn!");
    }

    public void printList(){
        System.out.println(String.format("%15s| %15s| %15s| %15s\n", "Mã món ăn", "Tên món ăn", "Giá món ăn", "Ngày tạo món ăn"));
        for (int i = 0; i <foodArrayList.size() ; i++) {
            Food food=foodArrayList.get(i);
            System.out.println(food.toString());
        }

        }

}
