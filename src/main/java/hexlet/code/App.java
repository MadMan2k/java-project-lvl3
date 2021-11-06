package hexlet.code;

public class App {
    public static void main(String[] args) {
//
//        Validator v = new Validator();
//
//        System.out.println("//////////////////////////////number schema//////////////////////////////////////////");
//        NumberSchema numberSchema = v.number();
//
//        System.out.print("0 : true - ");
//        System.out.println(numberSchema.positive().isValid(null)); //true
//        System.out.print("1 : true - ");
//        System.out.println(numberSchema.isValid(null)); // true
//
//        numberSchema.required();
//
//        System.out.print("2 : false - ");
//        System.out.println(numberSchema.isValid(null)); // false
//        System.out.print("3 : true - ");
//        System.out.println(numberSchema.isValid(10)); // true
//        System.out.print("4 : false - ");
//        System.out.println(numberSchema.isValid("5")); // false
//        System.out.print("5 : true - ");
//        System.out.println(numberSchema.positive().isValid(10)); // true
//        System.out.print("6 : false - ");
//        System.out.println(numberSchema.isValid(-10)); // false
//
//        numberSchema.range(5, 10);
//
//        System.out.print("7 : true - ");
//        System.out.println(numberSchema.isValid(5)); // true
//        System.out.print("8 : true - ");
//        System.out.println(numberSchema.isValid(10)); // true
//        System.out.print("9 : false - ");
//        System.out.println(numberSchema.isValid(4)); // false
//        System.out.print("10 : false - ");
//        System.out.println(numberSchema.isValid(11)); // false
//
//        System.out.println();
//        System.out.println("///////////////////////////////////string schema//////////////////////////////////////");
//
//        StringSchema stringSchema = v.string();
//
//        System.out.print("1 : true - ");
//        System.out.println(stringSchema.isValid("")); //true
//        System.out.print("2 : true - ");
//        System.out.println(stringSchema.isValid(null)); //true
//
//        stringSchema.required();
//
//        System.out.print("3 : true - ");
//        System.out.println(stringSchema.isValid("what does the fox say")); // true
//        System.out.print("4 : true - ");
//        System.out.println(stringSchema.isValid("hexlet")); // true
//        System.out.print("5 : false - ");
//        System.out.println(stringSchema.isValid(null)); // false
//        System.out.print("6 : false - ");
//        System.out.println(stringSchema.isValid(""));; // false
//        System.out.print("7 : true - ");
//        System.out.println(stringSchema.minLength(4).isValid("hexlet")); //true
//        System.out.print("8 : false - ");
//        System.out.println(stringSchema.minLength(4).isValid("Hex")); //false
//        System.out.print("9 : true - ");
//        System.out.println(stringSchema.contains("what").isValid("what does the fox say")); //true
//        System.out.print("10 : false - ");
//        System.out.println(stringSchema.contains("whatthe").isValid("what does the fox say")); //false
//
//        System.out.println();
//        System.out.println("//////////////////////////////map schema//////////////////////////////////////////");
//
//        MapSchema mapSchema = v.map();
//
//        System.out.print("1 : true - ");
//        System.out.println(mapSchema.isValid(null)); // true
//
//        mapSchema.required();
//
//        System.out.print("2 : false - ");
//        System.out.println(mapSchema.isValid(null)); // false
//        System.out.print("3 : true - ");
//        System.out.println(mapSchema.isValid(new HashMap())); // true
//
//        Map<String, String> data = new HashMap<>();
//        data.put("key1", "value1");
//
//        System.out.print("4 : true - ");
//        System.out.println(mapSchema.isValid(data)); // true
//
//        mapSchema.sizeof(2);
//
//        System.out.print("5 : false - ");
//        System.out.println(mapSchema.isValid(data));  // false
//
//        data.put("key2", "value2");
//
//        System.out.print("6 : true - ");
//        System.out.println(mapSchema.isValid(data)); // true
//
//        Map<String, BaseSchema> schemas = new HashMap<>();
//        schemas.put("name", v.string().required());
//        schemas.put("age", v.number().positive());
//        mapSchema.shape(schemas);
//
//        Map<String, Object> human1 = new HashMap<>();
//        human1.put("name", "Kolya");
//        human1.put("age", 100);
//        System.out.print("1 : true - ");
//        System.out.println(mapSchema.isValid(human1)); // true
//
//        Map<String, Object> human2 = new HashMap<>();
//        human2.put("name", "Maya");
//        human2.put("age", null);
//        System.out.print("2 : true - ");
//        System.out.println(mapSchema.isValid(human2)); // true
//
//        Map<String, Object> human3 = new HashMap<>();
//        human3.put("name", "");
//        human3.put("age", null);
//        System.out.print("3 : false - ");
//        System.out.println(mapSchema.isValid(human3)); // false
//
//        Map<String, Object> human4 = new HashMap<>();
//        human4.put("name", "Valya");
//        human4.put("age", -5);
//        System.out.print("4 : false - ");
//        System.out.println(mapSchema.isValid(human4)); // false
//
//        System.out.println();
//        System.out.println("//////////////////////////////map schema 2//////////////////////////////////////////");
//
//        MapSchema mapSchema2 = v.map();
//
//        Map<String, BaseSchema> schemas2 = new HashMap<>();
//        schemas2.put("name", v.string().required().contains("ya"));
//        schemas2.put("age", v.number().positive());
//
//        mapSchema2.shape(schemas2).sizeof(2).required();
//
//        Map<String, Object> actual5 = new HashMap<>();
//        actual5.put("name", "Valya");
//        actual5.put("age", -5);
//        System.out.print("1 : false - ");
//        System.out.println(mapSchema2.isValid(actual5)); //.isFalse();
//
//        Map<String, Object> actual6 = new HashMap<>();
//        actual6.put("name", "Ada");
//        actual6.put("age", 15);
//        System.out.print("2 : false - ");
//        System.out.println(mapSchema2.isValid(actual6)); //.isFalse();
    }
}
