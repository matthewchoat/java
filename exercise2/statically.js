class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    static glue = "Epoxy";
    jello = "Jello";

    static moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        Statically.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        Statically.stubborn();
        console.log(Statically.glue);
        console.log("The static keyword does behave similarly as a kind of global access modifier in JS as it does in Java, because both operate in the class instead of the instance. This is why I had to change the 'stats.methods()' and 'stats.glue' calls to the class name 'Statically' to get them to work. A static class can return an instance in both JS and Java. The way it accesses variables is also the similar. The 'static' keyword seems to be used far less in JS than in Java. This is most likely the case because JS isn't always using OOP principles such as encapsulation/abstraction and often relies on functional programming methodologies.");
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

Statically.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(Statically.glue);
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
