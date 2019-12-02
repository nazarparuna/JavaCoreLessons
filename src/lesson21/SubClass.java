package lesson21;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class SubClass extends BaseClass {

    @Getter
    @Setter
    String name;
    @Setter
    @Getter
    int number;

    @Getter
    @Setter
    boolean isOld;

    @Override
    void print() {
        super.print();
    }

    @Deprecated
    void print2() {

    }
}
