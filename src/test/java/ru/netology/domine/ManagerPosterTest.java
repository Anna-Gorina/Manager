package ru.netology.domine;

import org.junit.jupiter.api.Test;
import ru.netology.domine.ManagerPoster;

import static org.junit.jupiter.api.Assertions.*;

class ManagerPosterTest {

    @Test
    void shouldFindAllMovie() {
        ManagerPoster test = new ManagerPoster();

        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентельмены",
                "Отель 'Белград'",
                "Вперёд",
                "Бладшот"
        };

        String[] actual = test.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMovieAndFindAllMovie() {
        ManagerPoster test = new ManagerPoster();
        test.addMovie("Оля");
        String[] expected = {
                "Оля",
                "Номер один",
                "Тролли. Мировой тур",
                "Человек-невидимка",
                "Джентельмены",
                "Отель 'Белград'",
                "Вперёд",
                "Бладшот"
        };
        assertArrayEquals(expected,test.getAll());
    }


    @Test
    void shouldFindAllMovieFrom2Movie() {
        ManagerPoster test = new ManagerPoster(2);
        String[] expected = {
                "Номер один",
                "Тролли. Мировой тур"
        };
        String[] actual = test.getAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    void addMovieLength() {
        ManagerPoster test = new ManagerPoster();
        int expected = 8;
        test.addMovie("Оля");
        assertEquals(expected, test.movie.length);
    }





    @Test
    void shouldAddMovie() {
        ManagerPoster test = new ManagerPoster();
        test.addMovie("Оля");
        String[] expected = {
                "Бладшот",
                "Вперёд",
                "Отель 'Белград'",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один",
                "Оля"
        };
        assertArrayEquals(expected, test.movie);
    }
}