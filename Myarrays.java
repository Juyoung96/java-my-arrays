public class Myarrays {

public static void main( String[]args ) {

char ch[] = new char[26]
int index = 0;

// For Loop 1
for( int x=65; x<91; x++){
//System.out.println( (char) x );
ch[index] = (char) x;
System.out.println( ch[index] );
index++;
}

for( int i=0; i<ch.length-1; i++ ) {
System.out.print( ch[i] + ", " )
}
System.out.println( ch[25] )
} // END main method
} // END class
