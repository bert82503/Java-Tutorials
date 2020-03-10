package javaOO.examples;

import java.util.Objects;
import java.util.Optional;

/**
 * 匿名类字节码。
 *
 * @author dannong
 * @since 2017年06月12日 23:18
 */
public class AnonymousClass {

    /*
public static void main(java.lang.String[]);
Code:
   0: ldc           #2      // String
   2: invokestatic  #3      // Method java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;
   5: invokedynamic #4,  0  // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
  10: invokevirtual #5      // Method java/util/Optional.filter:(Ljava/util/function/Predicate;)Ljava/util/Optional;
  13: invokedynamic #6,  0  // InvokeDynamic #1:apply:()Ljava/util/function/Function;
  18: invokevirtual #7      // Method java/util/Optional.map:(Ljava/util/function/Function;)Ljava/util/Optional;
  21: pop
  22: return
     */
    public static void main(String[] args) {
        Optional.of("")
                .filter(Objects::isNull)
                .map((str) -> str);
    }

}
