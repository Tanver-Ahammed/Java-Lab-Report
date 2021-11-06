class StaticMethod {
    static String firstName, lastName;
    String mobile;

    /* Here problem:
     *  object reference is not same, so jvm can't find out the
     *  right reference so, we can see null mobile number.
     *  Here, change object reference so change the object HashCode();
     * */
    public static void display(StaticMethod staticMethod) {
        StaticMethod obj = new StaticMethod();
//        obj.mobile = mobile;
        System.out.println("First Name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("mobile: " + staticMethod.mobile);
    }

    public void show(StaticMethod staticMethod) {
        display(staticMethod);
    }
}

public class Main {
    public static void main(String[] args) {
        StaticMethod staticMethodObj = new StaticMethod();
        StaticMethod.firstName = "Tanver";
        StaticMethod.lastName = "Ahammed";
        staticMethodObj.mobile = "+88211013";

        System.out.println(staticMethodObj.mobile);
        staticMethodObj.show(staticMethodObj);
    }
}