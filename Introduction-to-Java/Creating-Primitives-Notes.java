/**Creating Primitives */
"Creating a Primitive"
- To create, state its type and name it, followed by a semi-colon.
Ex;
  int x;
  boolean isStarted;
- can do more than on of the same type on the same line (for initialization)
Ex;
  int x, y, z;
  boolean isStarted, isAcceptable;
- Can declare primitives anywhere in your code;
- Their placement affects their visibility;
- Primitives that are declared inside a code block are only visible inside that
  block;
- Primitives are also only visible Below the point at which they are declared;
- Naming conventions for variables are Low Camel Case;
Ex;
  public class Car {
      //Some "primitive" data
      private int numberOfDoors;
      private int numberOfWheels;
  }
- Can be initialized when first declared, otherwise, Java sets a default;
  equivalent  to zero;
  - Note that best practice dictates that these types of variables are given;
    values in constructor methods;
Ex;
  public class Car {
      // Some "primitive" data
      private int numberOfDoors = 2;
      private boolean doorsExist = true;
  }
'Range of Primitive Types'

Type    Default  Size      Min Value                                   Max Value
boolean  false    1 bit                              |
char    /u0000   16 bits   /u0000                    |                    /uFFFF
byte       0      8 bits   -128                      |                       127
short      0     16 bits   -32768                    |                     32767
int        0     32 bits   -2147483648               |                2147483647
long       0     64 bits   -9223372036854775808      |       9223372036854775808
float     0.0    32 bits   +-3.40282347E+38          |          +-1.40239846E-45
double    0.0    64 bits   +-1.79769313486231570E+308|+-4.94065645841246544E-324
