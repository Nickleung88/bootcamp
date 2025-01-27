// Deserialization (反序列化)
// From JSON to Java Object

// Serialization (序列化)
// From Java Object to JSON
class Person {
    private String name;
    private Address address;
    
    public static class Address {
        private String line1;
        private String line2;
        private String line3;
    }
}