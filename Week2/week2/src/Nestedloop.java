public class Nestedloop {
    public static void main(String[] args) {
        for (int i= 0; i<11; i++){
            if (i%2==1);
            System.out.println("Approch 1:" +i); //  0 1 2 3 4 5 6 7 8 9 10 -> 11 times
        } 

        for (int i= 10; i>0; i--){
            if (i%2==1);
            System.out.println("Approch 2:" +i);
        }
        String str1 = "ABCDEFGHIJKLM";
        char ch1='F';
        int index = 0;
        //find the index of F within str1
        for (int i=0; i<str1.length();i++){
            if (str1.charAt(i)==ch1){
                index=i;
                System.out.println("i:" + i);

            }
        }
        System.out.println("index:" + index);




        int count=0;
        for (int i= 1; i<101; i++){
            if (i%3==0 || i%4==0){
            count++;
            //count + 1
            // *=
            // i += 1// i=i+1
            // +=, -=, *=, /=  redeclare itself
            // 
        }
        }
            System.out.println("count:" + count);

            


        //1-50
        int total=0;
        for (int i=1; i<51; i++){
            if (i%2!=0){
                total += i;
            } else { //if (i%2=0)
                total -= i;
        }}
        System.out.println("total="+ total);




        for (int i=0; i<5; i++){
    for (int j=0;j<5;j++){
}
}

int count2=0;
for (int i=0; i<5; i--){
    for (int j=0;j<5;j++){
}
}

//***** -> i=0
//**** -> i=1
//*** -> i=2
//** -> i=3
//* -> i=4


// length(), substring(), charAt(). equals(). indexof()
// if (condition is true) {// no ; after blacket
// do something}

//optional
//for loop








    }
    
}
  