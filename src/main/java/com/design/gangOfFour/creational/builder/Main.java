package com.design.gangOfFour.creational.builder;

/**
 * Builder pattern
 *
 * https://en.wikipedia.org/wiki/Builder_pattern
 * https://refactoring.guru/design-patterns/builder {IMP} TODO
 * https://medium.com/@andreaspoyias/design-patterns-a-quick-guide-to-builder-pattern-a834d7cacead
 *
 * Builder constructs complex objects by separating construction and representation.
 *
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same construction code.
 *
 *
 *
 * key Words :
 *      Product - final product like laptop, car, pizza
 *      AbstractBuilder - creating and assembling product, it contains product & abstract behaviour of concrete builder
 *      ConcreteBuilder - derive the abstract builder methods, which representation needs to be created
 *      Director - here everything puts, like it directs everything takes builder, which creates & assembles
 *      Client (Main) - he decides which kind of builder he wants to use like benz car build (or) ford car builder
 *
 * (resolves telescoping constructor)
 */
public class Main {
}
/*
  <b>Director</b>

  You can go further and extract a series of calls to the builder steps you use to construct a product into a separate
  class called director. The director class defines the order in which to execute the building steps,
  while the builder provides the implementation for those steps.

  Having a director class in your program isn’t strictly necessary. You can always call the building steps in a specific
  order directly from the client code. However, the director class might be a good place to put various construction
  routines so you can reuse them across your program.

  In addition, the director class completely hides the details of product construction from the client code.
  The client only needs to associate a builder with a director, launch the construction with the director,
  and get the result from the builder.

 */

/**
 *
 */