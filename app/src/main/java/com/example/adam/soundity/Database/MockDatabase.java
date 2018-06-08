package com.example.adam.soundity.Database;

import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.DataModel.Genre;
import com.example.adam.soundity.DataModel.Level;
import com.example.adam.soundity.DataModel.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MockDatabase {

    private static List<Announcement> announcements = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static List<Genre> genres = new ArrayList<>();
    private static List<Level> levels = new ArrayList<>();
    private static AtomicInteger announcementID = new AtomicInteger();
    private static AtomicInteger genreID = new AtomicInteger();
    private static AtomicInteger levelID = new AtomicInteger();
    private static AtomicInteger userID = new AtomicInteger();


    static{
        genres.add(new Genre(genreID.getAndIncrement(), "Jazz"));
        genres.add(new Genre(genreID.getAndIncrement(), "Rock"));
        genres.add(new Genre(genreID.getAndIncrement(), "Alternative"));
        genres.add(new Genre(genreID.getAndIncrement(), "Disco polo"));
        genres.add(new Genre(genreID.getAndIncrement(), "Free Jazz"));
        genres.add(new Genre(genreID.getAndIncrement(), "Pop"));
        genres.add(new Genre(genreID.getAndIncrement(), "Psycho"));
        genres.add(new Genre(genreID.getAndIncrement(), "Independent"));
        genres.add(new Genre(genreID.getAndIncrement(), "Indie rock"));

        levels.add(new Level(levelID.getAndIncrement(), "LOW"));
        levels.add(new Level(levelID.getAndIncrement(), "MEDIUM"));
        levels.add(new Level(levelID.getAndIncrement(), "HIGH"));
        levels.add(new Level(levelID.getAndIncrement(), "PRO"));

        users.add(new User(userID.getAndIncrement(), "Dawid", "policja"));
        users.add(new User(userID.getAndIncrement(), "admin", "admin"));
        users.add(new User(userID.getAndIncrement(), "Damian", "policja"));
        users.add(new User(userID.getAndIncrement(), "Adam", "policja"));

        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(0), "Trumpet", getLevelById(0), 1, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(1), "Guitar", getLevelById(1), 2, "Just need someone to play good with me. I'm not very demanding but you should be able to play lots od scales. by by"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(2), "Drums", getLevelById(2), 1, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(3), "Piano", getLevelById(0), 0, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(4), "Sax", getLevelById(0), 0, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(5), "Vocal", getLevelById(3), 1, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(6), "Synch", getLevelById(2), 2, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(7), "Pots", getLevelById(1), 1, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(0), "Bass", getLevelById(1), 1, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(1), "Bass", getLevelById(1), 2, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
        announcements.add(new Announcement(announcementID.getAndIncrement(), getGenreById(2), "Drums", getLevelById(2), 0, "Hello, Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!"));
    }

    private static Genre getGenreById(int id){
        for (Genre genre : genres){
            if (genre.getId() == id)
                return genre;
        }
        return null;
    }

    private static Level getLevelById(int id){
        for (Level level : levels){
            if (level.getId() == id)
                return level;
        }
        return null;
    }

    public static Genre getGenreByName(String name){
        for (Genre genre : genres){
            if (genre.getName().equals(name))
                return genre;
        }
        return null;
    }

    public static Level getLevelByName(String name){
        for (Level level : levels){
            if (level.getName().equals(name))
                return level;
        }
        return null;
    }

    public static List<Genre> getGenres() {
        return genres;
    }

    public static List<String> getGenresNames(){
        List<String> list = new ArrayList<>();
        for (Genre genre : genres){
            list.add(genre.getName());
        }
        return list;
    }

    public static List<String> getLevelsNames(){
        List<String> list = new ArrayList<>();
        for (Level level : levels){
            list.add(level.getName());
        }
        return list;
    }

    public static User getUserById(int id){
        for (User user : users){
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public static void setGenres(List<Genre> genres) {
        MockDatabase.genres = genres;
    }

    public static List<Announcement> getAnnouncements() {
        return announcements;
    }

    public static void setAnnouncements(List<Announcement> announcements) {
        MockDatabase.announcements = announcements;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        MockDatabase.users = users;
    }

    public static void addAnnouncement(Announcement announcement){
        announcement.setId(announcementID.getAndIncrement());
        announcements.add(announcement);
    }
}
