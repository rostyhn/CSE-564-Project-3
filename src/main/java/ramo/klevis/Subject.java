package ramo.klevis;

import java.util.ArrayList;

public interface Subject {

    public void addObserver(Watcher watcher);

    public void removeObserver(Watcher watcher);

    public void notifyObservers();
}