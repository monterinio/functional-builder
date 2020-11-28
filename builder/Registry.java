package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
package builder;

import com.google.common.base.Function;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface Registry<T> {

  static <T> Registry<T> createRegistry(Consumer<Builder<T>> consumer,
      Function<String, Factory<T>> errorFunction) {
    Map<String, Factory<T>> map = new HashMap<>();
    Builder<T> builder = (label, factory) -> map.put(label, factory);
    consumer.accept(builder);

    return shape -> map.computeIfAbsent(shape, errorFunction);
  }

  Factory<T> buildShapeFactory(String shape);

}
