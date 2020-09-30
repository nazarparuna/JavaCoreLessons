package lesson3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    @Getter
    private String name;
    @Getter
    private String species;
}
