package task2;
//Если значение null, то параметр не должен попадать в запрос.
// "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"; 
public class main {
    public static void main(String[] args) {
        String[] arr = null;
        String str = "{"+"name"+":" + "Ivanov"+"," + "country" + ":"+ 
        "Russia"+","+"city"+ ":"+"Moscow"+","+"age"+":"+"null"+ "}";
        stringWriter(str, arr);
    }

    public static void stringWriter(String str, String[] arr) {
        str = str.replace("{", "");
        str = str.replace("}", "");
        str = str.replaceAll(":", ",");
        arr = str.split(","); 
        for (int i = 0; i < arr.length; i=i+2) {
            if (arr[i+1].contains("null") == false)
                System.out.println(arr[i]+" = " + arr[i+1]);
        }  

    }

}   
