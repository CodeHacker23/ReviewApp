package org.example;

import java.util.ArrayList;
import java.util.List;

public class Db {
    private static final List<Review> reviewList = new ArrayList<>();

    public static List<Review> getReviewList() {
        return reviewList;
    }


}
