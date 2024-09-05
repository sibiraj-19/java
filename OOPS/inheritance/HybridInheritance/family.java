package HybridInheritance;

class GrandMother {
    public void showG() {
        System.out.println("Grandmother.");
    }
}

class Mother extends GrandMother {
    public void showM() {
        System.out.println("Mother.");
    }
}

class Daughter extends Mother {
    public void showD() {
        System.out.println("Daughter");
    }
}

 class Son extends Mother {
    public void showS() {
        System.out.println(" Son");
    }
}

public class family {
    
    public static void main(String args[]) {
        Daughter obj = new Daughter();
        obj.showD();
        obj.showM();
        obj.showG();
        Son obj2 = new Son();
        obj2.showS();
        obj2.showM();
        obj2.showG();
    }
}
