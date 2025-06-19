class Variables {
    // Types of variables:
    // Instance, Static, Local

    // Instance Variable
    String Name;

    // Static Variable
    static int number = 10;

    // Instance Method with Local Variables
    int addition() {
        int a = 10;    // Local variable
        int b = 5;     // Local variable
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Variables v1 = new Variables();
        Variables v2 = new Variables();
        Variables v3 = new Variables();
        Variables v4 = new Variables();

        // Assign instance variable values
        v1.Name = "Shreya";
        v2.Name = "Shre";

        // Static variable access
        System.out.println("Static variable: " + v3.number);

        // Local variable output
        System.out.println("Local variable (sum from addition()): " + v4.addition());

        // You can also print instance variables:
        System.out.println("Instance variable v1.Name: " + v1.Name);
        System.out.println("Instance variable v2.Name: " + v2.Name);
    }
}

