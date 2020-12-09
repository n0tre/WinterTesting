package com.ncedu.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Field {
    public List<String> workers = new ArrayList<>();
    public double percentage;

    @Autowired
    Worker worker;


    public void addWorker(String name) {
        workers.add(name);
    }

    public void fieldManage() {
        if (getPercentage() > 0.5) {
            workers.remove(1);
            System.out.println("Пересчитал количество работников и одного решил убрать");
        }
        else if (getPercentage() < 0.2) {
            addWorker("Bot" + Math.random());
            System.out.println("Пересчитал количество работников и одного решил добавить");
        }
        else {
            System.out.println("Работников в самый раз (20 - 50%)");
        }
    }

    public double getPercentage() {
        return (workers.size() / 5.0);
    }

    public void whatAboutPercents() {
        System.out.println("Cейчас заполнено " + getPercentage() * 100 + " процентов");
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public List<String> getWorkers() {
        return workers;
    }

    public void setWorkers(List<String> workers) {
        this.workers = workers;
    }
}
