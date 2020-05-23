package com.company;

public class NotRecommended implements Recommendation {
    @Override
    public String recommendation() {
        return "This weapon is recommended for warfare.";
    }
}
