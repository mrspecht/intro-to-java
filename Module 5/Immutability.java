// Immutable objects

import java.util.*;

public final class Animal {                                                     // The class, or getters, must be final
  private final String species;                                                 // The instance variables are private and final
  private final List<String> foods;

  public Animal(String species, List<String> foods) {                           // The constructor is used to set all properties of the object
    this.species = species;                                                     // It may be public

    if (foods == null) {
      throw new RuntimeException("Foods are required");
    }
    this.foods = new ArrayList<String>(foods);                                  // References to mutable objects cannot be shared
  }

  public String getSpecies() {                                                  // An immutable class has no setter methods, and the getters
    return species;                                                             // cannot be overridden
  }

  public int getFoodsCount() {
    return foods.size();
  }

  public String getFoods(int index) {                                           // String is already immutable
    return foods.get(index);
  }
}
