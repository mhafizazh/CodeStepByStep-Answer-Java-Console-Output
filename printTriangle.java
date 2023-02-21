/*
Write a method named printTriangle that uses for loops to produce the following output:

#
##
###
####
#####
######
 */
public class printTriangle {
    static void printTriangle(){

        for (int i = 0; i <=5; i++){
            for (int j = 0; j<i; j++){
                System.out.print("#");
            }
            System.out.println("#");
        }
    }

    public static void main(String[] args) {
        printTriangle();
    }
}
