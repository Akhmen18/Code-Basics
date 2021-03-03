main(){
  final int a = 1;
  const int b = 3; 

  /* Constants cannot be changed after its created. 
      Same goes with Final. A final variable can be set only once.
      Whereas a const is a compile-time constant
      A const can't have aceess to anything during runtime
      eg: const b = DateTime.now() won't work properly.
      Whereas final b = DateTime.now() will work as at any point of time during the execution
      the DateTime can be called for the object. Whereas with const, its calculated during compilation which wont give us the DateTime required.*/

  print(a);
  print(b);

}