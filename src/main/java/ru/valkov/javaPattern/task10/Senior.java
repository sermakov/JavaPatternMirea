package ru.valkov.javaPattern.task10;

import org.springframework.stereotype.Component;

@Component
public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Senior");
    }
}
