package Activities;



    public class Activity8{
        public static void main(String args[]){
    
            try{
    
                Activity8.exceptionTest("Will prnit to console");
                Activity8.exceptionTest(null);
                Activity8.exceptionTest("Wont execut");
            } catch(CustomException mea){
                System.out.println("Inside catch block: " +mea.getMessage());
            }
        }
    
            static void exceptionTest(String str) throws CustomException{
                if(str == null){
                    throw new CustomException("String value is null");
                }else {
                    System.out.println(str);
                }
            }
        }
    
    
          



