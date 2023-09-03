package OOP.TaskAdnotacje;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
public @interface SuperMethod {
    public boolean run ();
}
