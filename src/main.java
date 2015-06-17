/**
 * Created by s0urc3d3v3l0pm3nt on june 16 2015
 */
 /**
  *  This file is part of intro.

    intro is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    intro is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with intro.  If not, see <http://www.gnu.org/licenses/>.
    */
    
public class main {
    public static void main(String[] args) //This boilerpate you need it but don't wory about the meaning

    {
        int x; //initizing a variable
        int y = 100; //initiziling a variable and setting its vaule
        x = 5;
        //This last example is for assigning a value to a variable IF it has been initialized

        String hello = "Hello World"; //hello carries the value of hello world
        String five = "5"; //Note that here that the computer can NOT understand strings "string" meaning they have quotes
        //If they have no quotes the computer understands the meaning of the number
        //SO...
        int n = 10;
        int q = 15;
        int sum = n + q; //computer understands this as 10 + 15

        String nS = "10";
        String qS = "15";
        String sumS = nS + qS; //computor understand this as "djkfksqdkg" + "sdhksjgj" = "concatinated jiberrise"
        //IF IT IS IN QUOTES THE COMPUTOR DOES NOT CARE ABOUT THE MEANING this can be good OR bad

        /**
         * keywords are words that are recognized by the compiler as having a specific meaning
         * These words are words like "int", "string", "double", "float"
         * "new", "unsigned" etc... they can't be used as variable names
         *
         * Now lets use some of them, you already have used int and have seen that it create a number variable without decimals
         * Now we will see a double, this will create a number with decimals and that can be bigger
         *
         */

        double d = 10.5;
        double h = 19201904;

        //It is important to note that becuase an int can not have a decimal it is DROPPED so 5.1 + 5.1 = 10 NOT 10.2
        //It also does not round ints so 12.8 + 1.1 = 13 NOT 14 like it would do if it rounded
        //doubles will drop at some point to but it is a lot bigger numbers and we don't need to worry about it right now

        //The next thing we will talk about is float's these are floating point numbers
        float f = 10;

        //Next lets look at loops
        /**
         * There are three major types of loops
         * While - run until a condition is false
         * for - run until a condition is false with an initilizer and an increment (a more robust and useful while loop)
         * do while  Runs once and then runs until the condition is false
         *
         * You will use the for loop most
         *
         * With a for loop you have an initilizer (a variable) a condition (a < 10) and a increment(a++)
         * Here is the syntax in code for (initiliezer; condition; increment){code...}
         * Lets look at an example
         */
        int a = 5;
        for (int b = 1/**inilizes the variable for incrementing*/; b < a /**condition*/; b++ /** increment, in this case adding one*/ )
        {
            System.out.println(b); //this is just example code anything can be here

        }
        //when we talk about incrementing we are talking about the number that is used to control the loop's runs


        //Next we will look at the while loop

        /**
         * We can think of this as the for loop without the control
         */

        int var1 = 10;
        int var2 = 20;

        while (var1 < var2)
        {
            //code here to be looped
        }
        /**
         * This is what is known as an infinate loop it will run forever becuase there is never a time when 10 < 20
         * Usally we will use a variable that will change to change the loop state for example say we have a loop that runs until the user
         * enters stop we can loop whenerver the string is NOT stop when it is the loop will stop and therefore it is not an infinite loop
         * Infinate loops are almost always bad
         */

        /**
         * The last kind of loop is the do while which does somthing once and tehn will repeat it if the condition is true
         * do (condition){
         * //run once and then more if conditional is true
         * }while (condition )
         *This is like a while loop but it runs once even if the condition is false whereas a while loop does not
         */

        int do1 = 20;
        int do2 = 50;
        do {
            //code
        }while(do1 < do2);

        /**
         * Now lets talk about methods, some people will call these functions they are very similar but in java they are all
         * methods c and other langauges have functions or both but java just has methods.
         *Beware: a lot of people will say function when they mean method beucase it is more convntional but they know the differance you need to correct them
         *
         * A function is a block of code that can be run multiple times in can have a return value ie what come out and input variables ie what goes in
         * it looks like this in java: public int findTheSum(int x, int y){//code return ...}
         * The public part is a keyword that means that method can be run from any class in the program ampung other things
         * but don't worry about that right now
         * The int in the begining tells what type of value is going to come out of the fucntion, if nothing is coming
         * out of the method you can say void ie public void method(){}
         * the int x and int y are input values, meaning that they are variable that are only avaibale in that method and are refered
         * to by the names given in the parenthesis here it is x and y.
         * The reason for this is that it allows you to run the method multiple times with differnet values and have
         * it still work
         *
         * We can get the return value(what is coming out) with a variable of the same type in our case we have public INT
         * findTheSum(int x, int y) so we would need to set the call equal to int
         * lets say we need to multiply two numbers alot, here is an example
         */
        public int multiply(int x, int y) {
        return x * y;
    }
    //Now lets run it
    int total = obj.multiply(5, 7);
    int total2 = obj.multiply(7, 9);
    /**
     * Now lets talk about classes and object briefly so that you can use methods
     * Methods must be called from what is called an object.  This is a class and can be created by
     * using the new class button in your ide and naming it something; say: myClass
     * in that class you would create the method and then in ANOTHER class
     * you can run your method by creating an instance of the class
     * We can do this with the new keyword
     * nameOfClass identifier = new nameOfClass();
     * so in our case we would say myClass object1 = new myClass();
     * Now we can call the method from that object becuase it is in that class by saying the identifier and then
     *
     * dot the method name, so
     * int out = object1.multiply(6, 8);
     * This is why I said obj.method(); above to show this concept
     *
     */

    }





    }

}
