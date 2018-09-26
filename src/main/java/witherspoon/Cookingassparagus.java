package witherspoon;

public class Cookingassparagus {



    String WhatKindOfPan;
    String HowHotShouldPanBe;
    String WhatKindOfSpices ;
    String HowLongShouldThisMealTake;
    private String secretIngredient;




    Cookingassparagus(){


    }



    public Cookingassparagus (String WhatKindOfPan, String HowHotShouldPanBe, String WhatKindOfSpices,String HowLongShouldThisMealTake)
    {
        this.WhatKindOfPan=WhatKindOfPan;
        this.HowHotShouldPanBe=HowHotShouldPanBe;
        this.WhatKindOfSpices=WhatKindOfSpices;
        this.HowLongShouldThisMealTake=HowLongShouldThisMealTake;
    }


    public String WhatKindOfPan()
    {

        return WhatKindOfPan;
    }


    public String HowHotShouldPanBe()
    {

        return HowHotShouldPanBe;
    }


    public String WhatKindOfSpices()
    {

        return WhatKindOfSpices;
    }


    public String HowLongShouldThisMealTake() {
        return HowLongShouldThisMealTake;
    }

    private  String getBoil (String boil){

        return  "If you boil the asparagus it will cook faster" + boil ;
    }


    public void  setSecretIngredient(String yummy){

        this.secretIngredient = yummy;

    }
    public String getSecretIngredient(){

        return secretIngredient  ;
    }















}
