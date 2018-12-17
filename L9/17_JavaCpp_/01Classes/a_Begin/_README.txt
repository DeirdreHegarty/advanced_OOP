//compile and execute statements

//1.compile: creates a test.exe file 
>g++ -o test Test.cpp Foo.cpp Foo.h

//execute: prints "doX() running"
>./test

//2. compile with Foo2.cpp this time
>g++ -o test Test.cpp Foo.cpp Foo.h

//execute: prints "Foo2.cpp: doX() running"
>./test


