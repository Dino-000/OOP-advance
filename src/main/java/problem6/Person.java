package problem6;

import lombok.Data;

@Data
public abstract class Person {
    private String name;
    private String address;

    @Override
    public String toString() {
        return
                "name= " + name + '\n' +
                "address= " + address + '\n'
                ;
    }
}
