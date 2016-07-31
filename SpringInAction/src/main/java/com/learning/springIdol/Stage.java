package com.learning.springIdol;

public class Stage {
    private String name = "spring idol arena";

    private Stage() {}

    private static class StageLazyInstance {
        static Stage stage = new Stage();
    }

    public static Stage getInstance() {
//        return StageLazyInstance.stage;
        return null;
    }

    public String getStageName() {
        return name;
    }
}
