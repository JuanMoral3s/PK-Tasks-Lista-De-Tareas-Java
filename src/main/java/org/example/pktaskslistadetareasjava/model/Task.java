package org.example.pktaskslistadetareasjava.model;

public class Task {

    private String title;
    private boolean status = false;
    private String text;

    public Task(String title,String text){
        this.title = title;
        this.text = text;
    }

    public Task(String title){
        this.title = title;
    }

    public void setTitle(String title){this.title = title;}
    public void setText(String text){this.text = text;}
    public void setStatus(boolean status){this.status = status;}

    public String getTitle(){return this.title;}
    public String getText(){return this.text; }
    public boolean getStatus(){return this.status;}

    @Override
    public String toString() {
        return title + " | " + text;  // usa '|' para separar título y texto
    }

    public static Task fromString(String line) {
        String[] parts = line.split("\\|", 2);
        if (parts.length < 2) return null;
        return new Task(parts[0], parts[1]);
    }

}
