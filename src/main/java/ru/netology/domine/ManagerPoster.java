package ru.netology.domine;

public class ManagerPoster {
    int countMovie;
    String[] movie = {
            "Бладшот",
            "Вперёд",
            "Отель 'Белград'",
            "Джентельмены",
            "Человек-невидимка",
            "Тролли. Мировой тур",
            "Номер один",
    };


    public void addMovie(String newMovie) {

        String[] tmp = new String[movie.length + 1];

        System.arraycopy(movie, 0, tmp, 0, movie.length);

        tmp[tmp.length - 1] = newMovie;
        movie = tmp;
    }


    public String[] getAll() {
        int resultLength;
        if (movie.length < countMovie) {
            resultLength = movie.length;
        } else {
            resultLength = countMovie;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movie.length - i - 1;
            result[i] = movie[index];
        }
        return result;
    }


    public ManagerPoster(int countMovie) {
        this.countMovie = countMovie;
    }

    public ManagerPoster() {
        this.countMovie = 10;
    }
}