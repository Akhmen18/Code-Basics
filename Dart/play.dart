main(){
  print("Base Code");

  int a = 12;
  print(a);

  secondLevelFunctions(10);

  addition(10, 20);

  List<String> myStringList = [
    'Name',
    'Hello',
    'Test',
  ];

  print(myStringList);
  print(myStringList[2]);
  print(myStringList.indexOf('Name')); // to find index from value

  myStringList.add('Byeeee');
  print(myStringList[3]);

  myStringList.insert(2, 'LOLOLOL');
  print(myStringList);

  myStringList.insert(2, '0605LOLOLOL');
  print(myStringList);

  final int avar = 1;
  const int bvar = 3; 

  /* Constants cannot be changed after its created. 
      Same goes with Final. A final variable can be set only once.
      Whereas a const is a compile-time constant
      A const can't have aceess to anything during runtime
      eg: const b = DateTime.now() won't work properly.
      Whereas final b = DateTime.now() will work as at any point of time during the execution
      the DateTime can be called for the object. Whereas with const, its calculated during compilation which wont give us the DateTime required.*/

  print(avar);
  print(bvar);
}

  // Functions
  void basicFunction(){
    print('Hello');

  }

  void secondLevelFunctions(int n){
    print('Number is: $n');
  }

  void addition(int a, int b){
    int add = a + b;
    print('Addition is: $add');
  }

