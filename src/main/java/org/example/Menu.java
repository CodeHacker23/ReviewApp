package org.example;

import java.util.List;
import java.util.Scanner;

public class Menu {
    //    Declaring Static Classes
    Scanner scanner = new Scanner(System.in);
    ReviewService reviewService = new ReviewService();

    public void start() {

        while (true) {
            System.out.println("1 - Add review");
            System.out.println("2 - List All reviews");
            System.out.println("3 - Delete review");
            System.out.println("4 - Get reviews based on Date");
            System.out.println("5 - Sort reviews by date");
            System.out.println("6 or ... - exit");

            String command = scanner.nextLine();
            switch (command) {
                case "1" -> {

                }
                case "2" -> {
//                    Сервис получить все - Ларик. Итеративно sout все отзывы из дб,
//                    если отзывов нет - вывсети соответствующее сообщение
                }
                case "3" -> {
//                    Сервис удаление - Олег. Надо попросить у юзера через scanner,
//                    принять, проверить что отзыв с таким ID существует и если да,
//                    удалить, вывсети подтверждение

                }
                case "4" -> {
//                    Сервис Получить по дате - Саша.
//                    Принять дату, перевести в тип данных , если есть отзывы с этой даты,
//                    получить и вывести все, если не вывести соответствующее уведомление
                }
                case "5" -> {
                    List<Review> reviewList = reviewService.returnData();
                    for (Review review : reviewList){
                        System.out.println(review.toString());
                    }
                }
                default -> {
                    return;
                }
            }
        }
    }
}
