public class TestValue {
    public static void main(String[] args){
        IntValue val1 = new IntValue();
        IntValue val2 = new IntValue();
        IntValue val3 = new IntValue();
        

        // Test One
        val1.setInputParameters(1,99,"Type a number: ");
        val1.getValue();

        // Test Two
        val2.setInputParameters(5,100,"Type a number: ");
        val2.getValue();

        // Test Three
        val3.setInputParameters(0,200,"Type a number: ");
        val3.getValue();

    }
    
}
