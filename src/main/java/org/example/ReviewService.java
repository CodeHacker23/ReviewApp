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


    public List<Review> returnData(){
        List<Review> returnList = Db.getReviewList().stream()
                .sorted(Comparator.comparing(Review::getLocalDate))
                .collect(Collectors.toList());
        return returnList;
    }

    public void deleteReviewById(Long id) {
        boolean reviewRemoved = Db.getReviewList().removeIf(review -> review.getId().equals(id)); //compares review id with input, delete if true
        if(reviewRemoved){
            System.out.println("Review removed successfully");
        }else {
            System.err.println("Review with this id doesn't exist");
        }
    }

}
