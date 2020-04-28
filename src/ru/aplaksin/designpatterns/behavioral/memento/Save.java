package ru.aplaksin.designpatterns.behavioral.memento;

import java.util.Date;

public class Save {
    private final String version;
    private Date date;

    public Save(String version, Date date) {
        this.version = version;
        this.date = date;
    }

    public Save(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
