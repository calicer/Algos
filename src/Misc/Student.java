package Misc;

public class Student {

    private final String name;
    private final int rollNo;
    //private final Map<String, String> metaData;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

//    public Student (String name, int rollNo, Map<String, String> metaData){
//            this.name = name;
//            this.rollNo = rollNo;
//
//            Map<String, String> m = new HashMap<>();
//
//            for(Map.Entry<String, String> e : metaData.entrySet()){
//                m.put(e.getKey(), e.getValue());
//            }
//
//            this.metaData = m;
//    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

//    public Map<String, String> getMetaData(){
//        Map<String, String> tempMap = new HashMap<>();
//
//        for(Map.Entry<String, String> e : this.metaData.entrySet()){
//            tempMap.put(e.getKey(), e.getValue());
//        }
//        return tempMap;
//    }
}
