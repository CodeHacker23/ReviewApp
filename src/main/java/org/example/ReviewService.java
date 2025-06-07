package org.example;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReviewService {

    public void addReview(String text, String name) {
        Review review = new Review((long) RandomId.getAnInt(), LocalDate.now(),text, name);
        Db.getReviewList().add(review);
    }


    public static List<String> returnData(){
        return Db.getReviewList().stream()
                .sorted(Comparator.comparing(Review::getLocalDate).reversed())
                .map(review -> String.format("Автор: %s | Дата: %s | Отзыв: %s",
                        review.getName(),
                        review.getLocalDate(),
                        review.getText()))
                .collect(Collectors.toList()).reversed();

    }

}
