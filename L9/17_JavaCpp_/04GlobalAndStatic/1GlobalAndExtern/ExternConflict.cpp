//A quick file to test out 
// whether C++ extern can cause a linker 
// conflict. I.e. in the case where
// there's forward usage, and a possible
// extern'al variable reference
// [Try compiling the two Exern...cpp files and see the
//		compile errors]
 int i;

 void func(){
	i += 33;
 }