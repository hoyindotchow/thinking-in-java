# Thinking In Java - Chapter 1


## Everything Is An Object


When most people think of programming, they think of it as something only really really smart people do. Programming is often times represented as hundreds upon thousands of lines of code that smart people just throw on a computer. Java is no exception in that it's often regarded as another programming language used by us programmers, or that it's coffee. Either way though Java is much more than that, and like anything, once you really get to know something you can at least appreciate it for what it is, even if you don't like it.


Java is known as an "_Object Oriented Language_". Let's first tackle the idea behind _Language_. Believe it or not, Java is a language, and with every language it can be used to express one's thoughts, emotions and essentially one's self. Well, okay maybe it doesn't do all that, but it does have a way of expressing code in a particular way. With any programming language (and Java being no exception) it follows a specific set of rules, patterns and so own in order to achieve it's goal of creating programs and applications.


_Object Oriented_ is a way of saying that everything in Java is an _object_ in one way or another. Now one may be a little bit intimitated with the term _object_ because we're talking about programming and programming is difficult and what not. But it's actually no different in the programming world as it is in real life. The only difference is the way we look at it. We can both look at an object in real life, like a car, a computer, a dog, or something in between and say "Yeah, all those things are objects." Objects are typically nouns, persons, places or things. Now objects all have specific characteristics, cars can be red, computers can be powerful or dogs can be cuddly. To a programmer, those characteristics are important, and those are things that we need to be able to express in our code in one way or another. So programmers like to be very methodical and detail oriented when they think about an objects characteristics.


Objects, or things, can also do something, even if that something is just sit there. We as programmers are also very interested in what an object can do as well. A dog can bark, a car can speed down the highway, a computer can process our code and make it do cool things and so on and so forth. Just like in English, when a dog makes a loud noise from it's mouth we say it's a bark, in Java we can also express a dog bark through the code we write. And this is where the magic of programming in general comes into play. We as programmers decide the objects we create, what they attributes or characteristics are AND what they are able to do or not do. As programmers we get to create objects like a tv and decide how big the screen is (a characteristic or attribute of the tv) and if it can display a movie in ultra 4k HD (a functionality of the tv).


## References and Objects
Now in real life a tv is really annoying to change channels and control the volume if you have to get up and mess with the tv directly. Luckily in real life we have a remote that can control the tv for us. In the programming world there is also a "remote" for objects known as a _reference_. The reference is what is used to manipulate an object in the programming world. More often then not, when we are discussing manipulating objects, we are technically using a reference to manipulate the object, very much like a remote is used to control or manipulate a tv. And just like in real life, when you tell someone "Hey, turn down the TV" they know that you mean get the remote and turn down the volume. That is also the same in the programming world when we say, we do something to an object, we are really using a reference to control the object.


Now we can't just pick up any remote and make it work on a tv, the same can be said about references and objects. The manufacturers of a tv, created the tv and also created a remote that works with that tv specifically. In the programming world we are the manufacturer of both the "tv" and the "remote". As programmers we are the creators of the object as well as the creators of the reference (or remote). Now again, Java is a language, so it follows a specific way of doing things, or _syntax_ as we say in the programming world. Let's pretend we are a tv manufacturer called Fony and we want to create a remote for a specific tv. 


The syntax to create a tv with a remote is as follows:


	FonyTV tvRemote = new FonyTV();

Let's breakdown this line of code here and talk about what's going on. On the left of the equal sign we're saying from the `FonyTV` manufacturer we going to create a reference called "`tvRemote`". To the right of the equal sign we are creating a new `FonyTV`. In this case, our `FonyTV` is the object we're creating. The syntax to create any object in Java is `new ObjectWeWantToCreate()`. If we wanted to create the FonyTV a certain way, we can specify how to make it by putting something in the parenthesis. Finally the equal sign connects our `tvRemote` to our newly created `FonyTV`.


## Primitive Types


Now we've see how to create objects and have a reference that connects to an object. All we need to do is specify from which "manufacturer" (we'll discuss this soon) our remote is being built from and to have our manufacturer create a new object. Now the big thinkers at Java knew that there would be specific objects that we would need to create all the time. And with every object that is created we have to create a reference to connect to the object so that we can manipulate it. So the thinkers of Java set aside a number of objects that we can create using a shorthand syntax. Kind of like in English how we can shorten sets of words using contractions (do not = don't , should not = shouldn't). These set aside objects are known as _primitive types_.


First let's list out all the primitive types:


* boolean
* char
* byte
* short
* int
* long
* float
* double


Now you can use the "traditional" way of creating objects as well, but the primitive types use the following special syntax;


	int i = 10;
	
We see here that this is a much shorter notation than our previous. There is no `new Integer` on the other side making it much easier to churn out these objects very easily. 


## Scope Of An Object


The scope of an object is also an important concept. When we are creating an object we can restrict it to specific areas of our code. The way this is done is through curly braces or these things "{  }  " Everything that is contained within the opening and closing curly braces is in it's own little bubble. You are also able to have curly braces inside of curly braces, or bubbles inside of bubbles. So the objects in inner curly braces can access the objects of the outer curly braces but not vice versa. 


Here's an example:


	{
		myObjectOuside
		{
			myObjectInside
		}
	}
	
In this example here, the inner curly braces(the ones that have `myObjectInside`) we are able to control `myObjectInside` and `myObjectOutside`. The curly braces on the outside, we are only able to control just `myObjectOutside`.


## Creating New Data Types: Class


