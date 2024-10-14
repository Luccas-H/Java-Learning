public class Main {
    public static void main(String[] args) {
        int[] ages = {20,35,19,20,40,50};
        int majorAge = 0;

        for(int i = 0; i < ages.length; i++){
            for(int j = ages.length - 1; j >= 0; j--)
            {
               if (ages[i] != ages[j]){
                   if(ages[i] > ages[j] && ages[i] > majorAge){
                       majorAge = ages[i];
                   }else if(ages[j] > majorAge){
                       majorAge = ages[j];
                   }
               }
            }
        }
        System.out.println(majorAge);
    }
}