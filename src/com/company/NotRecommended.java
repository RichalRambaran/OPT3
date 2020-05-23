package com.company;

public class NotRecommended implements Recommendation {
    @Override
    public String recommendation() {
        return "This weapon is not recommended for warfare, but is still allowed.";
    }
}
