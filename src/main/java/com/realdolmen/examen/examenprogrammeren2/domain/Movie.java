package com.realdolmen.examen.examenprogrammeren2.domain;

public class Movie {
//variable
private int id;
private String titel;
private String genre;

//einde variabel


/////constructors

public Movie()
{
}

    public Movie(int id, String titel, String genre) {
        this.id = id;
        this.titel = titel;
        this.genre = genre;
    }

//eind constructor
//mathode(taken)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return titel;
    }

    public void setTitle(String titel) {
        this.titel = titel;
    }

    public String getGenre() {
        return genre;
    }

//getters en setter
    public void setGenre(String genre) {
        this.genre = genre;
    }

//einde getters en setter





//ToString

    @Override
    public String toString() {
        String movieCart ="|    Titel : " + titel +"***************" +  "Genre : " + genre + "  |" ;
        
        return movieCart;
    }





}
