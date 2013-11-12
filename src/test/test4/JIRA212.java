package test4;

public class JIRA212 {
    public void test() {
        TestObject object = new TestObject();
        object.name = "test";

        try {
            object.id = 100;
            String name = object.name;
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    static class TestObject {
        public Integer id;
        public String name;

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
