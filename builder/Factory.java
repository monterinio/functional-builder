package builder;

import java.util.function.Supplier;

public interface Factory<T> extends Supplier<T> {

  default T newInstance() {
    return this.get();
  }

  static <T> Factory<T> createFactory(Supplier<T> sup) {
    return () -> sup.get();
  }

}
