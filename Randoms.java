package patterns_Iterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    int a,b;
    protected Random random = new Random();

    public Randoms(int a, int b) {
        this.a = a-1; //-1 чтобы в выборку попадали пограничные значения
        this.b = b+1; //+1 чтобы в выборку попадали пограничные значения
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                while (true) {
                    return random.ints(a,b)
                                 .findAny()
                                 .getAsInt();
                    }
                }
        };
    }

}
