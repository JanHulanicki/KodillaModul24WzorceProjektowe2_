package com.kodilla.patterns2.observer.forum.homework;
public interface ObservableTaskQueue {
    void registryObserverTaskQueue(ObserverTaskQueue observerTaskQueue);
    void notifyObserversTaskQueue();
    void removeObserverTaskQueue(ObserverTaskQueue observerTaskQueue);
}
