package Chapter3;

 

public class task4 {

    static String toCapitalizeFirstOnly(String word){

        return word.substring(0,1).toUpperCase()

        + word.substring(1).toLowerCase();

    }

    public static void main(String[] args) {

        String name = "fluffy";

        String a = "1";

        a = "0";

        a+="2";

        a+="3";

        String b = "1";

        String name2 = "fluffy";

        name = null;

        name2 = null;

        String name3 = new String("fluffy");

        System.out.println(a);

        String word1 = "Stand alone";

        System.out.println(word1.toUpperCase());

        word1= word1.toUpperCase();

        System.out.println(word1.toLowerCase());

        System.out.println(word1);

        String trimSample = " \t \n \t Sycriz lee \t \n";

        System.out.println(trimSample.trim());

        System.out.println(toCapitalizeFirstOnly("STUDENT"));

        String p = "abc"; //@21

        String o = "abc"; //@21

        p=null;

        o=null;

        p="abc";//@21

        System.out.println(p.toUpperCase());

        p=p.toUpperCase();

        System.out.println(p);

        System.out.println(p);

        StringBuilder sb = new StringBuilder("sycriz");

        String nameKo = "sycriz";

        StringBuilder sb2 = new StringBuilder("crizsy");

        System.out.println(sb.toString().equals(sb2.reverse().toString()));

        Cat cat1 = new Cat();

        cat1.name = "orange";

        cat1.age =1;

        System.out.println(cat1);

        System.out.println(nameKo==sb.toString());

        System.out.println(nameKo.equals(sb.toString() ));

        

    }

}

class Cat{

    String name;

    int age;

 

    @Override

    public String toString(){

        return "My name is "+name+" and I'm "+age+" year/s old";

    }

}