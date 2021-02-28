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
}

  // Functions
  void basicFunction(){

  }

  void secondLevelFunctions(int n){
    print('Number is: $n');
  }

  void addition(int a, int b){
    int add = a + b;
    print('Addition is: $add');
  }