package Object_Oriented.Inheritance;
interface Worker {
    void performDuties();
}

class Persons {
    String name;
    int id;
}

class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Cooking food");
    }
}

class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Serving customers");
    }
}

