package lesson24.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
}
