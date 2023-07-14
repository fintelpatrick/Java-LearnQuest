/** Wrapper and Array classses */

"The Eight Wrapper Classes"

- For each of the eight primitive types there is a corresponding Java class.;
- Java's structure makes it impossibel to use primitieves in certain situation.;
  In these cases, the wrapper classes must be used instead.

Primitive  |  Wrapper Class    ||  Primitive    |   Wrapper Class
int             Integer        ||    Short              Short
long             Long          ||    float              Float
boolean         Boolean        ||    double             Double
char           Character       ||     byte              Byte

"Bocing and Unboxing"

- Primitive values may be assigned to the corresponding Java wrapper class
  - Assigning a primitive value to an "instance" of the wrapper class is
    called 'Boxing'
    Ex;
      int i = 3;
      Integer w1 = i; //value of w1 is 3
      Integer w2 = 5; // value of w2 is 5
  - Assigning the wrapper instance to a primitive is called 'Unboxing';
    Ex;
      int j = w2; // value of j is 5. value of w2 is extracted from the wrapper

"Java Arrays"

- Arrays hold elements of a type and allow you to define a grouping of
  primitives or objects (references) with the same name;
- Each entry in the grouping is referenced by a number known as the index
  ranging from zero to one less than the size of the array;
- Arrays in Java are objects;
- To creat an array reference, you state the type followed by square brackets
  and a name:
            int[] myIntArray;
  - This simply tells the compiler that we ant an array of ints. It doesnt say
    how many, or what their values will be;
- To initialize an array we use the 'new' operator and another set of square
  brackets like this:
                    int[] myIntArray = new int[25];
  ^-- This statement tells the compiler to set up space for 25 'ints'.
   -- Now we can set the value of the first 'int' in the array:
                    myIntArray[0] = 42;

"Iniitialization Short Cut"

- Java will accept the follwoing syntax to create an array and set its length
  and values all in one statement:
             int[] myIntArray = {11, 12, 13, 14, 15};
  ^-- This statement creates an array called myIntArray which has a length of
      five. The first entry (myIntArray[0]) is set to 11 and the last entry
      (myIntArray[4]) is set to 15.
   -- Note: that it does not even require the 'new' operator, cause the brackets
            do that for us.
- Can create arrays on any of the eight primitive Types
- Can also create them from any Java object refernce. For Example, here is a an
  array of Strings:
              String[] pets = {"Fido", "Rex", "Princess"};
  ^--Note the strings in the array here are initialized Here. They did not need
     to be initialized before.

"Array Lengths"

- Java provides every Array you create with a single attribute named 'length'
- This is useful since the length of an array is a piece of information youll
  need almost every time you work with an array
- To put the length (umber of elements) of myIntArray into an 'int' called 'x'
  we would code:
              int x = myIntArray.length;
