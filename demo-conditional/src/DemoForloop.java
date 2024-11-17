public class DemoForloop {
 public static void main(String[] args) {
  // for loop
  // step 1: "int =0"
  // step 2: check if i<5  -> true
  // Step 3 : print hello
  // step 4: back to i++  -> become 1
  // step 5: check if i<5   -> true
  // Step 6: print hello
  // Step 7: back to i++ -> i become 2
  // Step 8 : check if i<3 -> true
  // Step 9 :print hello
  // Step 10 :back to i++ i become 3
  // step 11: check if i<3 -> false
  // step 12: exit loop
  
  

  for (int i=0; i<3; i++){
    System.out.println("hello");
  }

  // 4 times
  for (int i=0 ; i<4; i++){
    System.out.println(i);
  }
// 0    
// 1    
// 2    
// 3 


// sum up 1-10
int sum=0;
for (int i=1; i<11; i++){
  System.out.println(i);
  sum += i;// read or wiret on variable sum
}
System.out.println(sum); //55;

// sum up all even between 1-20
sum=0;  // reset the "sum"
for (int i=1; i<21; i++){
  if (i%2==0){
    sum += i;
  }
}
System.out.println(sum);


// sum up all even , and minus all odd numbers, between 1-20 
sum=0;  // reset the "sum"
for (int i=1; i<21; i++){
  if (i%2==0){
    sum += i;
  }else{
    sum -= i;
  }
}
System.out.println(sum); //10

// print out 10 8 6 4 2 0
 for (int i=10; i>0; i--){
  if (i%2==0){
    System.out.println(i);
  }
 }
//  10
//  8
//  6
//  4
//  2


for (int i=0; i<10; i++){
  if (i%2==0){
    System.out.println(10-i);
  }
 }
//  10
//  8
//  6
//  4
//  2

// String
String s = "abcdefg";
// output: aceg
// charAt(), for loop i -> can be index
int output =0;
for (int i=0; i<s.length(); i++){
  if (i%2==0){
output += s.charAt(i); //String + char -> String
  }
 }
 System.out.println(output);//aceg

//counting
String s2 = "bbbbaaaayfhaad"; // a->6
char target = 'a';
int count = 0;
for (int i=0; i<s2.length(); i++){
  if (s2.charAt(i) == 'a'){
    count++;
  }
}

System.out.println(count); //6

// how many numbers can be divided by 3 or 4 between 1-100?

int count2=0;
for (int i=1; i<=100; i++){
if (i%3==0 ||i%4==0) {
  count2++;
}
}
System.out.println(count2);


String s3 = "abcdabcdabcd";
// print out the last index of C, if not found, print out -1
// Do not use lastIndexOf()
int index = -1;
for (int i=0; i<s3.length(); i++){
  if (s3.charAt(i)=='c'){
    index = i;
  }
}
  System.out.println(index);//10 
  
  //Alternative: lastIndexOf
  System.out.println(s3.lastIndexOf('c')); //10
  System.out.println(s3.indexOf('c')); //2, the first index of c
  System.out.println(s3.indexOf("cda")); //2, the first index of cda

  //contains
  System.out.println(s3.contains("dab")); // true

  //substring (fromIndex, toIndex-1)
  System.out.println(s3.substring(1,3)); //bc

  //substring (print the last 2 character as string)
  System.out.println(s3.substring(s3.length()-2, s3.length()));  //cd
  System.out.println(s3.substring(s3.length()-2));  //cd

  //continue and break
  //break: exit the nearest loop block
  for (int i=0; i<5 ;i++){
    System.out.println("i=" +i);
    if (i>2){
      break;  // break usually put at the end.
    }
  }
  //continue
  //print the odd number
  //continue : early exit iteration

    for (int i=0; i<5 ;i++){
    if (i%2==0){
      continue;  // skip the rest, and back to i++.
    }
    System.out.println(i);
  }

  for (int i=0; i<10 ;i++){
    if (i%2==0){
      continue;  // skip the rest, and back to i++.
    }
    if (i%2==1 && (i<3 || i>7)){
      System.out.println(i);
      continue; // skip the rest, and back to i++.
    }
  }



  //12345
  for (int i=1; i<6; i++){
    System.out.println(i);
  }


  //Nested loop
  for (int i=0; i<4; i++){
    for (int j=0; j>6; i++)
  }


// *****
// ****
// ***
// **
// *
// int n=5;
// nested loop

// *
// ***
// *
// 
// n=3



 }
}
