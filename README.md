## Cats effect Decline example

### Composable command-line parsing for Scala

https://ben.kirw.in/decline/

## Using in an effectful manner

Just run the below examples, replacing ```com.felstar.HelloWorld``` with ```com.felstar.HelloWorldIO```

### To run

Run it with no params
```
sbt "runMain com.felstar.HelloWorld" 
```

Run it with --help param, displays the help for the app and its params
```
sbt "runMain com.felstar.HelloWorld --help" 
```

Run it with --target param
```
sbt "runMain com.felstar.HelloWorld --target Dino" 
```

Run it with -t short param
```
sbt "runMain com.felstar.HelloWorld -t Ralf" 
```

Run it with positional params
```
sbt "runMain com.felstar.HelloWorld Dave Ralf" 
```

Run it with forbidden name for positional param
```
sbt "runMain com.felstar.HelloWorld John" 
```

Run it with refined number that doesn't match PosInt
```
sbt "runMain com.felstar.HelloWorld --posInt -123" 
```

Run it with unparseable number
```
sbt "runMain com.felstar.HelloWorld --posInt woof" 
```




