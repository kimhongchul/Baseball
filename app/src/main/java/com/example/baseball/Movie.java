package com.example.baseball;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public List<Actor> leadingActors;
    public List<Actor> supportingActors;
    public String title;
    public int showingAge;
    public String genre;
    public static class Actor {
        public String realName;
        public String stageName;
        public int age;
        public String gender;
        public List<Movie> actedMovies;
    }

    public static List<Actor> casting(List<Movie> movies) {
        List<Actor> recommandActors = new ArrayList();

        for(Movie movie : movies) {
            if(movie.title.contains("도시")) {
                for(Actor actor : movie.leadingActors) {
                    if(actor.gender.equals("W")
                    && actor.actedMovies.size() >= 5
                    && actor.age >= 20
                    && actor.age < 30) {
                        recommandActors.add(actor);
                    }
                }
                for(Actor actor : movie.supportingActors) {
                    if(actor.gender.equals("M")
                            && actor.age >= 30
                            && actor.age < 40) {
                        for(Movie actedMovie : actor.actedMovies) {
                            if(actedMovie.genre.equals("공포")) {
                                recommandActors.add(actor);
                            }
                        }
                    }
                }
            }
        }

        return recommandActors;
    }
}
