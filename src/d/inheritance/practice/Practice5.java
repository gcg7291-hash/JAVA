package d.inheritance.practice;

class Movie {
    String title;
    double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    void displayInfo() {
        System.out.print(title +"(평점: "+ rating + ")");
    }
}

class ActionMovie extends Movie {
    String specialEffects;

    public ActionMovie(String title, double rating, String specialEffects) {
        super(title, rating);
        this.specialEffects = specialEffects;
    }
    void displayInfo() {
        System.out.print("[액션] ");
        super.displayInfo(); // 부모의 기본 정보 출력 (제목, 평점)
        System.out.println(" - 특수효과: " + specialEffects);
    }
}

class Comedy extends Movie {
    String humorStyle;

    public Comedy(String title, double rating, String humorStyle) {
        super(title, rating);
        this.humorStyle = humorStyle;
    }

    void displayInfo() {
        System.out.print("[코미디] ");
        super.displayInfo();
        System.out.println("- 유머: " + humorStyle);
    }
}

class Drama extends Movie {
    String theme;

    public Drama(String title, double rating, String theme) {
        super(title, rating);
        this.theme = theme;
    }

    void displayInfo() {
        System.out.print("[드라마] ");
        super.displayInfo();
        System.out.print("- 주제: 계급 갈등");
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Movie[] movies = {
                new ActionMovie("어벤져스", 4.5, "최고급 CG"),
                new Comedy("극한직업", 4.7, "상황 코미디"),
                new Drama("기생충", 4.9, "계급 갈등")
        };

        for (Movie movie : movies) {
            movie.displayInfo();
        }


    }
}
