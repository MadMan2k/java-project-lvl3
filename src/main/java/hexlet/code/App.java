package hexlet.code;

public class App {
    public static void main(String[] args) {
//        Validator v = new Validator();
//        NumberSchema schema = v.number();
//
//        System.out.print("1 : true - ");
//        System.out.println(schema.isValid(null)); // true
//
//        schema.required();
//
//        System.out.print("2 : false - ");
//        System.out.println(schema.isValid(null)); // false
//
//        System.out.print("3 : true - ");
//        System.out.println(schema.isValid(10)); // true
//
//        System.out.print("4 : false - ");
//        System.out.println(schema.isValid("5")); // false
//
//        System.out.print("5 : true - ");
//        System.out.println(schema.positive().isValid(10)); // true
//
//        System.out.print("6 : false - ");
//        System.out.println(schema.isValid(-10)); // false
//
//        schema.range(5, 10);
//
//        System.out.print("7 : true - ");
//        System.out.println(schema.isValid(5)); // true
//
//        System.out.print("8 : true - ");
//        System.out.println(schema.isValid(10)); // true
//
//        System.out.print("9 : false - ");
//        System.out.println(schema.isValid(4)); // false
//
//        System.out.print("10 : false - ");
//        System.out.println(schema.isValid(11)); // false

//        Validator v = new Validator();
//        StringSchema schema = v.string();
//
//        System.out.print("1 : true - ");
//        System.out.println(schema.isValid("")); //true
//
//        System.out.print("2 : true - ");
//        System.out.println(schema.isValid(null)); //true
//
//        schema.required();
//
//        System.out.print("3 : true - ");
//        System.out.println(schema.isValid("what does the fox say")); // true
//
//        System.out.print("4 : true - ");
//        System.out.println(schema.isValid("hexlet")); // true
//
//        System.out.print("5 : false - ");
//        System.out.println(schema.isValid(null)); // false
//
//        System.out.print("6 : false - ");
//        System.out.println(schema.isValid(""));; // false
//
//        System.out.print("7 : true - ");
//        System.out.println(schema.contains("what").isValid("what does the fox say")); //true
//
//        System.out.print("8 : false - ");
//        System.out.println(schema.contains("whatthe").isValid("what does the fox say")); //false
//
//        System.out.print("9 : true - ");
//        System.out.println(schema.minLength(6).isValid("hexlet")); //true
//
//        System.out.print("10 : false - ");
//        System.out.println(schema.minLength(6).isValid("Hex")); //false

//        Validator v = new Validator();
//        MapSchema schema = v.map();
//
//        System.out.print("1 : true - ");
//        System.out.println(schema.isValid(null)); // true
//
//        schema.required();
//
//        System.out.print("2 : false - ");
//        System.out.println(schema.isValid(null)); // false
//
//        System.out.print("3 : true - ");
//        System.out.println(schema.isValid(new HashMap())); // true
//
//        Map<String, String> data = new HashMap<>();
//        data.put("key1", "value1");
//
//        System.out.print("4 : true - ");
//        System.out.println(schema.isValid(data)); // true
//
//        schema.sizeof(2);
//
//        System.out.print("5 : false - ");
//        System.out.println(schema.isValid(data));  // false
//
//        data.put("key2", "value2");
//
//        System.out.print("6 : true - ");
//        System.out.println(schema.isValid(data)); // true
//
//        Validator v = new Validator();
//        MapSchema schema = v.map();
//
//        Map<String, BaseSchema> schemas = new HashMap<>();
//        schemas.put("name", v.string().required());
//        schemas.put("age", v.number().positive());
//        schema.shape(schemas);
//
//        Map<String, Object> human1 = new HashMap<>();
//        human1.put("name", "Kolya");
//        human1.put("age", 100);
//        System.out.print("1 : true - ");
//        System.out.println(schema.isValid(human1)); // true
//
//        Map<String, Object> human2 = new HashMap<>();
//        human2.put("name", "Maya");
//        human2.put("age", null);
//        System.out.print("2 : true - ");
//        System.out.println(schema.isValid(human2)); ///////////////// true //////////////////////////
//
//        Map<String, Object> human3 = new HashMap<>();
//        human3.put("name", "");
//        human3.put("age", null);
//        System.out.print("3 : false - ");
//        System.out.println(schema.isValid(human3)); // false
//
//        Map<String, Object> human4 = new HashMap<>();
//        human4.put("name", "Valya");
//        human4.put("age", -5);
//        System.out.print("4 : false - ");
//        System.out.println(schema.isValid(human4)); // false

    }
}
