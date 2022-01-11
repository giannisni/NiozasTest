// Please read Deloitte Social pdf before you start coding, thanks! //

public class Main {
  public static void main(String[] args) throws Exception {
    //
    // Examples
    //
    System.out.println(whoLikedMe(new String[] {})); // must be "no one likes this"
    System.out.println(whoLikedMe(new String[] { "John" })); // must be "John likes this"
    System.out.println(whoLikedMe(new String[] { "John", "Alicia" })); // must be "John and Alicia like this"
    System.out.println(whoLikedMe(new String[] { "John", "Alicia", "Mark" })); // must be "John, Alicia and Mark like this"
    System.out.println(whoLikedMe(new String[] { "John", "Alicia", "Mark", "Alex" })); // must be "John, Alicia and 2 others like this"

    System.out.println(complexId(454)); // 162516
    System.out.println(complexId(2233)); // 4499
    System.out.println(complexId(9118)); // 811164

     System.out.println(isValid(new char[] { 'n', 'e', 'w', 's' })); // false
    System.out.println(isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' })); // true
    System.out.println(isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 'n' })); // false
    System.out.println(isValid(new char[] { 'n', 'e', 'w', 's', 'n', 'e', 'w', 's', 'n', 's' })); // true
  }

  public static String whoLikedMe(String[]  names) {

    if (names.length==0){
      return "no one likes this";
    }
    else if(names.length==1){
      return names[0]+ " likes this"; 
    }
    else if(names.length==2){
      return names[0] + " and " + names[1] + " like this"; 
    }
    else if ( names.length==3){

      return names[0] + ", "+ names[1]+ " and " + names[2] + " like this";
    }
    else if(names.length>=4){
      return names[0] + ", "+ names[1]+ " and " +  (names.length-2) +  " others like this" ;
    }
    return null;

   // return null;
  }

  public static int complexId(int postId) {
   String result = ""; 
    
    while (postId != 0) {
      int digit = postId % 10 ;
      result = digit*digit + result ;
      postId /= 10 ;
    }
    return  Integer.parseInt(result) ;
  }

  public static boolean isValid(char[] steps) {
  
    int count[] = new int[4];

    if (steps.length==10){

      for(int i=0;i<count.length;i++){

          count[i] = 0;
      }


      for (int i=0; i<steps.length; i++){
        if (steps[i] =='n') {
          count[0]++;
        }
        else if (steps[i]=='e'){
          count[1]++;
        }
        else if (steps[i]=='w'){
          count[2]++;
        }
        else if (steps[i]=='s'){
          count[3]++;
        }
      }

      
      if ((count[0]==count[3])&&(count[1]==count[2])){
        return true;
      }
      else{
        return false;
      }


    }
    else{
       return false;
    }
   
  
}}