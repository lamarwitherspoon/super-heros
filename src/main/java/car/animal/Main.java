package car.animal;

public class Main {


    public static void main(String[] args) {


    String[] listOfWords = {"4/20", "i", "want", "to", "do", "better", "critical thinking",
                            "focused", "libria", "and", "lamar", "just", "do", "it"};


    String[] listOfWordsTwo = {"networked","happy- birthday","portal", "space", "potential","funny",
                                "bright", "beautiful", " good- company",};

    String[] listOfWordsThree = {"accelarated", "bang","vison","corn","solution", "copertive", "outside-the-box", "God",
                                    "misson", "mindshare", "leveraged", "networked"};



        int deez = listOfWords.length;

        int fucking = listOfWordsTwo.length;

        int nuts = listOfWordsThree.length;



        int u = (int) (Math.random()* listOfWords.length);

        int lil = (int) (Math.random()* listOfWordsTwo.length);

        int hoe = (int) (Math.random()* listOfWordsThree.length);




        String phrase = listOfWords [u] + " " + listOfWordsTwo [lil] + " " + listOfWordsThree[hoe];

        System.out.println("The words in my phase are " + phrase);




































































































































    }
}
