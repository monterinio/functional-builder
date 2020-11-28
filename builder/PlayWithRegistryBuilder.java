package builder;

import builder.model.Rectangle;
import builder.model.Shape;
import builder.model.Square;
import builder.model.Triangle;
import java.util.function.Consumer;

public class PlayWithRegistryBuilder {

  public static void main(String[] args) {

    Consumer<Builder<Shape>> recConsumer = builder -> builder
        .register("rectangle", Rectangle::new);

    Consumer<Builder<Shape>> triConsumer = builder -> builder
        .register("triangle", Triangle::new);

    Consumer<Builder<Shape>> initializer = recConsumer.andThen(triConsumer);
    Registry registry = Registry.createRegistry(initializer, s -> {
      throw new IllegalStateException(s);
    });

    Factory<Rectangle> rectangleFactory = (Factory<Rectangle>) registry
        .buildShapeFactory("rectangle");
    System.out.println(rectangleFactory.newInstance());

    Factory<Triangle> triangleFactory = (Factory<Triangle>) registry.buildShapeFactory("triangle");
    System.out.println(triangleFactory.newInstance());

    Factory<Square> squareFactory = (Factory<Square>) registry.buildShapeFactory("square");
    System.out.println(squareFactory.newInstance());
  }
}
