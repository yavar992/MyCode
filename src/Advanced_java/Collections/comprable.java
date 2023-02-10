package Advanced_java.Collections;

import org.jetbrains.annotations.NotNull;

public class comprable implements Comparable<a>{

    @Override
    public int compareTo(@NotNull a o) {
        return o.getRoll_no();
    }
}
