public class Book implements  Comparable <Book>{

    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation){
        this.name = name;
        this.ageRecommendation = ageRecommendation;

    }

    public String getName(){
        return this.name;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }


    @Override
    public String toString(){


        return String.format("%s (recommended for %d years-old or older)",this.name, this.ageRecommendation);
    }

    @Override
    public int compareTo(Book o) {
        if (this.getAgeRecommendation() == o.getAgeRecommendation()) {
            return 0;
        } else if (this.getAgeRecommendation() > o.getAgeRecommendation()) {
            return 1;
        } else {
            return -1;
        }
    }



}



