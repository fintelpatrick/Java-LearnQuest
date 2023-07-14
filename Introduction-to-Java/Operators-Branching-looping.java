/** Operators, branching, looping */

"Operators"

Assignment operator -> =
Mathematical operators -> + - * / %
Unary increment or decrement -> ++ --
Relational operators -> < == > <= >= !=
Logical operators -> &&(and) ||(or) !(not)
Logical and Bitwise operators -> & | ~(complimenting) ^(exclusive or) <<(shift left)
                                 >>(shift right) >>>(shift right taking in sign)
Dot (.) operator -> used to access attributes and methods within a specific
                    instance of a class

"Assignment Operator"
int i, j;
i = 42; // i takes the value 42
j = 21; // j takes the value 21
i = 21; // old value overwritten
i = i + j; // i takes the value 42

"Unary Operators"
Java has prefix and postfix increment and decrement operators:
    - prefix increment (++i) increments i by 1 and then uses it in the expression
    - prefix decrement (--i) decrements i by 1 and then uses it in the expression
    - postfix increment(i++) uses i in the expression and then increments it by 1
    - postfix decrement (i--) uses i in the expression and then decrements it by 1

"Boolean Operators"
               NOT     AND      OR      XOR
x      y       !x      x&y      x|y     x^y // this last is exclusive 'OR'
true   true   false   true     true    false // only one or the other may be
true   false  false   false    true    true  // true - not both.
false  true   true    false    true    true
false  false  true    false    false   false

- && and || are short circuit operators
    - if the first condition in the && statement is false, the second one is
      not even evaluated
    - if the first condition in then || statement is true, the second one is
      skipped
- & and | do not short circuit and in general are not used
- & | ^ applied to integral variables are performed bitwise
- boolean operators can be used to combine relational expressions
  Ex:
    int x = 7;
    int y = 9;
    if (x < 8 && y < 10){   // The expression is true
          //code
    }
    boolean b = x > 8 || y < 3; //The result of the expression is assigned to b

"If Statements"
The if statement works with the relational operators to execute a block of code
only if some condition is true
    if( x > y ) {    // Code block starts here
        System.out.prinln("X is less than Y.");
        z = y - x;
    }                // Code block ends here
If you only want to execute one statement when you if condition is true, you do
not need to use the braces (however, it is best practice to always include them)
    int x = 7;
    int y = 9;

    if( x < y ) //Might even be a good idea to have it all on the same line here
            System.out.println("X is less than Y.");
    System. out.println("This line always prints.");

"Else Statements"
Setting up a block of code that will execute only when the comparison is false:
    if( availableCash > salePrice ){
        System.out.println("Lemme at it!");
    }
    else{                   //both these statements could be done w/o {}
        System.out.println("Save more money");
    }

"Nested If Statements"
int x = 7;
int y = 9;
int z = 0;

if( x > 3 ) {
    System.out.println("X > 3"); // indentation helps readability, but isnt
    if( y > 10 ) {               // strictly necissary. Only the {} are.
        System.out.println("Y < 10");
        z = x + y;
    }
    x--;
}

'Multiple ifs - the else if'
int x = 7;
int y = 9;

if( x < 3 ) {
    System.out.println("X < 3");
}
else if( x < 6 ) {
    System.out.println("X < 6, but not < 3");
}
else {
    System.out.println("X > 5");
}

"Ternary Expressions"
Ternary expressions pproduce a value based on the truth of the expression
    in y = ( x > 7 ) ? 2 : 5;
          //if x > 7 is true then y is set to 2. Otherwise it is set to 5
  Format is: ( condition ) ? True
             value: false value;  //Ternaries short circuit

  - if the condition preceding the '?' is true, then what ever expression that
    is between the '?' and the ":" is evaluated and is the result of the
    overall expression
  - if the condition is not true, then whatever expression that is after the ":"
    is evaluated and is the result of the expression

"Switch Statement"
An alternative to complex nested if statements. A switch is not based on a
condition, it is based on a comparison of values. It tells us where to jump in a
list of statements to then execute.
Its general form is as follows:
    switch (<integral expression>)
     {
       case label1:
         <statement1>
       case label2:
         <statement2>
       case labeln:
         <statementn>
       default:
         <statement>
     }
switch example:
    switch ( wattage ) { //based on the value of wattage
        case 40:
            price = 120;
            break;      //break statement to terminate the switch
        case 60:
            price = 1.30;
            break;
        case 100:      //Deliberate 'fall through' to repeat code for different
        case 150:      //case values
            pprice = 1.15;
            break;
        default:       //optional catch-all
            price = 0;
    }                  //End switch
"Switch statemnt example with strings"

public String getTypeOFDayWithSwitchStatement(String dayOfWeekArg) {
    String typeOfDay;
    switch (dayOfWeekArg) {
        case "Monday":
            typeOfDay = "Start of work week";
            break;
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
            typeOfDay = "Midweek";
            break;
        case "Friday":
            typeOfDay = "End of work week";
            break;
        case "Saturday":
        case "Sunday":
            typeOfDay = "Weekend";
            break;
        default:
            throw new IllegalArgumentException("Invalid day of the week: " +
                                                dayOfWeekArg);
    }
    return typeOfDay;
}

"The While Statement"
The while staement execlutes a code block over and over again. As long as the
test condition remains true the code block will keep repeating.

// dispaly n asterisks
int count  0;             // If we remove the 'count++;' statment, this will
int n = 20;               // loop forever
while ( count < n ) {
    System.out.print("*");// if 'count' is set to 20 before the while statement,
    count++;              // the while block will not run at all
}

'Do while statement'
The 'do while' provides a loop that will always run at least once. The test isnt
performed until the end of the 'while' block
//print DW once
int count = 20;
int n = 20;
do {
    System.out.print("DW");
    count++:        // ensures the loop will run at least once. It executes the
} while (count < n);// loop before it checks the 'while' statement

"The For Statement"
The 'for' statement was created to help precent loops which never stop running
due to coding errors. Its signature takes three expressions which are separated
by semi-colons. Note: the semicolons are required - the expressions are optional

for (int 1=0; 1<10; i++) { // 'int i=0' -> initialize
  // code int the block       'i<10;'   -> test
}                          // 'i++'     -> Post block
int i, j;
for(i=0, j=2;  i<10;  j+=3) {
  // i increments by 1, j by 3
}

This next one is called a "for-each" loop.
- the for loop block is invoked "for each" element in the collection.
- Anything that implements the Iterable interface may be used in this kind of
  loop
// general form of the loop:
for ( type name : collection) {
  // invoke methods of name
}
Examples:
String[] sa = { "o1", "o2", "o3"};
for (String s : sa) {
    System.out.println(s.toString());
}   // prints o1 o2 o3
Integer[] ia = {1, 2, 3};
for (Integer i2 : ia) {
    System.out.println(i2.intValue());
}   // prints 1 2 3

"The Break and Continue Statements"

The 'break' statement when executed in a while, for, do-while or switch structure
causes an immediate exit from that structure:
    int count = -1;
        while( count++ <= endValue ) {
             int someVar = readData();
             if( someVar == badValue ){
                 break;
             }
        System.out.println( count );
      }

The 'continue' statement when executed in the body of a while, for, or do-while
structure skips the remaining statements and begins the next iteration:
    for ( count = 1; count <== 10; count++) {
        if ( count == 7 )
            continue;
        System.out.print(count + ", ");
    }
    // output - 1, 2, 3, 4, 5, 6, 8, 9, 10
