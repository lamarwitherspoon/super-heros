package witherspoon;

public class Main {

    public static void main(String[] args) {


        Cookingassparagus ironchef = new Cookingassparagus("Start with a small circled pan", "Your pan should be at high heat with oil","Use any spicea that you want","Your meal will take about 10min" );


        System.out.println(ironchef.WhatKindOfPan);

        System.out.println(ironchef.HowHotShouldPanBe);

        System.out.println(ironchef.WhatKindOfSpices);

        System.out.println(ironchef.HowLongShouldThisMealTake);

        ironchef.setSecretIngredient("Ask Iron chef" );

        System.out.println(ironchef.getSecretIngredient());

        System.out.println(ironchef.getClass());


    }
}
